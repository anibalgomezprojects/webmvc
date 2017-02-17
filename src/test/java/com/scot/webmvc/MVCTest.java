package com.scot.webmvc;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

/**
 * Fererencia: http://stackoverflow.com/questions/5769717/how-can-i-get-an-http-response-body-as-a-string-in-java
 * @author Operaciones CODES
 *
 */
public class MVCTest {

	@Test
	public void test() throws ClientProtocolException, IOException {
		String url = "http://localhost:8080/webmvc/app/hello?name=john";
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpResponse response = httpClient.execute(new HttpGet(url));
		HttpEntity entity = response.getEntity();
		String responseString = EntityUtils.toString(entity, "UTF-8");
		System.out.println(responseString);
	}

}
