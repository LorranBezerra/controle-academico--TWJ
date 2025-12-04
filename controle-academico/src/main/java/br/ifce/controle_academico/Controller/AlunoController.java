package br.ifce.controle_academico.Controller;

import br.ifce.controle_academico.model.Aluno;
import br.ifce.controle_academico.model.StatusAluno;
import br.ifce.controle_academico.repository.AlunoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public String listar(Model model) {
        List<Aluno> lista = alunoRepository.findAll();
        model.addAttribute("alunos", lista);
        return "alunos/list"; // src/main/resources/templates/alunos/List.html
    }

    @GetMapping("/novo")
    public String novoForm(Model model) {
        model.addAttribute("aluno", new Aluno());
        model.addAttribute("statusValues", StatusAluno.values());
        return "alunos/form"; // form de cadastro
    }

    @PostMapping("/salvar")
    public String salvar(@Valid Aluno aluno, BindingResult br, Model model) {
        // validações simples
        if (br.hasErrors()) {
            model.addAttribute("statusValues", StatusAluno.values());
            return "alunos/form";
        }
        // Verifica se matricula já existe
        Optional<Aluno> porMat = alunoRepository.findByMatricula(aluno.getMatricula());
        if (porMat.isPresent() && (aluno.getId() == null || !porMat.get().getId().equals(aluno.getId()))) {
            br.rejectValue("matricula", "error.aluno", "Matrícula já existe.");
            model.addAttribute("statusValues", StatusAluno.values());
            return "alunos/form";
        }
        alunoRepository.save(aluno);
        return "redirect:/alunos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Aluno a = alunoRepository.findById(id).orElseThrow();
        model.addAttribute("aluno", a);
        model.addAttribute("statusValues", StatusAluno.values());
        return "alunos/form";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        alunoRepository.deleteById(id);
        return "redirect:/alunos";
    }
}
