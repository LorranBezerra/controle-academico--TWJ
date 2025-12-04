package br.ifce.controle_academico.Controller;

import br.ifce.controle_academico.repository.DisciplinaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final DisciplinaRepository disciplinaRepository;

    public HomeController(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("disciplinas", disciplinaRepository.findAll());
        return "home";
    }
}
