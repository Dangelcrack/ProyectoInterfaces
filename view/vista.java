package view;

    public class vista{


        public static void inicio(){
                /*holaaa soy el narrador... voy a poneros unas cuantas explicaciones
                por aqui y por aya para que sea mas facil montar la vista

                Esta primera parte es el INcio del programa, me explico, es lo primero que se va a mostrar al usuario
                y es lo primero que debeis de llamar.
                la vista no tiene ninguna funcion que interactue con el usuario
                por lo cual solo se tiene que llamar.
                es como si fuera una imagen.

                */

            System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□\n" +
                               "Bienvenid@s a “base de datos” tu base de datos de “confianza”\n" +
                                "          Versión de la aplicación v-0.99s\n" +
                                "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
                System.out.println("***********************************************\n" +
                                   "____________________MENU_______________________");
                System.out.println("______________1º-Guaradr favorito______________");
                System.out.println("______________2º-Borrar favorito_______________");
                System.out.println("______________3º-Mostrar favoritos_____________");
                System.out.println("______________4º-Buscar favoritos______________");
                System.out.println("______________5º-Salir del programa____________");
                System.out.println("_______________________________________________\n" +
                                   "***********************************************");
            /* este panel muestra una introduccion y enseña que opciones tiene el programa*/


        }
        public static void decoracion1_1(){

            //esto es una decoracion, la inencion es hacer como uan especie de marco esta parte seria el encabezado de arriba
            //obiamente este no es necesario en la cinco opciones principales si no por ejemplo a la hora de guardar una pelicula

            System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□" );
            System.out.println("********************************************************\n" );

        }
        public static void decoracion1_2(){

            //esta es la continuacion del marco

            System.out.println("_________________PULSE 1 PARA RETROCEDER________________");
            System.out.println("________________________________________________________\n" +
                    "********************************************************\n"+
                    "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
        }
        public static void primera_opcion(){

            // esta es la primera opcion, e supuesto que abra un metodo para crear cada cosa

            System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□" );
            System.out.println("********************************************************\n" +
                               "_________________________MENU___________________________");
            System.out.println("__A continuación podras empezar a guardar tus favoritos_");
            System.out.println("__________________Empecemos a guaradar__________________");
            System.out.println("_________________1º-Guardar una pelicula________________");
            System.out.println("_________________2º-Guardar un videojuego_______________");
            System.out.println("_________________3º-Guardar una cancion_________________");
            System.out.println("_______________________4º-volver________________________");
            System.out.println("________________________________________________________\n" +
                               "********************************************************\n"+
                               "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");

        }

        public static void segunda_opcion(){

            // esta es la segunda opcion, a falta de saber como vamos a  borrar e puesto uno par borrar cada cosa

            System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□" );
            System.out.println("********************************************************\n" +
                               "_________________________MENU___________________________");
            System.out.println("__A continuación podras empezar a borrar tus favoritos__");
            System.out.println("___________________Empecemos a borrar___________________");
            System.out.println("_________________1º-Borrar una pelicula_________________");
            System.out.println("_________________2º-Borrar un videojuego________________");
            System.out.println("_________________3º-Borrar una cancion__________________");
            System.out.println("_______________________4º-volver________________________");
            System.out.println("________________________________________________________\n" +
                               "********************************************************\n"+
                               "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");

        }
        public static void tercera_opcion(){

            // esta es la tercera opcion, aqui supongo que haceis una lista de objetos por cada cosa,
            // si no podeis utilizar la decoracion de antes dierctamente y no mostrar esta pantalla

            System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□" );
            System.out.println("********************************************************\n" +
                               "_________________________MENU___________________________");
            System.out.println("___A continuación podras empezar a ver tus favoritos____");
            System.out.println("_____________________Empecemos a ver____________________");
            System.out.println("__________________1º-ver mis peliculas__________________");
            System.out.println("__________________2º-Ver mis videojuegos________________");
            System.out.println("__________________3º-Ver mis canciones__________________");
            System.out.println("_______________________4º-volver________________________");
            System.out.println("________________________________________________________\n" +
                    "********************************************************\n"+
                    "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");

        }
        public static void cuarta_opcion(){

            // esta es la cuarta opcion, aqui e puesto varias opciones de busqueda aquellas que no existan cuando este montado
            //se borraran de este

            System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□" );
            System.out.println("********************************************************\n" +
                               "_________________________MENU___________________________");
            System.out.println("__A continuación podras empezar a buscar tus favoritos__");
            System.out.println("__________________Empecemos a guaradar__________________");
            System.out.println("__________________1º-Buscar por nombre__________________");
            System.out.println("__________________2º-Buscar por fecha___________________");
            System.out.println("__________________3º-Buscar por ......__________________");
            System.out.println("_______________________4º-volver________________________");
            System.out.println("________________________________________________________\n" +
                               "********************************************************\n"+
                               "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");

        }
        public static void quinta_opcion(){

            // esta es la ultima  opcion, la cual es una despedida, como si fueran unos creditos

            System.out.println("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□" );
            System.out.println("********************************************************\n" +
                                "__________________GRACIAS POR SU VISITA________________");
            System.out.println("_______________________APP creada por:__________________");
            System.out.println("____________________SALVADOR SÁNCHEZ____________________");
            System.out.println("_________________........................_______________");
            System.out.println("_________________........................_______________");
            System.out.println("________________________________________________________\n" +
                               "********************************************************\n"+
                               "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");

        }
    }
