package com.biblioteca.sistema_biblioteca.entities;

import com.biblioteca.sistema_biblioteca.enuns.TipoUsuario;

public class Usuario
{
    private long id;
    private String email;
    private String nome;
    private String senha;
    private TipoUsuario tipoUsuario;


    public Usuario(long id,
                   String email,
                   String nome,
                   String senha,
                   TipoUsuario tipoUsuario)
    {
            this.id = id;
            this.email = email;
            this.nome = nome;
            this.senha = senha;
            this.tipoUsuario = tipoUsuario;


    }

    public long getId() {return id;}

    public String getEmail() { return email;}

    public String getSenha() { return senha;}

    public String getNome() { return nome;}

    public TipoUsuario getTipoUsuario() {return tipoUsuario;}


    public void setId(long id) {this.id = id;}

    public void setEmail(String email) {this.email = email;}

    public void setSenha(String senha) {this.senha = senha;}

    public void setNome(String nome) {this.nome = nome;}

    public void setTipoUsuario(TipoUsuario tipoUsuario) {this.tipoUsuario = tipoUsuario;}


}
