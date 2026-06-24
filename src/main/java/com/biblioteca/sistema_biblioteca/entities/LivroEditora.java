package com.biblioteca.sistema_biblioteca.entities;


import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "livros_editoras")
@Getter
@Setter
public class LivroEditora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_editora")
    private Editora editora;

    @ManyToOne
    @JoinColumn(name = "id_livros")
    private Livro livro;



}
