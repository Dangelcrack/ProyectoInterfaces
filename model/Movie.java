package model;

import java.util.Date;

public class Movie extends Favourite {
    public Movie() {
        director="anonimo";
    }
    public Movie(String nombre, String genero, Date f_lanzamiento, String director) {
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
                ", nombre='" + name + '\'' +
                ", genero='" + genre + '\'' +
                ", f_lanzamiento=" + launchDate +
                '}';
    }
}
