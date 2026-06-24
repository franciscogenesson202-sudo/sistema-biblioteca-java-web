package com.biblioteca.sistema_biblioteca.controllers;

import com.biblioteca.sistema_biblioteca.dtos.LoginDto;
import com.biblioteca.sistema_biblioteca.dtos.UsuarioCreateDto;
import com.biblioteca.sistema_biblioteca.dtos.UsuarioResponseDto;
import com.biblioteca.sistema_biblioteca.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping()
    public UsuarioResponseDto criar(@RequestBody UsuarioCreateDto usuarioCreateDto){
        return usuarioService.criarUsuario(usuarioCreateDto);
    }

    @PostMapping("/login")
    public UsuarioResponseDto login(@RequestBody LoginDto loginDto){
        return usuarioService.login(loginDto);
    }


}
