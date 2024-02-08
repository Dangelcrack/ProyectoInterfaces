package model.Library;

import interfaces.ILibrary;
import model.entity.favorite;

import java.util.Date;

public class library implements ILibrary {
    private static final int TAM = 25;
    private favorite[] favorites;

    public library() {
        favorites = new favorite[TAM];
    }

    @Override
    public favorite[] showFavorite() {
        return favorites;
    }

    @Override
    public boolean addFavorite(favorite b) {
        boolean result = false;
        if (getPosFavorite(b) == -1) {
            for (int i = 0; i < favorites.length
                    && !result; i++) {
                if (favorites[i] == null) {
                    favorites[i] = b;
                    result = true;
                }
            }
        }
        return result;
    }

    private int getPosFavorite(favorite b) {
        int result = -1;
        for (int i = 0; i < favorites.length; i++) {
            if (favorites[i] != null && favorites[i].equals(b)) {
                result = i;
                break;
            }
        }
        return result;

    }

    @Override
    public favorite removeFavorite(favorite n) {
        favorite result = null;
        int pos = getPosFavorite(n);
        if(pos!=-1){
            result= favorites[pos];
            favorites[pos]=null;
        }
        return result;
    }

    @Override
    public void findByName(String n) {
        for (favorite favorito : favorites) {
            if (favorito.getName().equals(n)) {
                System.out.println("Favorito encontrado: " + favorito);
                return;
            }
        }
        System.out.println("No se encontró ningún favorite con el nombre: " + n);
    }

    @Override
    public void findByGender(String g) {
        for (favorite favorito : favorites) {
            if (favorito.getGender().equalsIgnoreCase(g)) {
                System.out.println("Favorito encontrado: " + favorito);
            }
        }
    }

    @Override
    public void findByDate(Date f) {
        for (favorite favorito : favorites) {
            if (favorito.getD_departure().equals(f)) {
                System.out.println("Favorito encontrado:  " + favorito);
            }
        }
    }
}
