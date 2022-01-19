package bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //psvm

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese la fecha de hoy: ");
        int numero = teclado.nextInt();

        System.out.print("¿Es soleado por ahí?: ");
        boolean comprobar = teclado.nextBoolean();

        System.out.println("Hola " + nombre + ", como estas?"); //sout
        System.out.println("La fecha de hoy es " + numero);
        System.out.println("Es Soleado? " + comprobar);
    }
}
