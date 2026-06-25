package com.biblioteca.sistema_biblioteca.dtos.livro;

import com.biblioteca.sistema_biblioteca.dtos.usuario.UsuarioResponseDto;
import com.biblioteca.sistema_biblioteca.entities.Livro;

public record CadrastroLivroDto(


        LivroCreateDto livro,
        UsuarioResponseDto usuario
) {
}
