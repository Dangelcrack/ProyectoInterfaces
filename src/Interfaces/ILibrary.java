package src.Interfaces;

import src.Model.Entity.Favourite;

import java.util.Date;

public interface ILibrary {
    Favourite[] muestraFavorito();
    boolean addFavourite(Favourite b);
    Favourite quitarFavorito(Favourite n);
    void findByGenero(String g);
    void findByDate(Date d);

    void findByName(String nombre);
}
