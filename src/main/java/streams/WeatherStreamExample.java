package streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class WeatherStreamExample {
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		WeatherStreamExample wse = new WeatherStreamExample();
		System.out.println(wse.requestWeatherData("Chicago"));
	}
	
	private String requestWeatherData(String city) throws ClientProtocolException, IOException {
		Gson gson = new Gson();
		String apiKey = "1da43e8dee97c705ac07612849a201ec";
		String weatherApiUrl = "http://samples.openweathermap.org/data/2.5/weather?q=" + 
								city + "&appId="+apiKey;
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(weatherApiUrl);
		CloseableHttpResponse response = httpClient.execute(httpGet);
		HttpEntity entity = response.getEntity();
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
		String output = null;
		StringBuilder sb = new StringBuilder();
		
		while ((output = reader.readLine()) != null) {
			sb.append(output);
		}
	
		response.close();
		return gson.toJson(sb);
	}

}
