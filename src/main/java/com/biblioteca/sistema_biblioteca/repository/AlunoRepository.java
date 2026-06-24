package com.biblioteca.sistema_biblioteca.repository;

import com.biblioteca.sistema_biblioteca.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}