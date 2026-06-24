package com.biblioteca.sistema_biblioteca.repository;

import com.biblioteca.sistema_biblioteca.entities.LivroEditora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroEditoraRepository extends JpaRepository<LivroEditora, Long> {
}