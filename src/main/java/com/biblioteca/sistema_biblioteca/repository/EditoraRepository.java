package com.biblioteca.sistema_biblioteca.repository;

import com.biblioteca.sistema_biblioteca.entities.Editora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditoraRepository extends JpaRepository<Editora, Long> {
}