package country.api.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class TimeZone {

    public static final String END_POINTS = "https://maps.googleapis.com/maps/api/timezone/json?location=6.8623907,79.8223258&timestamp=1458000000&key=AIzaSyCX_-pOvJhw9ZIpj2h6Tk9Zab8y6i06jEw";
    public static final String QUERY_PARAM_LOCATION = "location";
    public static final String QUERY_PARAM_TIMESTAMP = "timestamp";
    public static final String QUERY_PARAM_KEY = "key";

    @Test
    public void getTimeZone() {
        given().log().all()
                .queryParam(QUERY_PARAM_LOCATION, "6.8623907,79.8223258")
                .queryParam(QUERY_PARAM_TIMESTAMP, "1458000000")
                .queryParam(QUERY_PARAM_KEY, "AIzaSyCX_-pOvJhw9ZIpj2h6Tk9Zab8y6i06jEw")
                .when().log().all()
                .get(END_POINTS)
                .then().log().body()
                .statusCode(200)
                .body("dstOffset",equalTo(0),
                        "rawOffset",equalTo(19800),
                        "status",equalTo("OK"),
                        "timeZoneId",equalTo("Asia/Colombo"),
                        "timeZoneName",equalTo("India Standard Time"));

    }
}
