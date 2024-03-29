package model;

import java.util.Date;

public class Videogame extends Favourite {
    private String desarrollador;
    private boolean mundo_abierto;
    public Videogame() {
         desarrollador="anonimo";
         mundo_abierto=false;
    }
    public Videogame(String nombre, String genero, Date f_lanzamiento, String desarrollador, boolean mundo_abierto) {
        super(nombre, genero, f_lanzamiento);
        this.desarrollador = desarrollador;
        this.mundo_abierto = mundo_abierto;
    }
    public String getDesarrollador() {
        return desarrollador;
    }
    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }
    public boolean isMundo_abierto() {
        return mundo_abierto;
    }
    public void setMundo_abierto(boolean mundo_abierto) {
        this.mundo_abierto = mundo_abierto;
    }
    @Override
    public String toString() {
        return "videojuego{" +
                "desarrollador='" + desarrollador + '\'' +
                ", mundo_abierto=" + mundo_abierto +
                ", nombre='" + name + '\'' +
                ", genero='" + genre + '\'' +
                ", f_lanzamiento=" + launchDate +
                '}';
    }
}
