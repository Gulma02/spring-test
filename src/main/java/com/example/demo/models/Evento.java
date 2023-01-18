package com.example.demo.models;

public class Evento {
    private long id = 0;
    private String titulo = "";
    private String fecha = "";
    private String lugar = "";
    private Integer idArtista = 0;

    public Evento() {

    }
    public Boolean crearEvento(long id, String titulo, String fecha, String lugar, Integer idArtista) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.lugar = lugar;
        this.idArtista = idArtista;

        return true;
    }

    public Evento getEvento() {
        this.id = 1;
        this.titulo = "Duki Velez";
        this.fecha = "2022/10/06";
        this.lugar = "Velez";
        this.idArtista = 1;

        return this;
    }
}
