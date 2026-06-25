package com.biblioteca.sistema_biblioteca.services;

import com.biblioteca.sistema_biblioteca.dtos.usuario.LoginDto;
import com.biblioteca.sistema_biblioteca.dtos.usuario.UsuarioCreateDto;
import com.biblioteca.sistema_biblioteca.dtos.usuario.UsuarioResponseDto;
import com.biblioteca.sistema_biblioteca.entities.Administrador;
import com.biblioteca.sistema_biblioteca.entities.Aluno;
import com.biblioteca.sistema_biblioteca.entities.Usuario;
import com.biblioteca.sistema_biblioteca.enuns.TipoUsuario;
import com.biblioteca.sistema_biblioteca.exception.UsuarioInvalido;
import com.biblioteca.sistema_biblioteca.repository.AdministradorRepository;
import com.biblioteca.sistema_biblioteca.repository.AlunoRepository;
import com.biblioteca.sistema_biblioteca.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final AdministradorRepository administradorRepository;
    private final AlunoRepository alunoRepository;

    public UsuarioResponseDto criarUsuario(UsuarioCreateDto usuarioDto){

        if(usuarioRepository.quantidadeUsuarios() == 0)
        {
            Usuario usuario = Usuario.builder()
                                    .nome(usuarioDto.nome())
                                    .email(usuarioDto.email())
                                    //.senha(new BCryptPasswordEncoder().encode(usuarioDto.senha()))
                                    .senha(usuarioDto.senha())
                                    .tipoUsuario(TipoUsuario.ADMIN).build();
            //usuario.setSenha(new BCryptPasswordEncoder().encode((usuario.getSenha())));
            System.out.println(usuario.getSenha());

            Usuario novoUsuario = usuarioRepository.save(usuario);

            Administrador adm = Administrador.builder().usuario(novoUsuario).build();

            administradorRepository.save(adm);

            return new UsuarioResponseDto(novoUsuario.getId(),
                                            novoUsuario.getEmail(),
                                            novoUsuario.getNome(),
                                            novoUsuario.getTipoUsuario());
        }


        if(usuarioRepository.existsByEmail(usuarioDto.email())){
           throw new UsuarioInvalido("email ja existente");
        }


        Usuario usuario = Usuario.builder()
                .nome(usuarioDto.nome())
                .email(usuarioDto.email())
                //.senha(new BCryptPasswordEncoder().encode(usuarioDto.senha()))
                .senha(usuarioDto.senha())
                .tipoUsuario(TipoUsuario.ALUNO).build();
        //usuario.setSenha(new BCryptPasswordEncoder().encode((usuario.getSenha())));
        System.out.println(usuario.getSenha());

        Usuario novoUsuario = usuarioRepository.save(usuario);

        Aluno aluno = Aluno.builder().usuario(novoUsuario).build();

        alunoRepository.save(aluno);

        return new UsuarioResponseDto(novoUsuario.getId(),
                novoUsuario.getEmail(),
                novoUsuario.getNome(),
                novoUsuario.getTipoUsuario());


    }



    public UsuarioResponseDto login(LoginDto loginDto){
       String email = loginDto.email();
       String senha = loginDto.senha();

        Optional<Usuario> login = usuarioRepository.loginPorEmailSenha(email, senha);

        if(login.isEmpty()){
            throw new UsuarioInvalido("email ou senha incorretos");
        }

        Usuario usuarioLogado = login.get();


        return new UsuarioResponseDto(usuarioLogado.getId(),
                usuarioLogado.getEmail(),
                usuarioLogado.getNome(),
                usuarioLogado.getTipoUsuario());
    }



}
