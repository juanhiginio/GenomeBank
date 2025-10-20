package com.juanhiginio.genomeBank.repositories;

import com.juanhiginio.genomeBank.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByCorreoelectronico(String nombre);
}
