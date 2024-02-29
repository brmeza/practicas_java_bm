package Main;
import Adivinador.Juego;
import Arrays.Array;
import Ejercicio1.Ejecucion;
import Ejercicio2.Eje2;
import Random.ArregloAleatorioDeLetras;
import Random.ArregloAleatorioDeNum;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        int ejeSeleccionado;

        System.out.println("Selecciona el ejercicio que quiere correr");
        System.out.println("1. Eje Cuenta bancaria");
        System.out.println("2. Eje 2 paltaforma");
        System.out.println("3. proyecto 1 Adivinador...");
        System.out.println("4. Array4...");
        System.out.println("5. Generar arreglo aleatorio numero ");
        System.out.println("6. Generar arreglo aleatori lETRAS");
        System.out.println("7. Proyecto 2 truco de las 21 cartas");
        System.out.print("->");
        ejeSeleccionado = scanner.nextInt();

        switch (ejeSeleccionado){
            case 1:
                Ejecucion ejecucion = new Ejecucion();
                ejecucion.practica();
                break;
            case 2:
                Eje2 eje2 = new Eje2();
                eje2.clean("cadena s df");
                break;
            case 3:
                Juego juego = new Juego();
                juego.adivinador();
                break;
            case 4:
                Array array = new Array();
                array.PracticaArray();

                break;
            case 5:
                ArregloAleatorioDeNum aleatorio = new ArregloAleatorioDeNum();
                aleatorio.GeneradorAleatori();
                break;
            case 6:
                ArregloAleatorioDeLetras aleatorioDeLetras = new ArregloAleatorioDeLetras();
                aleatorioDeLetras.arregloLetras(12);
                break;
            case 7:

                break;
            default:
                System.out.println("no has seleccionado nada ");
        }


    }
}
