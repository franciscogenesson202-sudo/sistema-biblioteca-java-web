package com.biblioteca.sistema_biblioteca.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Builder
@NoArgsConstructor
@AllArgsConstructor

@Setter
@Getter
@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String autor;
    private String titulo;
    private String resumo;
    private int quantidade;
    @Column(name = "data_lancamento")
    private LocalDate data_lancamento;


    public Livro(long codigo,
                 String titulo,
                 String autor,
                 int quantidade,
                 String resumo,
                 LocalDate data_lancamento) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.resumo = resumo;
        this.quantidade = quantidade;
        this.data_lancamento = data_lancamento;

    }




}
