package Main;
import Ejercicio1.Eje1;
import Ejercicio2.Eje2;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        int ejeSeleccionado;

        System.out.println("Selecciona el ejercicio que quiere correr");
        System.out.println("Eje 1");
        System.out.println("Eje 2");
        System.out.print("->");
        ejeSeleccionado = scanner.nextInt();

        switch (ejeSeleccionado){
            case 1:
                Eje1 eje1 = new Eje1();
                eje1.saludar();
                break;
            case 2:
                Eje2 eje2 = new Eje2();
                eje2.saludar();
                break;
            default:
                System.out.println("no has seleccionado nada ");
        }


    }
}
