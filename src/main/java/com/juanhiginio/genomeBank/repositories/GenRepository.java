package com.juanhiginio.genomeBank.repositories;

import com.juanhiginio.genomeBank.entities.Gen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenRepository extends JpaRepository<Gen, Long> {
}
