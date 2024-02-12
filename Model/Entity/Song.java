package Model.Entity;

import java.util.Date;
import java.util.Objects;

public class Song extends Favourite {
    private String autor;
    private Date duracion;
    private String nombreCancion;

    public Song() {
        autor = "anonimo";
        duracion = new Date("no especificada");
        nombreCancion = getName();
    }

    public Song(String nombre, String genero, String releaseDate, String autor, Date duracion) {
        super(nombre, genero, releaseDate);
        this.autor = autor;
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Song Song = (Song) o;
        return Objects.equals(autor, Song.autor) && Objects.equals(duracion, Song.duracion) && Objects.equals(nombreCancion, Song.nombreCancion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), autor, duracion, nombreCancion);
    }

    @Override
    public String toString() {
        return "cancion{" +
                "autor='" + autor + '\'' +
                ", duracion=" + duracion +
                ", nombre='" + name + '\'' +
                ", genero='" + genre + '\'' +
                ", f_lanzamiento=" + releaseDate +
                '}';
    }

}
