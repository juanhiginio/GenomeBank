package com.juanhiginio.genomeBank.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Genoma")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Genoma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "especie_id", nullable = false)
    private Especie especie;

    @OneToMany(mappedBy = "genoma", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Cromosoma> cromosomas = new HashSet<>();
}
