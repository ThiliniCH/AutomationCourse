package country.api.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CountryTestTest {

    public static final String END_POINTS = "http://services.groupkt.com/country/get/";
    public static final String PATH_PARAM_ISOCODE = "code";
    public static final String PATH_PARAM_ISOFORMAT = "format";

    @Test
    public void getAllCountries() {
        given()
                .when().log().all()
                .get(END_POINTS)
                .then().log().body()
                .statusCode(200).body(
                "RestResponse.result.name", equalTo("India")
        );
    }

    @Test
    public void getCountryNameByISOCode2() {
        given().log().all()
                .pathParam(PATH_PARAM_ISOFORMAT, "iso3code")
                .pathParam(PATH_PARAM_ISOCODE, "LKA")
                .when().log().all()
                .get(END_POINTS + "{" + PATH_PARAM_ISOFORMAT + "}/{" + PATH_PARAM_ISOCODE + "}")
                .then().log().body()
                .statusCode(200)
                .body(
                        "RestResponse.result.name", equalTo("Sri Lanka")
                );

    }

    @Test
    public void getCountryNameByISOCode3() {
        given()
                .when().log().all()
                .get(END_POINTS + "iso3code/IND")
                .then().log().body()
                .statusCode(200)
                .body(
                        "RestResponse.result.name", equalTo("India")
                );
    }
}