package com.juanhiginio.genomeBank.dto;

import lombok.Data;
import java.util.List;

@Data
public class RegisterRequest {

    private String nombre;

    private String correoelectronico;

    private String password;

    private Boolean activo = true;

    private List<String> roles;
}
