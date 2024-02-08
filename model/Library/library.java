package model.Library;

import interfaces.ILibrary;
import model.entity.favorito;

import java.util.Date;

public class library implements ILibrary {
    private static final int TAM = 30;
    private favorito[] favoritos;

    public library() {
        favoritos = new favorito[TAM];
    }

    @Override
    public favorito[] muestraFavorito() {
        return favoritos;
    }

    @Override
    public boolean añadirFavorito(favorito b) {
        boolean result = false;
        if (getPosFavorito(b) == -1) {
            for (int i = 0; i < favoritos.length
                    && !result; i++) {
                if (favoritos[i] == null) {
                    favoritos[i] = b;
                    result = true;
                }
            }
        }
        return result;
    }

    private int getPosFavorito(favorito b) {
        int result = -1;
        for (int i = 0; i < favoritos.length; i++) {
            if (favoritos[i] != null && favoritos[i].equals(b)) {
                result = i;
                break;
            }
        }
        return result;

    }

    @Override
    public favorito quitarFavorito(favorito n) {
        favorito result = null;
        int pos = getPosFavorito(n);
        if(pos!=-1){
            result=favoritos[pos];
            favoritos[pos]=null;
        }
        return result;
    }

    @Override
    public void findByName(String nombre) {
        for (favorito favorito : favoritos) {
            if (favorito.getNombre().equals(nombre)) {
                System.out.println("Favorito encontrado: " + favorito);
                return;
            }
        }
        System.out.println("No se encontró ningún favorito con el nombre: " + nombre);
    }

    @Override
    public void findByGenero(String genero) {
        for (favorito favorito : favoritos) {
            if (favorito.getGenero().equalsIgnoreCase(genero)) {
                System.out.println("Favorito encontrado: " + favorito);
            }
        }
    }

    @Override
    public void findByDate(Date fecha) {
        for (favorito favorito : favoritos) {
            if (favorito.getF_lanzamiento().equals(fecha)) {
                System.out.println("Favorito encontrado:  " + favorito);
            }
        }
    }
}
