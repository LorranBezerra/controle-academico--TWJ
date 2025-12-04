package br.ifce.controle_academico.Controller;

import br.ifce.controle_academico.model.Matricula;
import br.ifce.controle_academico.model.SituacaoMatricula;
import br.ifce.controle_academico.repository.AlunoRepository;
import br.ifce.controle_academico.repository.DisciplinaRepository;
import br.ifce.controle_academico.repository.MatriculaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

    private final MatriculaRepository matriculaRepository;
    private final AlunoRepository alunoRepository;
    private final DisciplinaRepository disciplinaRepository;

    public MatriculaController(MatriculaRepository matriculaRepository,
                               AlunoRepository alunoRepository,
                               DisciplinaRepository disciplinaRepository) {
        this.matriculaRepository = matriculaRepository;
        this.alunoRepository = alunoRepository;
        this.disciplinaRepository = disciplinaRepository;
    }


    @GetMapping("/matriculas/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        matriculaRepository.deleteById(id);
        return "redirect:/matriculas";
    }

    // LISTAR
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("matriculas", matriculaRepository.findAll());
        return "matriculas/list";
    }

    // FORM DE NOVA MATRÍCULA
    @GetMapping("/nova")
    public String nova(Model model) {
        model.addAttribute("matricula", new Matricula());
        model.addAttribute("alunos", alunoRepository.findAll());
        model.addAttribute("disciplinas", disciplinaRepository.findAll());
        model.addAttribute("situacaoValues", SituacaoMatricula.values());
        return "matriculas/form";
    }

    // SALVAR
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("matricula") Matricula matricula, Model model) {

        // valida duplicata
        var existente = matriculaRepository
                .findByAlunoIdAndDisciplinaId(
                        matricula.getAluno().getId(),
                        matricula.getDisciplina().getId()
                );

        if (existente.isPresent() && !existente.get().getId().equals(matricula.getId())) {
            model.addAttribute("erroDuplicada", "Aluno já matriculado nesta disciplina");
            model.addAttribute("alunos", alunoRepository.findAll());
            model.addAttribute("disciplinas", disciplinaRepository.findAll());
            model.addAttribute("situacaoValues", SituacaoMatricula.values());
            return "matriculas/form";
        }

        matriculaRepository.save(matricula);
        return "redirect:/matriculas";
    }
}
