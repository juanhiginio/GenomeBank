package com.juanhiginio.genomeBank.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Especie")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Especie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombreCientifico", nullable = false, unique = true, length = 150)
    private String nombreCientifico;

    @Column(name = "nombreComun", length = 150)
    private String nombreComun;

    @OneToMany(mappedBy = "especie", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Genoma> genomas = new HashSet<>();
}
