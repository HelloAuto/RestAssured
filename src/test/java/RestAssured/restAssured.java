package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restAssured {
	
	@Test
	public void validateResponseCode() {
		
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		//System.out.println("2");
		int statusCode = resp.getStatusCode();
		//System.out.println("Status code is" +statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
	}
	
	@Test
	public void validateBody() {
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		String body = resp.asString();
		System.out.println("Data is :"+body);
	}
}
