# ConversorApp
App para convertir monedas

# Conversor de Monedas en Java 💱

Este es un proyecto simple en Java que permite convertir monedas usando una API en línea.

## ¿Qué hace?

- Muestra un menú con 6 monedas: ARS, BOB, BRL, CLP, COP y USD.
- El usuario elige una moneda de origen y una de destino.
- Luego ingresa un monto a convertir.
- El programa consulta la tasa de cambio y muestra el resultado.

## Estructura

- `ConversorApp.java`: punto de entrada del programa.
- `MenuConversor.java`: se encarga de mostrar opciones al usuario.
- `ApiConversor.java`: consulta la API de tasas de cambio.
- `ConversionResponse.java`: modelo para leer la respuesta de la API.

## Cómo usarlo

1. Asegurate de tener Java instalado.
2. Cloná este repositorio o copiá los archivos a una carpeta.
3. Compilá el proyecto:
   ```bash
   javac *.java
