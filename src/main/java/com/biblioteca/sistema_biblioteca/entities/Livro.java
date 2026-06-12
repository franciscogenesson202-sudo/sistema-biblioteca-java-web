package com.biblioteca.sistema_biblioteca.entities;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Livro
{
    private long codigo;
    private String titulo;
    private String autor;
    private String editora;
    private double preco;
    private int quantidade;


    public Livro(long codigo,
                 String titulo,
                 String autor,
                 String editora,
                 double preco,
                 int quantidade)
    {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.quantidade = quantidade;

    }



    public long getcodigo() {return codigo;}

    public String getTitulo() {return titulo;}

    public String getAutor() {return autor;}

    public String getEditora() {return editora;}

    public double getPreco() {return preco;}

    public int getQuantidade() {return quantidade;}



    public void setCodigo(long codigo) {this.codigo = codigo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public void setAutor(String autor) {this.autor = autor;}

    public void setEditora(String editora) {this.editora = editora;}

    public void setPreco(double preco) {this.preco = preco;}

    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
}
