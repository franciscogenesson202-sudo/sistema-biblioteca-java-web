package com.biblioteca.sistema_biblioteca.dtos;

public record UsuarioCreateDto(
        String email,
        String nome,
        String senha

) {
}
