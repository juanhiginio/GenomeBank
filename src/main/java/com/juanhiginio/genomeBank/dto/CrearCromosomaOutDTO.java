package com.juanhiginio.genomeBank.dto;

import lombok.Data;

/**
 * CrearCromosomaOutDTO
 *
 * DTO utilizado como respuesta tras la creación de un nuevo cromosoma en el sistema GenomeBank.
 * Contiene la información generada y confirmada por el sistema luego del registro exitoso
 * de un cromosoma, incluyendo datos del genoma y especie relacionados.
 *
 * Este objeto se devuelve típicamente como resultado de una operación POST en el controlador
 * correspondiente a la entidad Cromosoma.
 *
 * Ejemplo JSON de respuesta:
 * {
 *   "id": 1,
 *   "nombre": "Cromosoma 1",
 *   "longitudParesDeBases": 248956422,
 *   "secuenciaADN": "ATCGGATCGT...",
 *   "genoma_id": 1,
 *   "nombreCientifico": "Homo sapiens"
 * }
 *
 * @author GenomeBank
 * @version 1.0
 * @since 2025
 */
@Data
public class CrearCromosomaOutDTO {

    /**
     * Identificador único del cromosoma generado por el sistema.
     */
    private Long id;

    /**
     * Nombre del cromosoma.
     * Ejemplo: "Cromosoma 1" o "Cromosoma X".
     */
    private String nombre;

    /**
     * Longitud del cromosoma medida en pares de bases (bp).
     * Indica el tamaño total de la secuencia genética.
     */
    private int longitudParesDeBases;

    /**
     * Secuencia de ADN que compone el cromosoma.
     * Representada mediante una cadena de caracteres (A, T, C, G).
     */
    private String secuenciaADN;

    /**
     * Identificador del genoma al que pertenece el cromosoma.
     */
    private Long genoma_id;

    /**
     * Nombre científico de la especie asociada al genoma del cromosoma.
     * Ejemplo: "Homo sapiens".
     */
    private String nombreCientifico;
}
