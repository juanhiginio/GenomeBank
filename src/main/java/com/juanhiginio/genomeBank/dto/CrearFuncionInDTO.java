package com.juanhiginio.genomeBank.dto;

import lombok.Data;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * CrearFuncionInDTO
 *
 * DTO utilizado para la creación de una nueva función biológica dentro del sistema GenomeBank.
 * Contiene la información necesaria para registrar una función asociada a genes,
 * incluyendo su código único, nombre descriptivo y categoría correspondiente
 * (por ejemplo: proceso biológico, función molecular o componente celular).
 *
 * Este objeto se utiliza como cuerpo de una solicitud POST en el controlador
 * correspondiente a la entidad Función.
 *
 * Ejemplo JSON de solicitud:
 * {
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
public class CrearFuncionInDTO {

    /**
     * Código único que identifica la función biológica.
     * Ejemplo: "GO:0008150".
     */
    private String codigoUnico;

    /**
     * Nombre descriptivo de la función.
     * Ejemplo: "proceso biológico".
     */
    private String nombre;

    /**
     * Categoría de la función biológica.
     * Puede tomar uno de los siguientes valores:
     * - BP: Proceso Biológico
     * - MF: Función Molecular
     * - CC: Componente Celular
     */
    @NotNull
    private String categoria; // 'BP', 'MF', 'CC'
}
