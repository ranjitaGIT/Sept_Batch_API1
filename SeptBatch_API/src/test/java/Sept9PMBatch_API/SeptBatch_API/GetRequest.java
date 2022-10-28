package Sept9PMBatch_API.SeptBatch_API;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest 
{
	public static void main(String[] args)
	{
		Response res=
	given()
	.contentType(ContentType.JSON)
	.when()
	.get("http://localhost:3000/Seleniumstudents?firstname=Ranjita");
		System.out.println("Status code is:"+ res.statusCode());
		System.out.println("Response data is");
		System.out.println(res.asString());
		System.out.println("PUSH&COMMIT");
		System.out.println("PUSH&COMMIT222");
		
	}
	
}
