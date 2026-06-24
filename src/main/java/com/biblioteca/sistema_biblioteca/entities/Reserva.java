package com.biblioteca.sistema_biblioteca.entities;

import com.biblioteca.sistema_biblioteca.enuns.TipoUsuario;
import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@Entity
@Table(name = "reservas")
@Getter
@Setter
public class Reserva
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long usuarioId ;
    private long livroId ;
    private String dataReserva;
    private TipoUsuario tipoUsuario;


    public Reserva(long id,
                   long usuarioId,
                   long livroId,
                   String dataReserva,
                   TipoUsuario tipoUsuario)
    {
        this.id = id;
        this.usuarioId = usuarioId;
        this.livroId = livroId;
        this.dataReserva = dataReserva;
        this.tipoUsuario = tipoUsuario;

    }




}



