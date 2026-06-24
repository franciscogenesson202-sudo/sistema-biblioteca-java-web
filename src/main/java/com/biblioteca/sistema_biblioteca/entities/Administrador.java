package com.biblioteca.sistema_biblioteca.entities;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor

@Builder
@Entity
@Table(name = "administradores")
@Getter
@Setter

public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Usuario usuario;



}
