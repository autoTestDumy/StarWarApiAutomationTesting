package projectApiAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SpecifiedPlanetDetailsTest {
	
	@Test(priority=1)
	void getCharacterDetailPeople1Test() {

		RestAssured.baseURI = "https://swapi.dev";

		RequestSpecification planet1 = RestAssured.given();

		Response planet1Response = planet1.request(Method.GET, "/api/planets/1/");

		String details1 = planet1Response.getBody().asString();

		System.out.println(details1);
		
		System.out.println("*************** First ****************");

	}

	@Test(priority=2)
	void getCharacterDetailPeople2Test() {

		RestAssured.baseURI = "https://swapi.dev";

		RequestSpecification planet2 = RestAssured.given();

		Response planet2Response = planet2.request(Method.GET, "/api/planets/2/");

		String detail2 = planet2Response.getBody().asString();

		System.out.println(detail2);
		
		System.out.println("*************** Second ****************");

	}
	
	@Test(priority=3)
	void getCharacterDetailPeople3Test() {

		RestAssured.baseURI = "https://swapi.dev";

		RequestSpecification planet3 = RestAssured.given();

		Response planet3Response = planet3.request(Method.GET, "/api/planets/3/");

		String detail3 = planet3Response.getBody().asString();

		System.out.println(detail3);
		
		
		System.out.println("*************** Third ****************");

	}

}
