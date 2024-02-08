package interfaces;

import model.entity.favorito;

import java.util.Date;

public interface ILibrary {
    favorito[] muestraFavorito();
    boolean añadirFavorito(favorito b);
    favorito quitarFavorito(favorito n);
    void findByGenero(String g);
    void findByDate(Date d);
    void findByName(String nombre);
}
