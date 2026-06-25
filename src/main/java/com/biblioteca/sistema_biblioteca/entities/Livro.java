package com.biblioteca.sistema_biblioteca.entities;


import jakarta.persistence.*;
import lombok.*;

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
    private long id;
    private String autor;
    private String titulo;
    private String resumo;
    private int quantidade;
    @Column(name = "data_lancamento")
    private String dataLancamento;
    @ManyToOne
    @JoinTable(
            name = "livros_editoras",
            joinColumns = @JoinColumn(name = "id_livros"),
            inverseJoinColumns = @JoinColumn(name = "id_editora")
    )
    private Editora editora;


}
