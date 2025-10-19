package com.juanhiginio.genomeBank.repositories;

import com.juanhiginio.genomeBank.entities.Especie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecieRepository extends JpaRepository<Especie, Long> {
}
