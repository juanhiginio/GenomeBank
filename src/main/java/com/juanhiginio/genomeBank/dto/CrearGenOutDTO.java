package com.juanhiginio.genomeBank.dto;

import lombok.Data;
@Data
public class CrearGenOutDTO {

    private Long id;
    private String simbolo;
    private Integer posicionInicio;
    private Integer posicionFinal;

    private String orientacion;

    private String secuenciaADN;
    private int cromosoma_id;
}
