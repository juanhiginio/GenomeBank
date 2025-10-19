package com.juanhiginio.genomeBank.entities;

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
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol", nullable = false, length = 13, unique = true)
    private Rols rol;

    @OneToMany(mappedBy = "rol", fetch = FetchType.LAZY)
    private Set<Usuario> usuarios = new HashSet<>();

}
