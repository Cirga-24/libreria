import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        List<Libro> lstLibros= new ArrayList<Libro>();
        boolean libro = true, add = true;
        String nombre, autor;
        double precio, peso;
        int tamanio;
        do {
            System.out.println("Ingrese que tipo de libro quiere ingresar: " +
                    "\n1. Libro Impreso" +
                    "\n2. Libro Digital");
            int opc = teclado.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("Muy bien, ingrese el nombre del libro: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el autor del libro: ");
                    autor = teclado.nextLine();
                    System.out.println("Ingrese el precio: ");
                    precio = teclado.nextDouble();
                    System.out.println("Ingrese el peso del libro (kg): ");
                    peso = teclado.nextDouble();
                    LibroImpreso librito = new LibroImpreso(nombre, autor, precio, peso);
                }
            }
        } while (libro);
    }
}