package com.biblioteca.sistema_biblioteca.dtos.livro;

import jakarta.persistence.Column;

import java.time.LocalDate;

public record LivroCreateDto(

        String autor,
        String titulo,
        String resumo,
        int quantidade,
        String dataLancamento,
        long idEditora
) {
}
