package com.juanhiginio.genomeBank.dto;

import lombok.Data;
@Data
public class CrearGenInDTO {

    private String simbolo;
    private int posicionInicio;
    private int posicionFinal;
    private String secuenciaADN;

    private String orientacion;

    private Long cromosoma_id;

}
