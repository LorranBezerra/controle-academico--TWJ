package br.ifce.controle_academico.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private String username; // login

    @Column(nullable=false)
    private String password; // senha (criptografada)

    @Column(nullable=false)
    private String role; // ex: ROLE_ADMIN ou ROLE_SECRETARIA
}
