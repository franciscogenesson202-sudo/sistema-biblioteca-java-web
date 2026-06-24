package com.biblioteca.sistema_biblioteca.repository;

import com.biblioteca.sistema_biblioteca.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}