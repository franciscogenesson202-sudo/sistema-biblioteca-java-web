package com.biblioteca.sistema_biblioteca.repository;

import com.biblioteca.sistema_biblioteca.entities.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
}