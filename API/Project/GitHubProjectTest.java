package Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import org.testng.annotations.BeforeClass;

import java.util.HashMap;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterClass;

public class GitHubProjectTest {
	//SSH key to test with
	String sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIG4OTIbo1nIi+N355NWd5JkAFvyM3XhwAPxCdaLC1w1t";
	//Temp varaibale to share id
	int keyId;
	//Declare the request and response specs
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	
 
  @BeforeClass
  public void setup() {
	  //Intialize the request specification
	  requestSpec  = new RequestSpecBuilder().build();
	       setbaseUri("https://api.github.com/user/keys").
	       addHeader("Content-Type", "application/json").
	       addHeader("Authorization", "token ghp_cAyi9H0YY7HBKVWfl3C6JI7dZ1kq1C22Bln ").
	       addHeader("X-Github-Api-Version", "2022-11-28").
	       build();
	       
	       //Initialize the request specification
	       requestSpec = (RequestSpecification) new ResponseSpecBuilder().
	    		   expectBody("title",Matchers.equalTo("TestKey")).
	    		   expectBody("key",Matchers.equalTo(sshKey)).
	    		   expectResponseTime(Matchers.lessThanOrEqualTo(3000L)).
	    		   build();
	       
	       
	       
  }
  @Test
  public void postRequestTest() {
	  //Create request body
	  HashMap<String, String> reqBody = new HashMap<String, String>();
	  reqBody.put("title", "TestKey");
	  reqBody.put("key",sshKey);
	  //Send request,Save response
	  Response response = RestAssured.
			  given().spec(requestSpec).body(reqBody)
			  .when().post();
	  //Extract the id from response
	  keyId = response.then().extract().path("id");
	  //Assertions
	  response.then().
	  statusCode(201).
	  spec( responseSpec).log().all();
			  
	  
  }
  @Test(priority = 2)
  public void getRequestTest() {
  	// Send request, save response
  	RestAssured.given().spec(requestSpec).pathParam("keyId", keyId).
		when().get("/{keyId}").
		then().statusCode(200).spec(responseSpec);
  }
  	 @Test(priority = 3)
  	  public void deleteRequestTest() {
  	  	// Send request, save response
  	  	RestAssured.given().spec(requestSpec).pathParam("keyId", keyId).
  			when().delete("/{keyId}").
  			then().statusCode(204).time(Matchers.lessThanOrEqualTo(3000L));
  }
  

  private RequestSpecBuilder setbaseUri(String string) {
	// TODO Auto-generated method stub
	return null;
}

  @AfterClass
  public void afterClass() {
  }

}
