package interfaces;

import model.favorito;

public interface ILibrary {
    favorito[] muestraFavorito();
    boolean añadirFavorito(favorito b);
    favorito quitarFavorito(String n);

}
