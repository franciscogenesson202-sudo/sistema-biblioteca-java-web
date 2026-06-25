package com.biblioteca.sistema_biblioteca.dtos.usuario;

public record UsuarioCreateDto(
        String email,
        String nome,
        String senha

) {
}
