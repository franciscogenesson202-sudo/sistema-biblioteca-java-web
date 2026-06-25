package com.biblioteca.sistema_biblioteca.services;


import com.biblioteca.sistema_biblioteca.dtos.livro.CadrastroLivroDto;
import com.biblioteca.sistema_biblioteca.dtos.livro.LivroCreateDto;
import com.biblioteca.sistema_biblioteca.dtos.livro.LivroResponseDto;
import com.biblioteca.sistema_biblioteca.dtos.usuario.UsuarioResponseDto;
import com.biblioteca.sistema_biblioteca.entities.Editora;
import com.biblioteca.sistema_biblioteca.entities.Livro;
import com.biblioteca.sistema_biblioteca.enuns.TipoUsuario;
import com.biblioteca.sistema_biblioteca.exception.UsuarioInvalido;
import com.biblioteca.sistema_biblioteca.repository.EditoraRepository;
import com.biblioteca.sistema_biblioteca.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LivroService {

    private final EditoraRepository editoraRepository;
    private final LivroRepository livroRepository;

    public LivroResponseDto adicionarLivro(CadrastroLivroDto cadrastroLivroDto) {

        UsuarioResponseDto usuarioLogado = cadrastroLivroDto.usuario();
        LivroCreateDto livro = cadrastroLivroDto.livro();

        if (usuarioLogado.tipoUsuario() == TipoUsuario.ALUNO) {
            throw new UsuarioInvalido("voce nao pode adicionar livros");
        }


        Editora editora = editoraRepository.findById(livro.idEditora()).orElseThrow(()
                -> new RuntimeException("Editora não encontrada"));

        Livro novoLivro = Livro.builder().autor(livro.autor())
                                        .titulo(livro.titulo())
                                        .resumo(livro.resumo())
                                        .quantidade(livro.quantidade())
                                        .dataLancamento(livro.dataLancamento())
                                        .editora(editora)
                                        .build();



        livroRepository.save(novoLivro);

        return new LivroResponseDto(novoLivro.getId(),
                novoLivro.getAutor(),
                novoLivro.getTitulo(),
                novoLivro.getResumo(),
                novoLivro.getQuantidade(),
                novoLivro.getDataLancamento(),
                novoLivro.getEditora()
        );
    }

}
