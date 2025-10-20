package com.juanhiginio.genomeBank.dto;

import lombok.Data;

/**
 * CrearEspecieOutDTO
 *
 * DTO utilizado como respuesta tras la creación de una nueva especie en el sistema GenomeBank.
 * Contiene la información confirmada y almacenada en la base de datos luego del registro exitoso
 * de la especie.
 *
 * Este objeto se devuelve típicamente como resultado de una operación POST
 * en el controlador correspondiente a la entidad Especie.
 *
 * Ejemplo JSON de respuesta:
 * {
 *   "id": 1,
 *   "nombreCientifico": "Homo sapiens",
 *   "nombreComun": "Humano"
 * }
 *
 * @author
 * @version 1.0
 * @since 2025
 */
@Data
public class CrearEspecieOutDTO {

    /**
     * Identificador único de la especie generado por el sistema.
     */
    private Long id;

    /**
     * Nombre científico de la especie registrada.
     * Ejemplo: "Homo sapiens".
     */
    private String nombreCientifico;

    /**
     * Nombre común de la especie registrada.
     * Ejemplo: "Humano".
     */
    private String nombreComun;
}
