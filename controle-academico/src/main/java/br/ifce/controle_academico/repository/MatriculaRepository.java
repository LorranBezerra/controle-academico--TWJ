package br.ifce.controle_academico.repository;

import br.ifce.controle_academico.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    Optional<Matricula> findByAlunoIdAndDisciplinaId(Long alunoId, Long disciplinaId);
}
