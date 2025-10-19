package com.juanhiginio.genomeBank.entities;

import com.juanhiginio.genomeBank.entities.enums.CategoriaFuncion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "FuncionBiologica")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FuncionBiologica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "codigoUnico", nullable = false, unique = true, length = 100)
    private String codigoUnico;

    @Column(name = "nombre", nullable = false, length = 150)
    private String nombre;

    //REVISAR (Carpeta enums fue necesaria para poder integrar la regla de las unicas categorias permitidas.)
    @Enumerated(EnumType.STRING)
    @Column(name = "categoria", nullable = false, length = 2)
    private CategoriaFuncion categoria;

    @OneToMany(mappedBy = "funcionBiologica", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<GenFuncion> genFunciones = new HashSet<>();

}
