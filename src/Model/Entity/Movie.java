package src.Model.Entity;

import java.util.Objects;

public class Movie extends Favourite {
    private String director;
    private String fechaEstreno;

    public Movie() {
        this.director = "no especificado";
        this.fechaEstreno = "no especificado";
    }

    public Movie(String nombre, String genero, String releaseDate, String director, String fechaEstreno) {
        super(nombre, genero, releaseDate);
        this.director = director;
        this.fechaEstreno = fechaEstreno;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Movie Movie = (Movie) o;
        return Objects.equals(director, Movie.director) && Objects.equals(fechaEstreno, Movie.fechaEstreno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), director, fechaEstreno);
    }

    @Override
    public String toString() {
        return "pelicula{" +
                "director='" + director + '\'' +
                ", fechaEstreno='" + fechaEstreno + '\'' +
                ", nombre='" + name + '\'' +
                ", genero='" + genre + '\'' +
                ", f_lanzamiento=" + releaseDate +
                '}';
    }
}
