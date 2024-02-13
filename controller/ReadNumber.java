package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {
    //este es un codigo sencillo que podemos utilizar para pedir un numero
    public static int readint(String msg,int x,int valormaximo,int valorminimo){

        /* esplico un poco lo que hace por encima
         primero te pedira que le des un mensaje en plan pon un numero
         despues te pedira que metas una int inventada  que sera el valor que devolvera
         cuando se cumplan los requisitos de valor

         quedaria algo asi    "int ejemplo=readint("hola",a,10,0);"
         */

        Scanner teclado= new Scanner(System.in);
        do {
            System.out.println(msg);
            try{
                x=teclado.nextInt();
            }catch (InputMismatchException e){
                x=-1;
                teclado.next();
                System.out.println("numeros bobo numeros...");
            }
            if (x<=valorminimo||x>valormaximo) {
                System.out.println("recuerda el numero tiene que ser valido ");
            }



        }while (x<=valorminimo||x>valormaximo);

        return x;



    }

}
