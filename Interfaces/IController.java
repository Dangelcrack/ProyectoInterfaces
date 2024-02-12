package Interfaces;

import Model.Entity.Favourite;

public interface IController {
    void start();
    void controllerMainMenu(int o);

    void addFavourite(Favourite newF);

    void controllershowFavourites();
    void controlleraddFavourites();
    void controllerdeleteFavourites();
    void end();
    void startMainMenu();

}
