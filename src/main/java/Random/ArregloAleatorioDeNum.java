package Random;

import java.util.Scanner;
import java.util.Random;
public class ArregloAleatorioDeNum {

    public void GeneradorAleatori(){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int tamañoDelArreglo=0;
        int dato,j ;
        boolean x = true;

        System.out.println("Ingresar el tamaño del arreglo no mayor a 10");
        tamañoDelArreglo = sc.nextInt();
        int arreglo[] = new int[tamañoDelArreglo];


        //llenar array
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(10);

        }



        //visualizar array
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

    }
}
