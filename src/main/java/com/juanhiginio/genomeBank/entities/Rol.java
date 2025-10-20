package com.juanhiginio.genomeBank.entities;

import com.juanhiginio.genomeBank.entities.enums.Rols;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "rol")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // Usamos un nombre más claro para el campo enum
    @Enumerated(EnumType.STRING)
    @Column(name = "nombre", nullable = false, unique = true)
    private Rols nombre;

    // Relación bidireccional con Usuario
    @OneToMany(mappedBy = "rol", fetch = FetchType.LAZY)
    private Set<Usuario> usuarios = new HashSet<>();
}
