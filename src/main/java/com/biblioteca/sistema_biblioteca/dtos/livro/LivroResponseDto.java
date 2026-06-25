package com.biblioteca.sistema_biblioteca.dtos.livro;

import com.biblioteca.sistema_biblioteca.entities.Editora;

public record LivroResponseDto(
        long id,
        String autor,
        String titulo,
        String resumo,
        int quantidade,
        String dataLancamento,
        Editora editora
) {
}
