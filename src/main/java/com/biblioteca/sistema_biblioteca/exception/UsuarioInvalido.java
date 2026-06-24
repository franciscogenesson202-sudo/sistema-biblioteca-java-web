package com.biblioteca.sistema_biblioteca.exception;

public class UsuarioInvalido extends RuntimeException {
    public UsuarioInvalido(String message) {
        super(message);
    }
}
