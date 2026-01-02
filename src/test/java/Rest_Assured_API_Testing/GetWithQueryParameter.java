package Rest_Assured_API_Testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.hamcrest.*;
import org.testng.annotations.Test;


public class GetWithQueryParameter {
    @Test
    public void verifySimpleGetRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
//https://postman-echo.com/get?test=123

         RestAssured.given()
                .queryParam("test", "123")//test=123
               // .header("Host", "<calculated when request is sent>")

              //  .header("Cookie", "token=abc123")
              //  .header("Accept", "*/*")

                .log().all()
                .when()
                .get("/get")
                .then()
                .log().all()
                .statusCode(200)
                .body("args.test", Matchers.equalTo("123"));
    }
}
