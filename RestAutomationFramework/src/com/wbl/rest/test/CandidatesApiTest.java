package com.wbl.rest.test;

import java.io.IOException;
import static org.testng.Assert.*;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.rest.main.BaseTest;
import com.wbl.rest.main.RestApiExecutor;
import com.wbl.rest.util.ExcelUtils;



public class CandidatesApiTest extends BaseTest {

	@DataProvider(name="rest-data")
	public Object [][] getData(){
	return ExcelUtils.getExcelData("Sheet1","restData.xlsx");
	
	}

	@Test(dataProvider="rest-data")
	public void testGetCandidates(String resource, String requestData) throws ClientProtocolException, IOException{
		RestApiExecutor rs = new RestApiExecutor();
		//HttpResponse response = rs.httpGet("https://itunes.apple.com/lookup?id=909253");
		
		HttpResponse response = rs.httpGet(resource, null, requestData);

		System.out.println("Status code:"+response.getStatusLine().getStatusCode());
		assertEquals(200,response.getStatusLine().getStatusCode());//status code 
		System.out.println("response message:"+response.getStatusLine().getReasonPhrase());//status message
		
		//JSONObject jsonObj1= new JSONObject(IOUtils.toString(response.getEntity().getContent()));
		
	//	System.out.println("response:"+jsonObj1);
		//System.out.println("Size of Array:"+jsonObj1.length()  );
		 
		//To retrieve of  Array 
		JSONArray jsonArr= new JSONArray(IOUtils.toString(response.getEntity().getContent()));
		System.out.println("response:"+jsonArr);
		assertEquals("application/json;charset=utf-8",response.getHeaders("Content-Type"));//header data assertion 
		JSONObject json	= (JSONObject)jsonArr.get(0);
		assertEquals(3595, json.get("id"));//actual data
		assertTrue(json.has("contactid"));// element present 

	}

}
 