package com.biblioteca.sistema_biblioteca.controllers;


import com.biblioteca.sistema_biblioteca.dtos.livro.CadrastroLivroDto;
import com.biblioteca.sistema_biblioteca.dtos.livro.LivroResponseDto;
import com.biblioteca.sistema_biblioteca.dtos.usuario.UsuarioResponseDto;
import com.biblioteca.sistema_biblioteca.services.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/livros")
public class LivroController {
   private final LivroService livroService;

    @PostMapping("/cadrastrarLivros")
    public LivroResponseDto cadrastarLivro(@RequestBody CadrastroLivroDto cadrastrar) {
        return livroService.adicionarLivro(cadrastrar);

    }
}
