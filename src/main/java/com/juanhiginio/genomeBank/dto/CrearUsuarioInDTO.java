package com.juanhiginio.genomeBank.dto;

import lombok.Data;

/**
 * CrearUsuarioInDTO
 *
 * DTO utilizado para la creación de un nuevo usuario dentro del sistema GenomeBank.
 * Contiene la información necesaria para registrar un usuario, incluyendo sus datos personales,
 * credenciales de acceso y el rol asignado.
 *
 * Este objeto se utiliza como cuerpo de una solicitud POST en el controlador
 * correspondiente a la entidad Usuario.
 *
 * Ejemplo JSON de solicitud:
 * {
 *   "nombre": "Juan Pérez",
 *   "correoElectronico": "juan.perez@genomebank.com",
 *   "contrasena": "12345Segura!",
 *   "rol_id": 2
 * }
 *
 * Campos importantes:
 * - **correoElectronico:** debe ser único por usuario.
 * - **rol_id:** referencia al rol asignado dentro del sistema (por ejemplo, administrador o investigador).
 *
 * @author GenomeBank
 * @version 1.0
 * @since 2025
 */
@Data
public class CrearUsuarioInDTO {

    /**
     * Nombre completo del usuario.
     * Ejemplo: "Juan Pérez".
     */
    private String nombre;

    /**
     * Correo electrónico del usuario.
     * Se utiliza como dato único de autenticación.
     */
    private String correoElectronico;

    /**
     * Contraseña asociada al usuario.
     * Debe cumplir con los criterios de seguridad definidos por el sistema.
     */
    private String contrasena;

    /**
     * Identificador del rol asignado al usuario dentro del sistema.
     */
    private Long rol_id;
}
