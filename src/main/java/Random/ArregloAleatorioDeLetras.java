package Random;

import java.util.Random;

public class ArregloAleatorioDeLetras {

    public void arregloLetras(int num){

        System.out.println("Generador de letras aleatorio");
        int letraNumerada;
        Random random = new Random();
        char arreglo[][] = new char[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                letraNumerada = random.nextInt(26) + 65;
                arreglo[i][j] = (char) letraNumerada;
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("["+arreglo[i][j]+"] ");
            }
            System.out.println("");
        }


    }
}
