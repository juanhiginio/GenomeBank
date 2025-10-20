package com.juanhiginio.genomeBank.dto;

import lombok.Data;

/**
 * CrearFuncionOutDTO
 *
 * DTO utilizado como respuesta tras la creación de una nueva función biológica en el sistema GenomeBank.
 * Contiene la información confirmada y almacenada en la base de datos luego del registro exitoso
 * de la función, incluyendo su identificador único, nombre y categoría.
 *
 * Este objeto se devuelve típicamente como resultado de una operación POST
 * en el controlador correspondiente a la entidad Función.
 *
 * Ejemplo JSON de respuesta:
 * {
 *   "id": 1,
 *   "codigoUnico": "GO:0008150",
 *   "nombre": "proceso biológico",
 *   "categoria": "BP"
 * }
 *
 * Categorías posibles:
 * - **BP:** Biological Process (Proceso Biológico)
 * - **MF:** Molecular Function (Función Molecular)
 * - **CC:** Cellular Component (Componente Celular)
 *
 * @author GenomeBank
 * @version 1.0
 * @since 2025
 */
@Data
public class CrearFuncionOutDTO {

    /**
     * Identificador único de la función biológica generado por el sistema.
     */
    private Long id;

    /**
     * Código único que identifica la función biológica.
     * Ejemplo: "GO:0008150".
     */
    private String codigoUnico;

    /**
     * Nombre descriptivo de la función biológica.
     * Ejemplo: "proceso biológico".
     */
    private String nombre;

    /**
     * Categoría a la que pertenece la función biológica.
     * Puede tomar uno de los siguientes valores:
     * - BP: Proceso Biológico
     * - MF: Función Molecular
     * - CC: Componente Celular
     */
    private String categoria;
}
