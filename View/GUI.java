package View;

import Interfaces.IGUI;
import Model.Entity.Favourite;

import java.util.Scanner;

public class GUI implements IGUI {

    @Override
    public void showMainMenu() {

    }

    @Override
    public void muestraFavoritos(Favourite[] f) {

    }

    @Override
    public void muestraFavorito(Favourite f) {

    }

    @Override
    public Favourite muestraMenuAñadirFavorito() {
        return null;
    }

    @Override
    public Favourite muestraMenuQuitarFavorito() {
        return null;
    }

    @Override
    public void muestraResultado() {

    }

    @Override
    public void showMessage(String msg){
        System.out.println(msg);
    }

    @Override
    public int readInt(String msg) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print(msg);
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                // Limpiar el buffer del scanner
                scanner.nextLine();
            }
        } while (!entradaValida);

        return numero;
    }

    @Override
    public String readString(String msg) {
        Scanner scanner = new Scanner(System.in);
        String entrada = "";
        boolean entradaValida = false;

        do {
            try {
                System.out.print(msg);
                entrada = scanner.nextLine();
                entradaValida = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Debes ingresar una entrada válida.");
                // Limpiar el buffer del scanner
                scanner.nextLine();
            }
        } while (!entradaValida);

        return entrada;
    }
}
