package model.entity;

import java.util.Date;
import java.util.Objects;

public class pelicula extends favorito {
    private String director;
    private String fechaEstreno;

    public pelicula() {
        this.director = "no especificado";
        this.fechaEstreno = "no especificado";
    }

    public pelicula(String nombre, String genero, Date f_lanzamiento, String director, String fechaEstreno) {
        super(nombre, genero, f_lanzamiento);
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
        pelicula pelicula = (pelicula) o;
        return Objects.equals(director, pelicula.director) && Objects.equals(fechaEstreno, pelicula.fechaEstreno);
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
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", f_lanzamiento=" + f_lanzamiento +
                '}';
    }
}
