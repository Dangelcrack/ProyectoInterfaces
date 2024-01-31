package model;

import java.util.Date;

public class favorito {
    protected String nombre;
    protected  String genero;
    protected Date f_lanzamiento;
    public favorito() {
        nombre="no especificado";
        genero="no especificado";
        f_lanzamiento=new Date("no especificado");
    }
    public favorito(String nombre, String genero, Date f_lanzamiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.f_lanzamiento = f_lanzamiento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Date getF_lanzamiento() {
        return f_lanzamiento;
    }
    public void setF_lanzamiento(Date f_lanzamiento) {
        this.f_lanzamiento = f_lanzamiento;
    }
    @Override
    public String toString() {
        return "favorito{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", f_lanzamiento=" + f_lanzamiento +
                '}';
    }
}
