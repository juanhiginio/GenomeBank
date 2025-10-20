package com.juanhiginio.genomeBank.dto;

import lombok.Data;

/**
 * CrearGenOutDTO
 *
 * DTO utilizado como respuesta tras la creación de un nuevo gen en el sistema GenomeBank.
 * Contiene la información confirmada y almacenada en la base de datos luego del registro exitoso
 * del gen, incluyendo su posición, orientación, secuencia y cromosoma asociado.
 *
 * Este objeto se devuelve típicamente como resultado de una operación POST
 * en el controlador correspondiente a la entidad Gen.
 *
 * Ejemplo JSON de respuesta:
 * {
 *   "id": 1,
 *   "simbolo": "BRCA1",
 *   "posicionInicio": 43044295,
 *   "posicionFinal": 43125482,
 *   "orientacion": "forward",
 *   "secuenciaADN": "ATCGGATCGT...",
 *   "cromosoma_id": 2
 * }
 *
 * Campos importantes:
 * - **orientacion:** indica la dirección de transcripción del gen ("forward" o "reverse").
 * - **cromosoma_id:** referencia al cromosoma donde se ubica el gen.
 *
 * @author GenomeBank
 * @version 1.0
 * @since 2025
 */
@Data
public class CrearGenOutDTO {

    /**
     * Identificador único del gen generado por el sistema.
     */
    private Long id;

    /**
     * Símbolo o nombre corto del gen.
     * Ejemplo: "BRCA1".
     */
    private String simbolo;

    /**
     * Posición inicial del gen dentro del cromosoma.
     */
    private Integer posicionInicio;

    /**
     * Posición final del gen dentro del cromosoma.
     */
    private Integer posicionFinal;

    /**
     * Orientación del gen en el cromosoma.
     * Puede ser "forward" o "reverse".
     */
    private String orientacion;

    /**
     * Secuencia de ADN correspondiente al gen.
     * Representada mediante caracteres (A, T, C, G).
     */
    private String secuenciaADN;

    /**
     * Identificador del cromosoma al que pertenece el gen.
     */
    private Long cromosoma_id;
}
