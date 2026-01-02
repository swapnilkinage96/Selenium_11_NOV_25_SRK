package Rest_Assured_API_Testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.*;

public class ChainingApi {

    @Test
    public void verifyPutMethod() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        JSONObject js3 = new JSONObject();
        js3.put("username", "admin");
        js3.put("password", "password123");
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(js3.toString())
                .log().all()
                .when()
                .post("https://restful-booker.herokuapp.com/auth")
                .then().log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        String accessToken = response.jsonPath().getString("token");

        JSONObject js = new JSONObject();
        JSONObject js2 = new JSONObject();

        js.put("firstname", "Dinesh");
        js.put("lastname", "Patil");
        js.put("totalprice", "123");
        js.put("depositpaid", true);
        js.put("bookingdates", js2);
        js.put("additionalneeds", "Breakfast");
        js2.put("checkin", "2018-01-01");
        js2.put("checkout", "2019-01-01");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token=" + accessToken)
                .body(js.toString())
                .log().all()
                .when()
                .put("booking/2")
                .then().log().all()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body(
                        "firstname", Matchers.equalTo("Dinesh"),
                        "additionalneeds", Matchers.equalTo("Breakfast"));
    }
}

