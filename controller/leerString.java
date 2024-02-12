package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class leerString {
    //esto es mas lioso solo pro el simpe hecho de que no entiendo para
    //que es que lo quereis utilizar

    public static String readString(String msg, String x) {

        /* esplico un poco lo que hace por encima
         primero te pedira que le des un mensaje en plan pon un nombre
         despues te pedira que metas una String inventada  que sera el valor que devolvera
         cuando se cumplan los requisitos

         quedaria algo asi    "String ejemplo=readString("hola",a);"
         */

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println(msg);
            try {
                x = teclado.nextLine();
            } catch (InputMismatchException e) {
                x = null;
                teclado.next();
                System.out.println("como te has apañado para que te salga esto...");
            }
            if (x.equals(null)) {
                System.out.println("recuerda el String tiene que ser valido ");
            }


        } while (x!= null);

        return x;

    }
}