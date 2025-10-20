package com.juanhiginio.genomeBank.dto;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

/**
 * CrearCromosomaInDTO
 *
 * DTO utilizado para la creación de un cromosoma dentro del sistema GenomeBank.
 * Contiene los datos de entrada requeridos para registrar un nuevo cromosoma
 * y asociarlo a un genoma existente en la base de datos.
 *
 * Este objeto se emplea típicamente como cuerpo de una petición POST en el controlador
 * correspondiente a la entidad Cromosoma.
 *
 * Ejemplo JSON:
 * {
 *   "nombre": "Cromosoma 1",
 *   "longitudParesDeBases": 248956422,
 *   "secuenciaADN": "ATCGGATCGT...",
 *   "genoma_id": 1
 * }
 *
 * @author genomeBank
 * @version 1.0
 * @since 2025
 */

@Data
public class CrearCromosomaInDTO {
    /**
     * Nombre del cromosoma.
     * Identifica el cromosoma dentro del genoma correspondiente.
     * Ejemplo: "Cromosoma X".
     */
    private String nombre;
    /**
     * Longitud del cromosoma medida en pares de bases (bp).
     * Indica el tamaño total de la secuencia genética del cromosoma.
     * Ejemplo: 248956422.
     */
    private int longitudParesDeBases;
    /**
     * Secuencia de ADN completa del cromosoma.
     * Representa los nucleótidos que conforman la cadena genética (A, T, C, G).
     */
    private String secuenciaADN;
    /**
     * Identificador del genoma al que pertenece el cromosoma.
     * Campo obligatorio que establece la relación con el genoma padre.
     */
    @NotNull
    private Long genoma_id;



}
