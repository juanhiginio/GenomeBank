package com.juanhiginio.genomeBank.dto;

import lombok.Data;
@Data
public class CrearGenInDTO {

    private String simbolo;
    private int posicionInicio;
    private int posicionFinal;
    private String secuenciaADN;

    //private String orientacion; TENER EN CUENTA QUE ESTE DATO SE TRABAJA CON ENUM, REVISAR COMO SE INTEGRA EN DTO

    private int cromosoma_id;

}
