public class ConversorApp {
    public static void main(String[] args) {
        MenuConversor menu = new MenuConversor();
        ApiConversor api = new ApiConversor();

        try {
            String origen = menu.elegirMoneda("origen");
            String destino = menu.elegirMoneda("destino");
            double cantidad = menu.pedirCantidad();

            double tasa = api.obtenerTasa(origen, destino);
            double resultado = cantidad * tasa;

            System.out.println("\n" + cantidad + " " + origen + " equivale a " + resultado + " " + destino);
        } catch (Exception e) {
            System.out.println("Error al obtener la conversión: " + e.getMessage());
        }
    }
}
