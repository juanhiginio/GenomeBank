package com.juanhiginio.genomeBank.dto;

import lombok.Data;

/**
 * CrearUsuarioOutDTO
 *
 * DTO utilizado como respuesta tras la creación de un nuevo usuario en el sistema GenomeBank.
 * Contiene la información generada y confirmada por el sistema luego del registro exitoso
 * del usuario, incluyendo su identificador, nombre, correo electrónico y rol asignado.
 *
 * Este objeto se devuelve típicamente como resultado de una operación POST
 * en el controlador correspondiente a la entidad Usuario.
 *
 * Ejemplo JSON de respuesta:
 * {
 *   "id": 1,
 *   "nombre": "Juan Pérez",
 *   "correoElectronico": "juan.perez@genomebank.com",
 *   "rol": "USUARIO"
 * }
 *
 * Campos importantes:
 * - **rol:** puede ser "USUARIO" o "ADMINISTRADOR".
 *
 * @author GenomeBank
 * @version 1.0
 * @since 2025
 */
@Data
public class CrearUsuarioOutDTO {

    /**
     * Identificador único del usuario generado por el sistema.
     */
    private Long id;

    /**
     * Nombre completo del usuario registrado.
     * Ejemplo: "Juan Pérez".
     */
    private String nombre;

    /**
     * Correo electrónico asociado al usuario.
     * Ejemplo: "juan.perez@genomebank.com".
     */
    private String correoElectronico;

    /**
     * Rol asignado al usuario dentro del sistema.
     * Puede ser "USUARIO" o "ADMINISTRADOR".
     */
    private String rol; // 'USUARIO' o 'ADMINISTRADOR'
}
