package controller;

import com.google.gson.Gson;
import models.GeoModel;
import models.WeatherModel;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherController {
	public static WeatherModel getWeatherData(GeoModel geoModel) {
		String API_KEY = services.APIKey.getAPI();
		String url = "https://api.openweathermap.org/data/2.5/weather?lat=" + geoModel.getLat() + "&lon=" + geoModel.getLon() + "&units=metric&lang=sp" + "&appid=" + API_KEY;

		try(HttpClient client = HttpClient.newHttpClient())  {
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create(url))
					.build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			String body = response.body();
			//System.out.println(body);

			return new Gson().fromJson(body, WeatherModel.class);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException("No encuentro la información del clima");
		}

	}

}
