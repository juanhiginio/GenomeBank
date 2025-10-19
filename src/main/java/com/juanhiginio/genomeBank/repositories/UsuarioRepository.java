package com.juanhiginio.genomeBank.repositories;

import com.juanhiginio.genomeBank.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
