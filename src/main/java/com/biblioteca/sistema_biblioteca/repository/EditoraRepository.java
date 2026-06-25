package com.biblioteca.sistema_biblioteca.repository;

import com.biblioteca.sistema_biblioteca.dtos.livro.LivroCreateDto;
import com.biblioteca.sistema_biblioteca.entities.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long> {



}