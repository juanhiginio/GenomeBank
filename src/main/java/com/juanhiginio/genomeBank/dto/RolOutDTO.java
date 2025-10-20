package com.juanhiginio.genomeBank.dto;

import lombok.Data;

/**
 * RolOutDTO
 *
 * DTO de salida que representa la información de un rol dentro del sistema GenomeBank.
 * Este objeto se utiliza para transferir datos desde el backend hacia el cliente
 * (por ejemplo, en respuestas de consultas o asignaciones de roles a usuarios).
 *
 * Contiene los atributos principales del rol, incluyendo su identificador y nombre descriptivo.
 *
 * Ejemplo de respuesta JSON:
 * {
 *   "id": 1,
 *   "nombre": "ADMINISTRADOR"
 * }
 *
 * Campos:
 * - **id:** identificador único del rol.
 * - **nombre:** nombre descriptivo del rol (por ejemplo, "USUARIO" o "ADMINISTRADOR").
 *
 * @author GenomeBank
 * @version 1.0
 * @since 2025
 */
@Data
public class RolOutDTO {

    /**
     * Identificador único del rol en la base de datos.
     */
    private Long id;

    /**
     * Nombre descriptivo del rol.
     * Ejemplo: "USUARIO", "ADMINISTRADOR".
     */
    private String nombre;
}
