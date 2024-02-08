package model.entity;

import java.util.Date;
import java.util.Objects;

public class movie extends favorite {
    private String director;
    private String premiere_date;

    public movie() {
        this.director = "no especificado";
        this.premiere_date = "no especificado";
    }

    public movie(String nombre, String genero, Date f_lanzamiento, String director, String fechaEstreno) {
        super(nombre, genero, f_lanzamiento);
        this.director = director;
        this.premiere_date = fechaEstreno;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPremiere_date() {
        return premiere_date;
    }

    public void setPremiere_date(String premiere_date) {
        this.premiere_date = premiere_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        movie pelicula = (movie) o;
        return Objects.equals(director, pelicula.director) && Objects.equals(premiere_date, pelicula.premiere_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), director, premiere_date);
    }

    @Override
    public String toString() {
        return "movie{" +
                "director='" + director + '\'' +
                ", fechaEstreno='" + premiere_date + '\'' +
                ", nombre='" + name + '\'' +
                ", genero='" + gender + '\'' +
                ", f_lanzamiento=" + d_departure +
                '}';
    }
}
