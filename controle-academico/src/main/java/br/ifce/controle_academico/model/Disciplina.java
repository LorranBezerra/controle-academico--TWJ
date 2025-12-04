package br.ifce.controle_academico.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Disciplina{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private String codigo; // ex: MAT101

    @Column(nullable=false)
    private String nome;

    private Integer cargaHoraria;

    private String semestre; // ex: "2025.1"
}

