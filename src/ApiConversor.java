import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ApiConversor {

    public double obtenerTasa(String monedaOrigen, String monedaDestino) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/76ac0313416f13de3094c27e/latest/" + monedaOrigen;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Parsear JSON
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
        JsonObject tasas = jsonObject.getAsJsonObject("conversion_rates");

        if (tasas.has(monedaDestino)) {
            return tasas.get(monedaDestino).getAsDouble();
        } else {
            throw new IllegalArgumentException("No se encontró la tasa para la moneda: " + monedaDestino);
        }
    }
}
