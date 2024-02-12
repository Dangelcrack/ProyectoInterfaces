package Controller;

import Interfaces.IController;
import Model.Entity.Favourite;
import Model.Library.Library;
import View.GUI;

public class Controller implements IController {

    private GUI gui = new GUI();

    private Library lib = new Library();

    @Override
    public void start() {
        startMainMenu();
    }

    @Override
    public void startMainMenu() {
        int o;
        do {
            gui.showMainMenu();
            o = gui.readInt("Elige una opción: ");
            controllerMainMenu(o);
        } while (o != 4);
    }

    @Override
    public void controllerMainMenu(int o) {
        switch (o) {
            case 1:
                controlleraddFavourites();
                break;
            case 2:
                controllershowFavourites();
                break;
            case 3:
                controllerdeleteFavourites();
                break;
            case 4:
                end();
                break;
        }
    }

    @Override
    public void controlleraddFavourites() {
        String name = gui.readString("Introduce el nombre: ");
        String genre = gui.readString("Introduce el genero: ");
        String releaseDate = gui.readString("Introduce la fecha de lanzamiento: ");
        Favourite newF = new Favourite(name, genre, releaseDate);
        addFavourite(newF);
    }

    @Override
    public void addFavourite(Favourite newF) {
        if (lib.addFavourite(newF)) {
            gui.showMessage("Favorito insertado correctamente");
        } else {
            gui.showMessage("Error al insertar el favorito");
        }

    }

    @Override
    public void controllershowFavourites() {
        Favourite[] favourites = lib.muestraFavorito();
        if (favourites.length == 0) {
            gui.showMessage("No hay favoritos para mostrar.");
            return;
        }
        gui.showMessage("Favoritos:");
        for (Favourite favourite : favourites) {
            if (favourite != null) {
                gui.showMessage(favourite.toString());
            }
        }
    }

    @Override
    public void controllerdeleteFavourites() {
        String name = gui.readString("Introduce el nombre del favorito que quieres eliminar: ");
        Favourite foundFavourite = null;
        for (Favourite favourite : lib.muestraFavorito()) {
            if (favourite != null && favourite.getName().equals(name)) {
                foundFavourite = favourite;
                break;
            }
        }
        if (foundFavourite != null) {
            lib.quitarFavorito(foundFavourite);
            gui.showMessage("Favorito eliminado correctamente");
        } else {
            gui.showMessage("No se encontró ningún favorito con el nombre: " + name);
        }
    }

    @Override
    public void end() {
        System.out.println("adio");
    }
}
