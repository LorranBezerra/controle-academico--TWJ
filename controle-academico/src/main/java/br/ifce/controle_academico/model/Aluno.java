package br.ifce.controle_academico.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Aluno{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String nome;

    @Column(nullable=false, unique=true)
    private String matricula;

    @Column(nullable=false)
    private String email;

    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    private StatusAluno status;
}
