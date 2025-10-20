package com.juanhiginio.genomeBank.dto;

import lombok.Data;

/**
 * CrearGenomaOutDTO
 *
 * DTO utilizado como respuesta tras la creación de un nuevo genoma en el sistema GenomeBank.
 * Contiene la información generada y confirmada por el sistema después del registro exitoso,
 * incluyendo su identificador y la relación con la especie correspondiente.
 *
 * Este objeto se devuelve típicamente como resultado de una operación POST
 * en el controlador asociado a la entidad Genoma.
 *
 * Ejemplo JSON de respuesta:
 * {
 *   "id": 1,
 *   "especie_id": 1
 * }
 *
 * Campos importantes:
 * - **id:** identificador único del genoma generado por el sistema.
 * - **especie_id:** referencia a la especie asociada.
 *
 * @author GenomeBank
 * @version 1.0
 * @since 2025
 */
@Data
public class CrearGenomaOutDTO {

    /**
     * Identificador único del genoma generado por el sistema.
     */
    private Long id;

    /**
     * Identificador de la especie a la que pertenece el genoma.
     */
    private Long especie_id;
}
