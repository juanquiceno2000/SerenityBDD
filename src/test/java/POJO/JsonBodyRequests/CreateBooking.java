package POJO.JsonBodyRequests;


import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class CreateBooking {
    private static final String postBrandNewBooking = "https://restful-booker.herokuapp.com/booking";

    static String createBrandNewBooking = "{ \r\n" +
            "\"firstname\": \"JQ\",\r\n" +
            "\"lastname\": \"Test\",\r\n" +
            "\"totalprice\": \"4000\",\r\n" +
            "\"depositpaid\": \"true\",\r\n" +
            "\"bookingdates\":\r\n" +
            "{\r\n" +
            "\"checkin\": \"2018-01-01\",\r\n" +
            "\"checkout\": \"2019-01-01\"\r\n" +
            "},\r\n" +
            "\"additionalneeds\": \"Breakfast\"\r\n" +
            "}";

    public static int CreateBrandNewBooking() {
        RequestSpecification request =
                RestAssured.given()
                        .baseUri(postBrandNewBooking);

        request.header("Content-Type", "application/json");
        request.header("Accept", "*/*");
        request.body(createBrandNewBooking);

        Response response = request.post(postBrandNewBooking);
        return response.statusCode();
    }
}
