package com.juanhiginio.genomeBank.repositories;

import com.juanhiginio.genomeBank.entities.Cromosoma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CromosomaRepository extends JpaRepository<Cromosoma, Long> {
}
