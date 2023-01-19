package com.example.demo.models;
import javax.persistence.*;

@Entity
@Table(name = "Eventos")
public class Evento {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id = 0;
    @Column
    private String titulo = "";
    @Column
    private String fecha = "";
    @Column
    private String lugar = "";
    @Column
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
