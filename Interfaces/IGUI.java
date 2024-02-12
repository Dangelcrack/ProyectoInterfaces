package Interfaces;

import Model.Entity.Favourite;

public interface IGUI {
    void showMainMenu();

    void muestraFavoritos(Favourite[] f);

    void muestraFavorito(Favourite f);

    Favourite muestraMenuAñadirFavorito();

    Favourite muestraMenuQuitarFavorito();

    void muestraResultado();

    void showMessage(String msg);

    int readInt(String msg);

    String readString(String msg);
}
