package interfaces;

import model.entity.favorite;

import java.util.Date;

public interface ILibrary {
    favorite[] showFavorite();
    boolean addFavorite(favorite b);
    favorite removeFavorite(favorite n);
    void findByGender(String g);
    void findByDate(Date d);
    void findByName(String nombre);
}
