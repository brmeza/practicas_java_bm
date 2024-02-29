package Ejercicio2;

public class Eje2 {

        public String clean(String identifier) {
            char[] aCaracteres = identifier.toCharArray();
            for (char c: aCaracteres) {
                if (aCaracteres[c] == ' ') {
                    aCaracteres[c]= '_';
                }
                if (aCaracteres[c]=='-'){

                }
            }
            identifier = new String(aCaracteres);
            System.out.println(identifier);
            return identifier;
        }
}
