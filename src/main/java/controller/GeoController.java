package controller;

import com.google.gson.Gson;
import models.GeoModel;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class GeoController {
	public static GeoModel getGeoData(String city) throws UnsupportedEncodingException {
		String API_KEY = services.APIKey.getAPI();
		String encodedCity = URLEncoder.encode(city, "UTF-8");
		String url ="http://api.openweathermap.org/geo/1.0/direct?q=" + encodedCity.toLowerCase() + "&apikey=" + API_KEY + "&format=json&limit=1";
		try(HttpClient client = HttpClient.newHttpClient()) {
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create(url))
					.build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			//System.out.println("Geolicalización: " + response.body());

			return new Gson().fromJson(response.body(), GeoModel[].class)[0];

		} catch (Exception e) {
			throw new RuntimeException("No encuentro la ciudad");
		}



	}
}
