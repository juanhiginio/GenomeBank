package com.juanhiginio.genomeBank.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Cromosoma")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cromosoma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "longitudParesDeBases")
    private int longitudParesDeBases;

    @Column(name = "secuenciaADN", nullable = false)
    private String secuenciaADN;
    /*Tengo dudas aqui, dentro de la tabla en la base de datos dice que es tipo de dato TEXT, y en el texto dice que este campo debe de ser unicamente en alfabeto
    Entonces porfa para revisarlo si se define como String o se especifica tipo "[a-zA-Z]*"
     */

    @ManyToOne
    @JoinColumn(name = "genoma_id", nullable = false)
    private Genoma genoma;

    @OneToMany(mappedBy = "cromosoma", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Gen> genes = new HashSet<>();

}
