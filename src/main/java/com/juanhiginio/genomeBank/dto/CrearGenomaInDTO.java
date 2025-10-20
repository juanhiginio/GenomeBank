package com.juanhiginio.genomeBank.dto;

import lombok.Data;

/**
 * CrearGenomaInDTO
 *
 * DTO utilizado para la creación de un nuevo genoma dentro del sistema GenomeBank.
 * Contiene el identificador de la especie a la que pertenece el genoma, estableciendo
 * la relación directa entre ambos.
 *
 * Este objeto se utiliza como cuerpo de una solicitud POST en el controlador
 * correspondiente a la entidad Genoma.
 *
 * Ejemplo JSON de solicitud:
 * {
 *   "especie_id": 1
 * }
 *
 * Campos importantes:
 * - **especie_id:** referencia obligatoria a la especie asociada al genoma.
 *
 * @author GenomeBank
 * @version 1.0
 * @since 2025
 */
@Data
public class CrearGenomaInDTO {

    /**
     * Identificador de la especie a la que pertenece el genoma.
     * Establece la relación entre el genoma y su especie correspondiente.
     */
    private Long especie_id;
}
