import java.util.Scanner;

public class TiendaZapatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n    Bienvenidos al inventario de nuestra tienda!\n\n");

        System.out.print("Ingrese la cantidad de artículos a gestionar: ");
        int cantidadArticulos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        String[] nombresArticulos = new String[cantidadArticulos];
        int[] cantidadInicial = new int[cantidadArticulos];

        for (int i = 0; i < cantidadArticulos; i++) {
            System.out.print("Ingrese el nombre del artículo " + (i + 1) + ": ");
            nombresArticulos[i] = scanner.nextLine();

            System.out.print("Ingrese la cantidad inicial del artículo " + nombresArticulos[i] + ": ");
            cantidadInicial[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
        }

        System.out.println("\n      --- Gestión de ventas ---");
        for (int i = 0; i < cantidadArticulos; i++) {
            while (true) {
                System.out.print("Ingrese la cantidad de " + nombresArticulos[i] + " vendidos: ");
                int cantidadVendida = scanner.nextInt();
                if (cantidadVendida > cantidadInicial[i]) {
                    System.out.println("¡Error! La cantidad vendida no puede ser mayor a la cantidad inicial.");
                } else {
                    cantidadInicial[i] -= cantidadVendida;
                    break; // Sale del bucle while si la cantidad es válida
                }
            }
        }

        System.out.println("\n   --- Inventario actualizado ---");
        for (int i = 0; i < cantidadArticulos; i++) {
            System.out.println(nombresArticulos[i] + " disponibles= " + cantidadInicial[i]);
        }
    }
}