package br.ifce.controle_academico.Controller;

import br.ifce.controle_academico.model.Disciplina;
import br.ifce.controle_academico.repository.DisciplinaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/disciplinas")
public class DisciplinaController {

    private final DisciplinaRepository disciplinaRepository;

    public DisciplinaController(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    // LISTAR
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("disciplinas", disciplinaRepository.findAll());
        return "disciplinas/list";
    }

    // FORM DE NOVA DISCIPLINA
    @GetMapping("/nova")
    public String nova(Model model) {
        model.addAttribute("disciplina", new Disciplina());
        return "disciplinas/form";
    }

    // SALVAR
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("disciplina") Disciplina disciplina, Model model) {

        var existente = disciplinaRepository.findByCodigo(disciplina.getCodigo());
        if (existente.isPresent() && !existente.get().getId().equals(disciplina.getId())) {
            model.addAttribute("erroCodigo", "Código da disciplina já existe");
            return "disciplinas/form";
        }

        disciplinaRepository.save(disciplina);
        return "redirect:/disciplinas";
    }

    // EDITAR
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Disciplina disciplina = disciplinaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido"));
        model.addAttribute("disciplina", disciplina);
        return "disciplinas/form";
    }

    // EXCLUIR
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        disciplinaRepository.deleteById(id);
        return "redirect:/disciplinas";
    }
}
