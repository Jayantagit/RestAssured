package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured 
{
	@Test
	
	public void test()
	{
     
		io.restassured.RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httprequest=io.restassured.RestAssured.given();
		
		Response response = httprequest.get("/Kolkata");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
}
