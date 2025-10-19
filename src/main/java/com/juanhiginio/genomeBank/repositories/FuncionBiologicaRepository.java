package com.juanhiginio.genomeBank.repositories;

import com.juanhiginio.genomeBank.entities.FuncionBiologica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionBiologicaRepository extends JpaRepository<FuncionBiologica, Long> {
}
