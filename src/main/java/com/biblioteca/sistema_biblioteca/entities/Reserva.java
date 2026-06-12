package com.biblioteca.sistema_biblioteca.entities;

import com.biblioteca.sistema_biblioteca.enuns.TipoUsuario;

public class Reserva
{
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

    public long getId(){return id;}

    public long getUsuarioId(){return usuarioId;}

    public long getLivroId(){return livroId;}

    public String getDataReserva(){return dataReserva;}

    public TipoUsuario getTipoUsuario(){return tipoUsuario;}

    public void setId(long id){this.id = id;}

    public void setUsuarioId(long usuarioId){this.usuarioId = usuarioId;}

    public void setLivroId(long livroId){this.livroId = livroId;}

    public void setDataReserva(String dataReserva){this.dataReserva = dataReserva;}

    public void setTipoUsuario(TipoUsuario tipoUsuario){this.tipoUsuario = tipoUsuario;}

}



