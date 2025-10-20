package com.juanhiginio.genomeBank.dto;

import lombok.Data;
@Data
public class CrearGenOutDTO {

    private Long id;
    private String simbolo;
    private Integer posicionInicio;
    private Integer posicionFinal;

    //private String orientacion; TENER EN CUENTA QUE ESTE DATO SE TRABAJA CON ENUM, REVISAR COMO SE INTEGRA EN DTO

    private String secuenciaADN;
    private int cromosoma_id;
}
