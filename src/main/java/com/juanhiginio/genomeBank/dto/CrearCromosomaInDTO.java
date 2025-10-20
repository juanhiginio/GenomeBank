package com.juanhiginio.genomeBank.dto;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;


@Data
public class CrearCromosomaInDTO {

    //Campos propios de Cromosoma
    private String nombre;

    //Detalle del Cromosoma

    private int longitudParesDeBases;
    private String secuenciaADN;

    @NotNull
    private Long genoma_id;



}
