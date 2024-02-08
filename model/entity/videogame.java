package model.entity;

import java.util.Date;
import java.util.Objects;

public class videogame extends favorite {
    private String developer;
    private boolean open_world;

    public videogame() {
        developer = "anonymous";
        open_world = false;
    }

    public videogame(String name, String gender, Date d_launch, String developer, boolean open_world) {
        super(name, gender, d_launch);
        this.developer = developer;
        this.open_world = open_world;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public boolean isOpen_world() {
        return open_world;
    }

    public void setOpen_world(boolean open_world) {
        this.open_world = open_world;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        videogame that = (videogame) o;
        return open_world == that.open_world && Objects.equals(developer, that.developer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), developer, open_world);
    }

    @Override
    public String toString() {
        return "videogame{" +
                "desarrollador='" + developer + '\'' +
                ", mundo_abierto=" + open_world +
                ", nombre='" + name + '\'' +
                ", genero='" + gender + '\'' +
                ", f_lanzamiento=" + d_departure +
                '}';
    }
}
