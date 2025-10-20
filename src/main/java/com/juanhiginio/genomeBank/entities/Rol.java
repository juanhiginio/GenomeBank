package com.juanhiginio.genomeBank.entities;

import aj.org.objectweb.asm.commons.Remapper;
import com.juanhiginio.genomeBank.entities.enums.Rols;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "rol")
@Data
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String nombre; // ADMIN, USER, etc.
}
