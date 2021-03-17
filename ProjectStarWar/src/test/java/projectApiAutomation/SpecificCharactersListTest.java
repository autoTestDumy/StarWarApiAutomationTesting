package projectApiAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SpecificCharactersListTest {

	@Test(priority=1)
	void getCharacterDetailPeople1Test() {

		RestAssured.baseURI = "https://swapi.dev";

		RequestSpecification name1 = RestAssured.given();

		Response name1Response = name1.request(Method.GET, "/api/people/1/");

		String details1 = name1Response.getBody().asString();

		System.out.println(details1);
		
		System.out.println("*************** First ****************");

	}

	@Test(priority=2)
	void getCharacterDetailPeople2Test() {

		RestAssured.baseURI = "https://swapi.dev";

		RequestSpecification name2 = RestAssured.given();

		Response listResponse = name2.request(Method.GET, "/api/people/2/");

		String detail2 = listResponse.getBody().asString();

		System.out.println(detail2);
		
		System.out.println("*************** Second ****************");

	}
	
	@Test(priority=3)
	void getCharacterDetailPeople3Test() {

		RestAssured.baseURI = "https://swapi.dev";

		RequestSpecification name3 = RestAssured.given();

		Response listResponse = name3.request(Method.GET, "/api/people/3/");

		String detail3 = listResponse.getBody().asString();

		System.out.println(detail3);
		
		
		System.out.println("*************** Third ****************");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
