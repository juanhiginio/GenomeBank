package com.juanhiginio.genomeBank.dto;

import lombok.Data;
import java.util.List;

/**
 * RegisterRequest
 *
 * DTO utilizado para el registro de nuevos usuarios dentro del sistema GenomeBank.
 * Contiene la información necesaria para crear una cuenta de usuario, incluyendo
 * credenciales básicas y, opcionalmente, los roles que se asignarán al nuevo usuario.
 *
 * Este objeto se utiliza como cuerpo de una solicitud POST en el endpoint de registro
 * o autenticación inicial del sistema.
 *
 * Ejemplo JSON de solicitud:
 * {
 *   "username": "juanperez",
 *   "password": "12345Segura!",
 *   "roles": ["USER", "ADMIN"]
 * }
 *
 * Campos importantes:
 * - **username:** identificador único de inicio de sesión.
 * - **roles:** lista opcional de roles asignados al usuario.
 *   Si no se especifica, el sistema asigna un rol por defecto (por ejemplo, "USER").
 *
 * @author GenomeBank
 * @version 1.0
 * @since 2025
 */
@Data
public class RegisterRequest {

    /**
     * Nombre de usuario o identificador único utilizado para iniciar sesión.
     * Ejemplo: "juanperez".
     */
    private String username;

    /**
     * Contraseña asociada al usuario.
     * Debe cumplir con las políticas de seguridad definidas por el sistema.
     */
    private String password;

    /**
     * Lista opcional de roles asignados al usuario.
     * Ejemplo: ["USER", "ADMIN"].
     * Si no se especifica, el sistema puede asignar un rol por defecto.
     */
    // Optional list of role names, e.g. ["USER","ADMIN"]
    private List<String> roles;
}
