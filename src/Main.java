import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        List<Libro> lstLibros = new ArrayList<Libro>();
        boolean libro = true, add = true;
        String nombre, autor;
        double precio, peso;
        int tamanio, menu;
        do {
            System.out.println("\tMenú " +
                    "\n1. Añadir Libro" +
                    "\n2. Ver lista de libros" +
                    "\n3. Salir");
            menu = teclado.nextInt();
            if (menu == 1) {
                System.out.println("Ingrese que tipo de libro quiere ingresar: " +
                        "\n1. Libro Impreso" +
                        "\n2. Libro Digital");
                int opc = teclado.nextInt(), decision;
                switch (opc) {
                    case 1 -> {
                        teclado.nextLine();
                        System.out.println("Muy bien, ingrese el nombre del libro: ");
                        nombre = teclado.nextLine();
                        System.out.println("Ingrese el autor del libro: ");
                        autor = teclado.nextLine();
                        System.out.println("Ingrese el precio: ");
                        precio = teclado.nextDouble();
                        System.out.println("Ingrese el peso del libro (kg): ");
                        peso = teclado.nextDouble();
                        LibroImpreso libritoI = new LibroImpreso(nombre, autor, precio, peso);
                        lstLibros.add(libritoI);
                        do {
                            System.out.println("Desea añadir otro libro? \n1. Si \n2. No");
                            decision = teclado.nextInt();
                            if (decision == 2) {
                                add = false;
                            } else if (decision == 1) {
                                add = false;
                            } else {
                                System.out.println("Esa no es una opción.");
                            }
                        } while (add);
                    }
                    case 2 -> {
                        teclado.nextLine();
                        System.out.println("Muy bien, ingrese el nombre del libro: ");
                        nombre = teclado.nextLine();
                        System.out.println("Ingrese el autor del libro: ");
                        autor = teclado.nextLine();
                        System.out.println("Ingrese el precio: ");
                        precio = teclado.nextDouble();
                        System.out.println("Ingrese el peso del archivo (mb): ");
                        tamanio = teclado.nextInt();
                        LibroDigital libritoD = new LibroDigital(nombre, autor, precio, tamanio);
                        lstLibros.add(libritoD);
                        do {
                            System.out.println("Desea añadir otro libro? \n1. Si \n2. No");
                            decision = teclado.nextInt();
                            if (decision == 2) {
                                add = false;
                            } else if (decision == 1) {
                                add = false;
                            } else {
                                System.out.println("Esa no es una opción.");
                            }
                        } while (add);
                    }
                }
            } else if (menu == 2) {
                int i = 1;
                for (Libro l : lstLibros) {
                    System.out.println("Libro " + i + ". " + l);
                    i++;
                }
            } else if (menu == 3) {
                libro = false;
            }
        } while (libro);
        System.out.println("Gracias por usar el programa.");
    }
}