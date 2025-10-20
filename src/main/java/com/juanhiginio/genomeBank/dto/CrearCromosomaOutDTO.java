package com.juanhiginio.genomeBank.dto;

import lombok.Data;

@Data
public class CrearCromosomaOutDTO {

    private int id;
    private String nombre;
    private int longitudParesDeBases;
    private String secuenciaADN;

    //Relación con genoma y especie
    private int genoma_id;
    private String nombreCientifico;
}
