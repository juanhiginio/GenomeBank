package com.juanhiginio.genomeBank.dto;

import lombok.Data;

/**
 * CrearGenInDTO
 *
 * DTO utilizado para la creación de un nuevo gen dentro del sistema GenomeBank.
 * Contiene los datos requeridos para registrar un gen y asociarlo a un cromosoma existente.
 *
 * Este objeto se utiliza como cuerpo de una solicitud POST en el controlador
 * correspondiente a la entidad Gen.
 *
 * Ejemplo JSON de solicitud:
 * {
 *   "simbolo": "BRCA1",
 *   "posicionInicio": 43044295,
 *   "posicionFinal": 43125482,
 *   "secuenciaADN": "ATCGGATCGT...",
 *   "orientacion": "forward",
 *   "cromosoma_id": 1
 * }
 *
 * Campos importantes:
 * - **orientacion:** puede tomar valores como `"forward"` o `"reverse"`.
 * - **cromosoma_id:** establece la relación del gen con su cromosoma correspondiente.
 *
 * @author GenomeBank
 * @version 1.0
 * @since 2025
 */
@Data
public class CrearGenInDTO {

    /**
     * Símbolo o nombre corto que identifica al gen.
     * Ejemplo: "BRCA1".
     */
    private String simbolo;

    /**
     * Posición inicial del gen dentro del cromosoma.
     * Indica el punto de inicio en la secuencia de ADN.
     */
    private int posicionInicio;

    /**
     * Posición final del gen dentro del cromosoma.
     * Indica el punto donde termina la secuencia del gen.
     */
    private int posicionFinal;

    /**
     * Secuencia de ADN correspondiente al gen.
     * Representada como una cadena de caracteres (A, T, C, G).
     */
    private String secuenciaADN;

    /**
     * Orientación del gen dentro del cromosoma.
     * Puede ser "forward" o "reverse" según la dirección de la transcripción.
     */
    private String orientacion;

    /**
     * Identificador del cromosoma al que pertenece el gen.
     */
    private Long cromosoma_id;
}
