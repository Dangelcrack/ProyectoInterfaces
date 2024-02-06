package interfaces;

import model.favorito;

import java.util.Date;

public interface ILibrary {
    favorito[] muestraFavorito();
    boolean añadirFavorito(favorito b);
    favorito quitarFavorito(String n);
    void findbyName(String n);
    void findbyGenero(String g);
    void findbyDate(Date d);
}
