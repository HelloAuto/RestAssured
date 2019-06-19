package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//import io.restassured.response.Response;

public class restAssuredStaticImport {
	
	@Test
	public void validateResponseCode() {
		
		//Response resp = get("https://reqres.in/api/users?page=2");
		//System.out.println("2");
		//int statusCode = resp.getStatusCode();
		int statusCode = get("https://reqres.in/api/users?page=2").getStatusCode();
		System.out.println("Status code is" +statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
	}
	
	@Test
	public void validateBody() {
		//Response resp = get("https://reqres.in/api/users?page=2");
		//String body = resp.asString();
		String body = get("https://reqres.in/api/users?page=2").asString();
		long responseTime = get("https://reqres.in/api/users?page=2").getTime();
		System.out.println("Data is :"+body);
		System.out.println("Response time is : "+responseTime);
	}
}
