public class Day7 {
    public static void main(String[] args) {

         /* Day 7 -- 100DaysOfCode --
           Write a program that performs the following tasks using Math class:
                Maximum of 2 numbers
                Minimum of 2 numbers
                Square root of a number
                Floor and Ceil of a float
                Abs value of a double
        */
        // Toda la información de la clase Math puede ser consultada en los java docs.
        System.out.println("*************");
        System.out.println("Día 7");

        double x = -3.123;
        double y = 16;
        double z, t;

        z = Math.max(x,y); // Parte 1
        t = Math.min(x,y); // Parte 2

        System.out.println("El valor máximo de los valores ingresados es: "+ z);
        System.out.println("El valor mínimo de los valores ingresados es: "+ t);
        System.out.println("La raíz cuadrada de "+y+ " es: "+ Math.sqrt(y)); // Parte 3
        System.out.println("El floor de la variable x es: "+ Math.floor(x) +
                " el ceil de la variable x es: " + Math.ceil(x));
        System.out.println("El valor absoluto de la variable x es: " + Math.abs(x));

    }
}
