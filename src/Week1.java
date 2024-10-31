import java.sql.SQLOutput;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

        /* Day 1 -- 100DaysOfCode https://www.100daysofcode.io/learn/java/hello-world
        1. Write a program that prints "Hello World!" to the console
        2. Add single line and multi-line comments to your code*/

        System.out.println("*************");
        System.out.println("Día 1");
        System.out.println("Hola mundo");

        /* Day 2 -- 100DaysOfCode
        Day 2 - Variables and Data Types
        1. Declare and initialize variables for various data types including integer (int),
        floating-point number (double), and string (String). Then, print each variable
        to the console.*/

        System.out.println("*************");
        System.out.println("Día 2");

        int number = 10;
        double numberFloat = 10.5;
        String  cadenaTexto = "Hola como estás";

        System.out.println("El número entero es: "+number+", el número flotante es: "
                +numberFloat+"y la cadena de texto es: "+cadenaTexto);

        /* Day 3 -- 100DaysOfCode -- Input and Output
        1. Write a program that reads user input and print it to the console.
        2. Modify the program to read and print different data type inputs (integers, floating-point numbers, strings)
        3. Write a program to read the user input using Scanner class
        */

        System.out.println("*************");
        System.out.println("Día 3");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int enteroEntrada = teclado.nextInt();
        System.out.println("El número ingresado es: " + enteroEntrada);
        System.out.println("Ingrese un número flotante: ");
        double flotanteEntrada = teclado.nextDouble();
        System.out.println("El número ingresado es: " + flotanteEntrada);


        System.out.println("Ingrese una cadena de texto: ");
        Scanner teclado1 = new Scanner(System.in);
        String cadenaEntrada1 = teclado1.nextLine();
        System.out.println("La cadena de texto ingresada es: " + cadenaEntrada1);


    }
}
