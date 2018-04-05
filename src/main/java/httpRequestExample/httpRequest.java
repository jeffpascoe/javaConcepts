package httpRequestExample;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class httpRequest {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://www.google.com");
		CloseableHttpResponse response = httpClient.execute(httpGet);
		
		try {
			System.out.println(response.getStatusLine().getStatusCode());
		} finally {
			response.close();
		}
	}

}
