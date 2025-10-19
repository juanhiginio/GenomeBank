package com.juanhiginio.genomeBank.repositories;

import com.juanhiginio.genomeBank.entities.Genoma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenomaRepository extends JpaRepository<Genoma, Long> {
}
