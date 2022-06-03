import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;
import org.testng.annotations.Test;
//import static io.restassured.RestAssured.given;

public class ApiTest {

/*
    @Test
    void test1(){

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        response.getStatusCode();
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());

    }

 */

    @Test
    public void test2(){


            baseURI = "https://reqres.in/api";
           given()
                   .when()
                         .get("/users")
                   .then()
                            .statusCode(200)
                            .body("data[1].first_name",equalTo("Janet"))
                            .log().all();


           








    }
}
