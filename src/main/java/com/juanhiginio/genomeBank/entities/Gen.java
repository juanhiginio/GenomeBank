package com.juanhiginio.genomeBank.entities;

import com.juanhiginio.genomeBank.entities.enums.OrientacionGen;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.processing.Pattern;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Gen")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Gen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "simbolo", length = 50, nullable = false)
    private String simbolo;

    @Column(name = "posicionInicio", nullable = false)
    private int posicionInicio;

    @Column(name = "posicionFinal", nullable = false)
    private int posicionFinal;

    @Enumerated(EnumType.STRING)
    @Column(name = "orientacion", nullable = false, length = 1)
    private OrientacionGen orientacion;

    @Column(name = "secuenciaADN", columnDefinition = "TEXT", nullable = false)
    private String secuenciaADN;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cromosoma_id", nullable = false)
    private Cromosoma cromosoma;

    @OneToMany(mappedBy = "gen", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<GenFuncion> genfunciones;

}
