package services;

import controller.GeoController;
import controller.WeatherController;
import models.GeoModel;
import models.WeatherModel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datos {
	public static void mostrarDatos(String ciudad){
		try {
			Date fechaActual = new Date();
			SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");

			GeoModel geoModel = new GeoModel(GeoController.getGeoData(ciudad));
			WeatherModel weatherModel = new WeatherModel(WeatherController.getWeatherData(geoModel));
			System.out.println("---------------------------------");
			System.out.println("Respuesta:");
			if (geoModel.getLocal_names() == null) {
				System.out.println("Cuidad: " + ciudad);
			}else{
				System.out.println("Cuidad: " + geoModel.getLocal_names().getOrDefault("es", ciudad));
			}
			System.out.println("Fecha: " + formatoFecha.format(fechaActual));
			System.out.println("Horario: " + formatoHora.format(fechaActual));
			System.out.println(" ");
			System.out.println("Temperatura actual: " + weatherModel.getMain().temp() + "°C");
			System.out.println("Condición climática: " + weatherModel.getWeather().getFirst().description());
			System.out.println(" ");
			System.out.println("Temperatura minima: " + weatherModel.getMain().temp_min() + "°C");
			System.out.println("Temperatura máxima: " + weatherModel.getMain().temp_max() + "°C");
			System.out.println("Humedad: " + weatherModel.getMain().humidity() + "%");
			System.out.println("---------------------------------");
			System.out.println(" ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
