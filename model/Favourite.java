package model;

import java.util.Date;

public class Favourite {
    protected String name;
    protected  String genre;
    protected Date launchDate;
    public Favourite() {
        name="no especificado";
        genre="no especificado";
        launchDate =null;
    }
    public Favourite(String nombre, String genero, Date f_lanzamiento) {
        this.name = nombre;
        this.genre = genero;
        this.launchDate = f_lanzamiento;
    }
    public String getNombre() {
        return name;
    }
    public void setNombre(String nombre) {
        this.name = name;
    }
    public String getGenero() {
        return genre;
    }
    public void setGenero(String genero) {
        this.genre = genre;
    }
    public Date getF_lanzamiento() {
        return launchDate;
    }
    public void setF_lanzamiento(Date f_lanzamiento) {
        this.launchDate = launchDate;
    }
    @Override
    public String toString() {
        return "favorito{" +
                "nombre='" + name + '\'' +
                ", genero='" + genre + '\'' +
                ", f_lanzamiento=" + launchDate +
                '}';
    }
}
