package com.juanhiginio.genomeBank.dto;

import lombok.Data;
@Data
public class CrearUsuarioOutDTO {

    private Long id;
    private String nombre;
    private String correoElectronico;
    private String rol; // 'USUARIO' o 'ADMINISTRADOR'
}
