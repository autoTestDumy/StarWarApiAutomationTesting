package projectApiAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ListOfPlanetsTest {
	
	

	@Test(priority=1)
	void getPlanetListTest() {

		RestAssured.baseURI = "https://swapi.dev";

		RequestSpecification list = RestAssured.given();

		Response listResponse = list.request(Method.GET, "/api/planets/");

		String detailList = listResponse.getBody().asString();

		System.out.println(detailList);
		
		
	}
	
	
	
	
	
	
	
	

}
