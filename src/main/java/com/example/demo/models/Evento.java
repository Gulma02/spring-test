package com.example.demo.models;
import com.example.demo.repositories.SQLRepository;
import java.sql.PreparedStatement;

public class Evento extends SQLRepository {
    private final String table = "eventos";

    // Propiedades de la clase
    private long id = 0;
    private String titulo = "";
    private String fecha = "";
    private String lugar = "";
    private Integer idArtista = 0;

    public Evento() {

    }

    public Boolean crearEvento(String titulo, String fecha, String lugar, Integer idArtista) throws Exception {
        PreparedStatement statement = null;

        return true;
    }

    public Evento getEvento() {
        Evento evento = new Evento();
        evento.id = 1;
        evento.titulo = "Duki Velez";
        evento.fecha = "2022/10/06";
        evento.lugar = "Velez";
        evento.idArtista = 1;

        return evento;
    }
}
