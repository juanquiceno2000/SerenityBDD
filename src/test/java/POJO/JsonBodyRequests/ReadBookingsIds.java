package POJO.JsonBodyRequests;


import io.restassured.response.Response;
import io.restassured.RestAssured;

public class ReadBookingsIds {
    private static final String LOCATION_BY_POST_CODE_AND_COUNTRY = "https://reqres.in/api/users?page=2";

    public static int GetBookingIds() {
        return RestAssured.get("https://reqres.in/api/users?page=2").statusCode();
    }
}
