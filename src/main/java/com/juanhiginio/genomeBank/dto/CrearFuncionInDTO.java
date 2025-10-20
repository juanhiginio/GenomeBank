package com.juanhiginio.genomeBank.dto;

import lombok.Data;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class CrearFuncionInDTO {

    private String codigoUnico;
    private String nombre;
    @NotNull
    private String categoria; // 'BP', 'MF', 'CC'
}
