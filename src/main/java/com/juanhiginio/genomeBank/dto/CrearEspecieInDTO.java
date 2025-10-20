package com.juanhiginio.genomeBank.dto;

import lombok.Data;

/**
 * CrearEspecieInDTO
 *
 * DTO utilizado para la creación de una nueva especie dentro del sistema GenomeBank.
 * Contiene los datos básicos requeridos para registrar una especie en la base de datos,
 * incluyendo su nombre científico y nombre común.
 *
 * Este objeto se emplea como cuerpo de una petición POST en el controlador correspondiente
 * a la entidad Especie.
 *
 * Ejemplo JSON de solicitud:
 * {
 *   "nombreCientifico": "Homo sapiens",
 *   "nombreComun": "Humano"
 * }
 *
 * @author GenomeBank
 * @version 1.0
 * @since 2025
 */
@Data
public class CrearEspecieInDTO {

    // Campos propios de la especie

    /**
     * Nombre científico de la especie.
     * Es el identificador formal utilizado en la clasificación biológica.
     * Ejemplo: "Homo sapiens".
     */
    private String nombreCientifico;

    /**
     * Nombre común de la especie.
     * Representa la denominación habitual utilizada por las personas.
     * Ejemplo: "Humano".
     */
    private String nombreComun;
}
