package com.biblioteca.sistema_biblioteca.dtos.usuario;

import com.biblioteca.sistema_biblioteca.enuns.TipoUsuario;

public record UsuarioResponseDto(
        long id,
        String email,
        String nome,
        TipoUsuario tipoUsuario
) {
}
