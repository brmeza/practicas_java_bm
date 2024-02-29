package Arrays;

public class Array {

    public void PracticaArray(){

        int arreglo[] = new int[12];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=i+1;
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("-"+arreglo[i]);
        }


    }
}
