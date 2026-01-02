package Rest_Assured_API_Testing;

import io.restassured.RestAssured;
import io.restassured.response.*;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class GetRequest {
    //RestAssured:use for configuration and intialise API request
    //RequestSpecification:to define http request(INclude headers, parameter,body)
    //Response:It represent the HTTP response return by server
    //validation with hamcrest classes or hard and soft assertion

    @Test
    public void verifySimpleGetRequest() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        SoftAssert sf = new SoftAssert();

        Response rp = RestAssured.given()
                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .get("/booking")
                .then()
                .log().all()
                .statusCode(200)
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertNotNull(rp.jsonPath().getString("[0].bookingid"));
        sf.assertNotNull(rp.jsonPath().getString("[1].bookingid"));
    }
}
