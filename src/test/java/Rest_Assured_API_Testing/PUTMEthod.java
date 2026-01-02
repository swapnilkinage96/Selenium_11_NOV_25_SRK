package Rest_Assured_API_Testing;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PUTMEthod {
    @Test
    public void verifySimplePostRequest() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        JSONObject js = new JSONObject();
        JSONObject js2 = new JSONObject();
        js.put("firstname", "swapnil");
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
                .header("Cookie", "token=e17d8d1c3aaa588")
                .body(js.toString())
                .log().all()
                .when()
                .put("booking/2")
                .then()
                .log().all()
                .statusCode(200)
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body(
                        "firstname",Matchers.equalTo("swapnil"),
                        "additionalneeds",Matchers.equalTo("Breakfast"));

    }
}
