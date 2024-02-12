package src.Model.Entity;

import java.util.Objects;

public class Game extends Favourite {
    private String desarrollador;
    private boolean mundo_abierto;

    public Game() {
        desarrollador = "anonimo";
        mundo_abierto = false;
    }

    public Game(String nombre, String genero, String releaseDate, String desarrollador, boolean mundo_abierto) {
        super(nombre, genero, releaseDate);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Game that = (Game) o;
        return mundo_abierto == that.mundo_abierto && Objects.equals(desarrollador, that.desarrollador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), desarrollador, mundo_abierto);
    }

    @Override
    public String toString() {
        return "videojuego{" +
                "desarrollador='" + desarrollador + '\'' +
                ", mundo_abierto=" + mundo_abierto +
                ", nombre='" + name + '\'' +
                ", genero='" + genre + '\'' +
                ", f_lanzamiento=" + releaseDate +
                '}';
    }
}
