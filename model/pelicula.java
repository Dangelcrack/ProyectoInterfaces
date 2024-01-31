package model;

import java.util.Date;

public class pelicula extends favorito {
    public pelicula() {
        director="anonimo";
    }
    public pelicula(String nombre, String genero, Date f_lanzamiento, String director) {
        super(nombre, genero, f_lanzamiento);
        this.director = director;
    }
    private String director;
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    @Override
    public String toString() {
        return "pelicula{" +
                "director='" + director + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", f_lanzamiento=" + f_lanzamiento +
                '}';
    }
}
