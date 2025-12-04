package br.ifce.controle_academico;

import br.ifce.controle_academico.model.Usuario;
import br.ifce.controle_academico.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initUsers(UsuarioRepository usuarioRepository, BCryptPasswordEncoder encoder) {
        return args -> {
            if (usuarioRepository.findByUsername("admin").isEmpty()) {
                Usuario admin = Usuario.builder()
                        .username("admin")
                        .password(encoder.encode("admin123"))
                        .role("ROLE_ADMIN")
                        .build();
                usuarioRepository.save(admin);
            }
            if (usuarioRepository.findByUsername("secretaria").isEmpty()) {
                Usuario sec = Usuario.builder()
                        .username("secretaria")
                        .password(encoder.encode("sec123"))
                        .role("ROLE_SECRETARIA")
                        .build();
                usuarioRepository.save(sec);
            }
        };
    }
}
