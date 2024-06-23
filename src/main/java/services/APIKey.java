package services;

import java.io.InputStream;
import java.util.Properties;

public class APIKey {
	public static String API;

	public static String getAPI() {
		InputStream stream = APIKey.class.getClassLoader().getResourceAsStream("app.properties");
		Properties properties = new Properties();
		try {
			properties.load(stream);
			API = properties.getProperty("api_key");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return API;
	}

}
