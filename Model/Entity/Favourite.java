package Model.Entity;

import java.util.Objects;

public class Favourite {
    protected String name;
    protected String genre;
    protected String releaseDate;

    public Favourite() {
        name = "no especificado";
        genre = "no especificado";
        releaseDate = "no especificado";
    }

    public Favourite(String name, String genre, String releaseDate) {
        this.name = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favourite Favourite = (Favourite) o;
        return Objects.equals(name, Favourite.name) && Objects.equals(genre, Favourite.genre) && Objects.equals(releaseDate, Favourite.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, releaseDate);
    }

    @Override
    public String toString() {
        return "favorito{" +
                "nombre='" + name + '\'' +
                ", genero='" + genre + '\'' +
                ", f_lanzamiento=" + releaseDate +
                '}';
    }
}
