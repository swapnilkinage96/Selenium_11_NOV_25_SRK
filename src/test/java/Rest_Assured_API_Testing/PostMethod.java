package Rest_Assured_API_Testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class PostMethod {
    @Test
    public void verifySimplePostRequest() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        JSONObject js = new JSONObject();
        JSONObject js2 = new JSONObject();
        js.put("firstname", "Swapnil");
        js.put("lastname", "patil");
        js.put("totalprice", "123");
        js.put("depositpaid", true);
        js.put("bookingdates", js2);
        js.put("bookingdates", js2);
        js.put("additionalneeds", "Breakfast");

        js2.put("checkin", "2025-12-12");
        js2.put("checkout", "2025-12-12");


        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(js.toString())
                .log().all()
                .when()
                .post("/booking")
                .then()
                .log().all()
                .statusCode(200)
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("booking", Matchers.equalTo(988),
                        "booking.firstname",Matchers.equalTo("Jim"),
                        "additionalneeds",Matchers.equalTo("Breakfast"));

    }
}
