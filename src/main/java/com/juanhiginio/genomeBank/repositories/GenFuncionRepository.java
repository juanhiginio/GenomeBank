package com.juanhiginio.genomeBank.repositories;

import com.juanhiginio.genomeBank.entities.GenFuncion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenFuncionRepository extends JpaRepository<GenFuncion, Long> {
}
