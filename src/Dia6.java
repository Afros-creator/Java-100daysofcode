import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Dia6 {
    public static void main(String[] args) {
         /* Day 6 -- 100DaysOfCode --
            Write a program that performs the following tasks:
                Convert a String to an Integer
                Convert a String to a Float
                Convert an Integer to a String using valueOf() method
                Convert an Integer to a String using toString() method
        */

        System.out.println("*************");
        System.out.println("Día 6");

        // Parte 1 Convert a String to an Integer
        String cadena = "2";
        int conversor1 = Integer.valueOf(cadena);
        conversor1 +=2;
        System.out.println("La respuesta debería ser 4, la respuesta es: " + conversor1);

        // Parte 2 Convert a String to a Double
        String cadena2 = "2.34";
        Double conversor2 = Double.parseDouble(cadena2);
        DecimalFormat df = new DecimalFormat("#.##");
        conversor2 -= 2;
        System.out.println("La respuesta debería ser 0,34, la respuesta es: " + df.format(conversor2));

        // Parte 3 Convert an Integer to a String using valueOf() method
        int numero1 = 2;
        String cadena3 = String.valueOf(numero1);
        System.out.println("La cadena de tecto es: " + cadena3);

        // Convert an Integer to a String using toString() method
        // I had to create a new class to make this process Dia6TS
        Dia6TS numero2 = new Dia6TS(6);
        System.out.println(numero2.toString());


    }
}
