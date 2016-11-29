package com.wbl.rest.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

public class QuickTest {
	
	public static void main(String [] args) {
		
		CloseableHttpClient http = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet("https://itunes.apple.com/lookup?id=909253");
		 HttpResponse resp;

		try {
			resp = http.execute(get);
			 JSONObject obj = new JSONObject(resp);

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
