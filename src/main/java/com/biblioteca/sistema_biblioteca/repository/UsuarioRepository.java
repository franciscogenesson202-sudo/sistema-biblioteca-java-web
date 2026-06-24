package com.biblioteca.sistema_biblioteca.repository;


import com.biblioteca.sistema_biblioteca.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = ("select count(*) from usuarios;"), nativeQuery = true)
    long quantidadeUsuarios();


    @Query(value = (" select * from usuarios where email = :email;"), nativeQuery = true)
    Optional<Usuario> encontrarUsuarioEmail(String email);

    boolean existsByEmail(String email);

    @Query(value = (" select *  from usuarios where email = :email  and senha = :senha;"),nativeQuery = true)
    Optional<Usuario> loginPorEmailSenha(String email, String senha);

}