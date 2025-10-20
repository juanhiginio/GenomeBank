package com.juanhiginio.genomeBank.dto;

import lombok.Data;
@Data
public class CrearUsuarioInDTO {

    private String nombre;
    private String correoElectronico;
    private String contrasena;
    private Long rol_id;

}
