package com.wbl.rest.util;

import java.io.IOException;
import java.util.HashMap;
import org.apache.commons.io.IOUtils; 
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;


public class JsonParser {
	
	private HttpResponse response;

	public HttpResponse getResponse() {
		return response;
	}

	public void setResponse(HttpResponse response) {
		this.response = response;
	}
	
	public int getStatusCode(){
		return response.getStatusLine().getStatusCode(); 
	}
	
	public String getResponseMessage(){
		return response.getStatusLine().getReasonPhrase();
	}
	
	public String getHeaderData(String key){
		return response.getFirstHeader(key).getValue();
	}
	
	public HashMap<String,String> getAllHeaders(){
		Header [] headers = response.getAllHeaders();
		HashMap<String,String> headerMap = new HashMap<String,String>();
		for (int i=0; i<headers.length;i++){
			headerMap.put(headers[i].getName(),headers[i].getValue());
		}
		return headerMap;
	}
	
	public String getActualData(String key){
		String value = "";
		try {
			JSONObject json = new JSONObject(IOUtils.toString(response.getEntity().getContent()));
			value=json.getString(key);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
		
	}
	
	public JSONObject getJSONObject(int index){
		JSONObject  value = null;
		try {
			JSONArray json = new JSONArray(IOUtils.toString(response.getEntity().getContent()));
			value=json.getJSONObject(index);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
		
	}
}
