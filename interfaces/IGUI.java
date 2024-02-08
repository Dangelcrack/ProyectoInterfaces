package interfaces;

import model.entity.favorito;

public interface IGUI {
    void inicio();
    void muestraFavoritos(favorito[] f);
    void muestraFavorito(favorito f);
    favorito muestraMenuAñadirFavorito();
    favorito muestraMenuQuitarFavorito();
    void muestraResultado();
}
