package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private static ArrayList<Tarjeta> tarjeta = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nGestion de tarjetas:");
            System.out.println("1. Listar informacion de tarjetas.");
            System.out.println("2. Historial de meses");
            System.out.println("3. Guardar informacion tarjetas");
            System.out.println("4. Buscar mes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción (1-5): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    listarInfoTarjetas(scanner);
                    break;
                case 2:
                    HistorialMeses(scanner);
                    break;
                case 3:
                    GuardarInfo(scanner);
                    break;
                case 4:
                    BuscarMes(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    private static void BuscarMes(Scanner scanner) {
        System.out.println("1. Enero");
        System.out.println("2. Febrero");
        System.out.println("3. Marzo");
        System.out.println("4. Abril");
        System.out.println("5. Mayo");
        System.out.println("6. Junio");
        System.out.println("7. Julio");
        System.out.println("8. Agosto");
        System.out.println("9. Septiembre");
        System.out.println("10. Octubre");
        System.out.println("11. Noviembre");
        System.out.println("12. Diciembre");
        
    }

    private static void listarInfoTarjetas(Scanner scanner) {
    }

    private static void HistorialMeses(Scanner scanner) {
    }

    private static void GuardarInfo(Scanner scanner) {
    }
}

