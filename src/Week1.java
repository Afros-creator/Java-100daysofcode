import java.text.DecimalFormat;
import java.util.Scanner;

public class Week1 {
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

         /* Day 4 -- 100DaysOfCode --  Basic Arithmetic Operations
        1. Write a program that declares two integer variables and perform basic arithmetic operations
         (addition, subtraction, multiplication, division) on them. Print the results to the console.
        2. Write a program that calculates the area of a rectangle. Prompt the user to input the length(integer)
        and width(integer) of the rectangle, calculate the area (length * width), and print the result.
        3. Modify the above program to read decimal numbers as the length and width, and output the area
        to two decimal points
        */

        System.out.println("*************");
        System.out.println("Día 4");

        // Parte 1
        int number1 = 5;
        int number2 = 10;

        System.out.println("Las variables de entrarda son: " +number1+ " y " +number2);

        // Suma
        int suma = number1+number2;
        System.out.println("La suma de los valores es: "+suma);
        // resta
        int resta = number1-number2;
        System.out.println("La resta de los valores es: "+ resta);
        // división
        double division = (double) number1 / (double) number2;
        System.out.println("La división de los valores es: "+division);
        // multiplicación
        double multiplicacion = number1*number2;
        System.out.println("La multiplicación de los valores es: "+multiplicacion);

        // Parte 2 rectángulo
        System.out.println("***Vamos a calcular el área de un rectángulo***");
        System.out.println("Ingrese la altura del rectángulo (entrero): ");
        Scanner rectángulo = new Scanner(System.in);
        int altura = rectángulo.nextInt();
        System.out.println("Ingrese la base del rectángulo (entero): ");
        int ancho = rectángulo.nextInt();
        int areaRectangulo = ancho * altura;
        System.out.println("El área del rectángulo es: "+ areaRectangulo);

        // Parte 3 rectángulo decimal
        System.out.println("***Vamos a calcular el área de un rectángulo con números decimales***");
        System.out.println("Ingrese la altura del rectángulo (decimal): ");
        Scanner rectángulo2 = new Scanner(System.in);
        double altura2 = rectángulo2.nextDouble();
        System.out.println("Ingrese la base del rectángulo (entero): ");
        double ancho2 = rectángulo2.nextDouble();
        double areaRectangulo2 = ancho2 * altura2;
        DecimalFormat areaDecimal = new DecimalFormat("#.##");
        String resultadoArea = areaDecimal.format(areaRectangulo2);
        System.out.println("El a´rea del rectángulo con format es: "+ resultadoArea);
        System.out.println("El área del rectángulo es: "+ areaRectangulo2);

        /* Day 5 -- 100DaysOfCode --
        1. Write a program that utilizes increment(++) and decrement(--) operators.
        2. Write a program that utilizes the following compound operators +=, -=, *=, /=, and %=.
        */

        System.out.println("*************");
        System.out.println("Día 5");

        int incremento = 0;
        incremento += 1;
        incremento += 3;
        System.out.println(incremento); // se incrementa el valor de la variable incremento

        int decremento = 5;
        decremento -= 3;
        decremento -= 1;
        System.out.println(decremento); // se decrementa el valor de la variable decremento

        int multiplicado = 1;
        multiplicado *= 10;
        System.out.println("El número multiplicado con *= es: " + multiplicado);
        double dividido = 1;
        dividido /= 10;
        System.out.println("El número dividido con *= es: " + dividido);


    }
}
