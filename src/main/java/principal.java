import services.Datos;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class principal {
	public static void main(String[] args) throws UnsupportedEncodingException {

		//GeoModel geoModel = new GeoModel(GeoController.getGeoData("Bogota"));
		//WeatherModel weatherModel = new WeatherModel(WeatherController.getWeatherData(geoModel)) ;

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		while (opcion != 7) {
			System.out.println("Challenge Cieloscopio: ");
			System.out.println("---------------------------------");
			System.out.println("Elige una ciudad para obtener los datos del meteorológicos: ");
			System.out.println("1. Ciudad de México");
			System.out.println("2. Buenos Aires");
			System.out.println("3. Bogotá");
			System.out.println("4. Lima");
			System.out.println("5. Santiago");
			System.out.println("6. Deseo consultar otra ciudad");
			System.out.println("7. Salir");
			System.out.println("---------------------------------");
			System.out.println("Elige una opción basada en el número: ");
			try {
				opcion = teclado.nextInt();
			} catch (Exception e) {
				System.out.println("Opción no válida");
				teclado.next();
			}

			switch (opcion) {
				case 1:
					Datos.mostrarDatos("Ciudad de México");
					break;
				case 2:
					Datos.mostrarDatos("Buenos Aires");
					break;
				case 3:
					Datos.mostrarDatos("Bogota");
					break;
				case 4:
					Datos.mostrarDatos("Lima");
					break;
				case 5:
					Datos.mostrarDatos("Santiago");
					break;
				case 6:
					System.out.println("Escribe el nombre de la ciudad: ");
					String ciudad = teclado.next();
					Datos.mostrarDatos(ciudad);
					break;
				case 7:
					System.out.println("Gracias por usar el programa");
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		}

	}
}
