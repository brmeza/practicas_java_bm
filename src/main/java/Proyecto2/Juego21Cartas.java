package Proyecto2;

import java.util.Random;
import java.util.Scanner;


public class Juego21Cartas {

    public void game() {

        char[] grupo1 = new char[7];
        char[] grupo2 = new char[7];
        char[] grupo3 = new char[7];
        char[] baraja = new char[21];
        int cont =0;
        int fila=0;
        Scanner scanner = new Scanner(System.in);
        int seleccion=0;

        // Llenar la baraja sin repetir
        for (int i = 0; i < baraja.length; i++) {
            baraja[i] = generador(baraja);
        }


        for (int intentos = 1; intentos <= 3; intentos++) {

            System.out.println("RONDA"+intentos);

            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 3; j++) {
                    if (j==0){
                        grupo1[i] = baraja[cont];
                    }else if(j==1){
                        grupo2[i] = baraja[cont];
                    }else if(j==2){
                        grupo3[i] = baraja[cont];
                    }else {
                        System.out.println("algo fallo");
                    }
                    System.out.print("["+baraja[cont]+"]");
                    cont++;
                }
                System.out.println("");
            }
            cont=0;

            // Invertir el grupo1
            for (int i = 0; i < grupo1.length / 2; i++) {
                char temp = grupo1[i];
                grupo1[i] = grupo1[grupo1.length - 1 - i];
                grupo1[grupo1.length - 1 - i] = temp;
            }

            // Invertir el grupo2
            for (int i = 0; i < grupo2.length / 2; i++) {
                char temp = grupo2[i];
                grupo2[i] = grupo2[grupo2.length - 1 - i];
                grupo2[grupo2.length - 1 - i] = temp;
            }

            // Invertir el grupo3
            for (int i = 0; i < grupo3.length / 2; i++) {
                char temp = grupo3[i];
                grupo3[i] = grupo3[grupo3.length - 1 - i];
                grupo3[grupo3.length - 1 - i] = temp;
            }


            System.out.println("En que grupo esta tu carta? 1,2,3");
            seleccion = scanner.nextInt();
            baraja = new char[grupo1.length + grupo2.length + grupo3.length];
            if (seleccion == 1) {

                System.arraycopy(grupo2, 0, baraja, 0, grupo2.length);
                System.arraycopy(grupo1, 0, baraja, grupo2.length, grupo1.length);
                System.arraycopy(grupo3, 0, baraja, grupo2.length + grupo1.length, grupo3.length);
            } else if (seleccion == 2) {
                System.arraycopy(grupo1, 0, baraja, 0, grupo1.length);
                System.arraycopy(grupo2, 0, baraja, grupo1.length, grupo2.length);
                System.arraycopy(grupo3, 0, baraja, grupo1.length + grupo2.length, grupo3.length);
            } else if (seleccion == 3) {
                System.arraycopy(grupo1, 0, baraja, 0, grupo1.length);
                System.arraycopy(grupo3, 0, baraja, grupo1.length, grupo3.length);
                System.arraycopy(grupo2, 0, baraja, grupo1.length + grupo3.length, grupo2.length);
            }

        }
        //Damos el resultado de la carta
        System.out.println("Su carta es: "+baraja[10]);
    }

    public static char generador(char[] baraja){
        Random random = new Random();
        char nuevaLetra;
        boolean letraRepetida;
        do {
            int letraNueva = random.nextInt(26) + 65; // Genera un número entre 65 y 90 (equivalente a las letras A-Z en ASCII)
            nuevaLetra = (char) letraNueva;
            letraRepetida = verificadorDeLetrasRepetidas(baraja, nuevaLetra);
        } while (letraRepetida); // Repetir hasta que se encuentre una letra que no esté en la baraja
        return nuevaLetra;
    }

    public static boolean verificadorDeLetrasRepetidas(char[] baraja, char letra){
        for (int i = 0; i < baraja.length; i++) {
            if (letra == baraja[i]) {
                return true; // Si la letra está en la baraja, retorna true
            }
        }
        return false; // Si la letra no está en la baraja, retorna false
    }

    public static void invertirArreglo(char[] arreglo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda < derecha) {
            // Intercambiar los elementos de las posiciones izquierda y derecha
            char temp = arreglo[izquierda];
            arreglo[izquierda] = arreglo[derecha];
            arreglo[derecha] = temp;

            // Mover los índices hacia el centro
            izquierda++;
            derecha--;
        }
    }


}