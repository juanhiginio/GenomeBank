package com.juanhiginio.genomeBank.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

import java.util.Collection;
import java.util.stream.Collectors;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "correoelectronico", nullable = false, unique = true, length = 150)
    private String correoelectronico;

    @Column(name = "contrasena", nullable = false)
    private String contrasena;

    @Column(name = "activo", nullable = false)
    private Boolean activo = true;

    @ManyToMany(fetch = FetchType.EAGER) // Relación muchos a muchos con roles, carga inmediata
    @JoinTable(
            name = "usuario_rol", // Tabla intermedia
            joinColumns = @JoinColumn(name = "usuario_id"), // FK usuario
            inverseJoinColumns = @JoinColumn(name = "rol_id") // FK rol
    )
    private Set<Rol> roles = new HashSet<>(); // Conjunto de roles asignados al usuario

    // ---------------------------
    // Implementación de UserDetails (Spring Security)
    // ---------------------------

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Transforma cada rol en una autoridad con prefijo "ROLE_"
        return roles.stream()
                .map(r -> (GrantedAuthority) () -> "ROLE_" + r.getNombre())
                .collect(Collectors.toSet());
    }

    @Override
    public String getPassword() {
        return contrasena;
    }

    @Override
    public String getUsername() {
        return correoelectronico;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // nunca expira
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // nunca se bloquea
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // la contraseña no expira
    }

    @Override
    public boolean isEnabled() {
        return activo; // depende del estado
    }
}
