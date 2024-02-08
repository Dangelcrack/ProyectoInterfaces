package model.entity;

import java.util.Date;
import java.util.Objects;

public class song extends favorite {
    private String autor;
    private Date duration;
    private String nameSong;

    public song() {
        autor = "anonimo";
        duration = new Date("no especificada");
        nameSong = getName();
    }

    public song(String name, String gender, Date d_departure, String autor, Date duration) {
        super(name, gender, d_departure);
        this.autor = autor;
        this.duration = duration;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        song cancion = (song) o;
        return Objects.equals(autor, cancion.autor) && Objects.equals(duration, cancion.duration) && Objects.equals(nameSong, cancion.nameSong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), autor, duration, nameSong);
    }

    @Override
    public String toString() {
        return "song{" +
                "autor='" + autor + '\'' +
                ", duracion=" + duration +
                ", nombre='" + name + '\'' +
                ", genero='" + gender + '\'' +
                ", f_lanzamiento=" + d_departure +
                '}';
    }

}
