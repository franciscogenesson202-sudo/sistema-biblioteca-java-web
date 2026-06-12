package com.biblioteca.sistema_biblioteca.services;

import com.biblioteca.sistema_biblioteca.entities.Usuario;
import com.biblioteca.sistema_biblioteca.enuns.TipoUsuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService
{
    private final List<Usuario> usuarios = new ArrayList<>();
    private long idcontador = 1L;

    public UsuarioService()
    {
        usuarios.add(new Usuario(idcontador++,"adim.@gmail","admin","admin123", TipoUsuario.ADMIN));
    }

    public Usuario realizarLogin(String email, String senha)
    {
        for (Usuario usuario : usuarios)
        {
            if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha))
            {
                return usuario;
            }
        }
        return null;
    }

public String cadrastrarUsuarios(Usuario usuarioLogado,
                                 String novonome,
                                 String novoemail,
                                 String novasenha,
                                 TipoUsuario tipoUsuario)
{
    if(usuarioLogado == null) {
        return "usuario nao autenticado";
    }


    TipoUsuario tipoUsuarioLogado = usuarioLogado.getTipoUsuario();

    if(tipoUsuarioLogado != TipoUsuario.GERENCIADOR && tipoUsuarioLogado != TipoUsuario.ADMIN)
    {
        return "tipoUsuarioLogado nao permitido";
    }

    if(tipoUsuarioLogado == TipoUsuario.GERENCIADOR && tipoUsuario != TipoUsuario.ALUNO)
    {
        return "voce nao pode criar esse tipo de usuario";
    }


    for(Usuario user : usuarios)
    {
        if(user.getEmail().equalsIgnoreCase(novoemail))
        {

        }
    }



    return novasenha;
}


public String alterarSenha(Usuario usuarioLogado, String novaSenha,Long idseguranca)
{

    if(usuarioLogado.getId() != idseguranca)
    {
        return "idseguranca errada";
    }

    usuarioLogado.setSenha(novaSenha);


    return "senha alterada com sucesso";
}


public String alterarnome(Usuario usuarioLogado, String novonome)
{
    usuarioLogado.setNome(novonome);

    return "nome alterado com sucesso";
}



}
