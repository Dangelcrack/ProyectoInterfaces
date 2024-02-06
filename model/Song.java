package model;

import java.util.Date;

public class Song extends Favourite {
    public Song() {
        autor="anonimo";
    }
    public Song(String nombre, String genero, Date f_lanzamiento, String autor) {
        super(nombre, genero, f_lanzamiento);
        this.autor = autor;
    }
    private String autor;
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "cancion{" +
                "autor='" + autor + '\'' +
                ", nombre='" + name + '\'' +
                ", genero='" + genre + '\'' +
                ", f_lanzamiento=" + launchDate +
                '}';
    }
}
