import java.util.Scanner;

public class MenuConversor {
    private final Scanner scanner = new Scanner(System.in);
    private final String[] monedas = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};

    public String elegirMoneda(String tipo) {
        int opcion = -1;
        while (opcion < 1 || opcion > monedas.length) {
            System.out.println("Seleccione la moneda de " + tipo + ":");
            for (int i = 0; i < monedas.length; i++) {
                System.out.println((i + 1) + ". " + monedas[i]);
            }
            System.out.print("Opción (1-" + monedas.length + "): ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                if (opcion < 1 || opcion > monedas.length) {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debe ingresar un número.");
            }
        }
        return monedas[opcion - 1];
    }

    public double pedirCantidad() {
        System.out.print("Ingrese la cantidad a convertir: ");
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número válido: ");
            }
        }
    }
}
