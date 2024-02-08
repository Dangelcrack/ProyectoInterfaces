package interfaces;

import model.entity.favorite;

public interface IGUI {
    void inicio();
    void muestraFavoritos(favorite[] f);
    void muestraFavorito(favorite f);
    favorite muestraMenuAñadirFavorito();
    favorite muestraMenuQuitarFavorito();
    void muestraResultado();
}
