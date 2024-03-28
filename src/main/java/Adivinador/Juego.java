package Adivinador;

import java.util.Scanner;

public class Juego {

    /**
     * Metodo adivinador que adivina un numero en un rango dado
     */
    public void adivinador(){
        Scanner sc = new Scanner(System.in);
        int max, min,maxIntentos,posible;
        boolean x = true;
        System.out.println("ingresar rango minimo: ");
        min = sc.nextInt();

        System.out.println("Ingresar rango maximo: ");
        max = sc.nextInt();

        maxIntentos = (int)(Math.log(max-min+1)/Math.log(2)+1);
        System.out.println("Puedo adivinar el resusltado en: " + maxIntentos);

        while (x){
            maxIntentos-=1;
            posible = ((max-min)/2)+min;
            System.out.println("el numero es "+posible);
            System.out.println("Opciones < > =");
            System.out.println("ingresa la opcion");
            String opcion = sc.next();

            switch (opcion){
                case "<":
                    max = posible-1;
                    break;
                case ">":
                    min=posible+1;
                    break;
                case "=":
                    System.out.println("ganaste");
                    break;
            }

            if (maxIntentos==-1){
                System.out.println("Estas haciendo trampa");
                x=false;
            }
        }

    }
}
