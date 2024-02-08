package model.entity;

import java.util.Date;
import java.util.Objects;

public class favorite {
    protected String name;
    protected String gender;
    protected Date d_departure;

    public favorite() {
        name = "no especificado";
        gender = "no especificado";
        d_departure = new Date("no especificado");
    }

    public favorite(String name, String gender, Date d_departure) {
        this.name = name;
        this.gender = gender;
        this.d_departure = d_departure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getD_departure() {
        return d_departure;
    }

    public void setD_departure(Date d_departure) {
        this.d_departure = d_departure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        favorite favorito = (favorite) o;
        return Objects.equals(name, favorito.name) && Objects.equals(gender, favorito.gender) && Objects.equals(d_departure, favorito.d_departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, d_departure);
    }

    @Override
    public String toString() {
        return "favorite{" +
                "nombre='" + name + '\'' +
                ", genero='" + gender + '\'' +
                ", f_lanzamiento=" + d_departure +
                '}';
    }
}
