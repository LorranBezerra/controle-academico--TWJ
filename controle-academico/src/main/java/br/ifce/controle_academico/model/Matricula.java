package br.ifce.controle_academico.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"aluno_id", "disciplina_id"})
})
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Aluno aluno;

    @ManyToOne(optional = false)
    private Disciplina disciplina;

    private LocalDate dataMatricula;

    @Enumerated(EnumType.STRING)
    private SituacaoMatricula situacao;

    private Double notaFinal;
}
