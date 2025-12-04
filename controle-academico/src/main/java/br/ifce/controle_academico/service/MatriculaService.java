package br.ifce.controle_academico.service;

import br.ifce.controle_academico.model.Matricula;
import br.ifce.controle_academico.repository.MatriculaRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService {
    private final MatriculaRepository matriculaRepository;

    public MatriculaService(MatriculaRepository matriculaRepository) {
        this.matriculaRepository = matriculaRepository;
    }

    public Matricula salvar(Matricula m) {
        // valida duplicata
        Optional<Matricula> existente = matriculaRepository.findByAlunoIdAndDisciplinaId(
                m.getAluno().getId(), m.getDisciplina().getId()
        );
        if (existente.isPresent()) {
            throw new IllegalArgumentException("Aluno já matriculado nessa disciplina");
        }
        if (m.getDataMatricula() == null) {
            m.setDataMatricula(LocalDate.now());
        }
        return matriculaRepository.save(m);
    }

    public List<Matricula> listarTodos() {
        return matriculaRepository.findAll();
    }
}
