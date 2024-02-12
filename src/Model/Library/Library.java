package src.Model.Library;

import src.Interfaces.ILibrary;
import src.Model.Entity.Favourite;

import java.util.Date;

public class Library implements ILibrary {
    private static final int TAM = 25;
    private Favourite[] Favourites;

    public Library() {
        Favourites = new Favourite[TAM];
    }

    @Override
    public Favourite[] muestraFavorito() {
        return Favourites;
    }

    @Override
    public boolean addFavourite(Favourite b) {
        boolean result = false;
        if (getPosFavorito(b) == -1) {
            for (int i = 0; i < Favourites.length
                    && !result; i++) {
                if (Favourites[i] == null) {
                    Favourites[i] = b;
                    result = true;
                }
            }
        }
        return result;
    }

    private int getPosFavorito(Favourite b) {
        int result = -1;
        for (int i = 0; i < Favourites.length; i++) {
            if (Favourites[i] != null && Favourites[i].equals(b)) {
                result = i;
                break;
            }
        }
        return result;

    }

    @Override
    public Favourite quitarFavorito(Favourite n) {
        Favourite result = null;
        int pos = getPosFavorito(n);
        if(pos!=-1){
            result= Favourites[pos];
            Favourites[pos]=null;
        }
        return result;
    }

    @Override
    public void findByName(String nombre) {
        for (Favourite Favourite : Favourites) {
            if (Favourite.getName().equals(nombre)) {
                System.out.println("Favorito encontrado: " + Favourite);
                return;
            }
        }
        System.out.println("No se encontró ningún favorito con el nombre: " + nombre);
    }

    @Override
    public void findByGenero(String genero) {
        for (Favourite Favourite : Favourites) {
            if (Favourite.getGenre().equalsIgnoreCase(genero)) {
                System.out.println("Favorito encontrado: " + Favourite);
            }
        }
    }

    @Override
    public void findByDate(Date fecha) {
        for (Favourite Favourite : Favourites) {
            if (Favourite.getReleaseDate().equals(fecha)) {
                System.out.println("Favorito encontrado:  " + Favourite);
            }
        }
    }
}
