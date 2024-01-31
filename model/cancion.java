package model;

import java.util.Date;

public class cancion extends favorito{
    public cancion() {
        autor="anonimo";
        duracion=new Date("no especificada");
    }
    public cancion(String nombre, String genero, Date f_lanzamiento, String autor, Date duracion) {
        super(nombre, genero, f_lanzamiento);
        this.autor = autor;
        this.duracion = duracion;
    }
    private String autor;
    private Date duracion;
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
