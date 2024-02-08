package model.entity;

import java.util.Date;
import java.util.Objects;

public class cancion extends favorito {
    private String autor;
    private Date duracion;
    private String nombreCancion;

    public cancion() {
        autor = "anonimo";
        duracion = new Date("no especificada");
        nombreCancion = getNombre();
    }

    public cancion(String nombre, String genero, Date f_lanzamiento, String autor, Date duracion) {
        super(nombre, genero, f_lanzamiento);
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
        cancion cancion = (cancion) o;
        return Objects.equals(autor, cancion.autor) && Objects.equals(duracion, cancion.duracion) && Objects.equals(nombreCancion, cancion.nombreCancion);
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
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", f_lanzamiento=" + f_lanzamiento +
                '}';
    }

}
