package POJO.JsonBodyRequests;


import POJO.JsonModel.ReadBookings;
import io.restassured.RestAssured;
import com.google.gson.*;


public class ReadBookingsIds {
    private static final String LOCATION_BY_POST_CODE_AND_COUNTRY_URL = "https://reqres.in/api/users?page=2";

    public static int GetBookingIds() {
        String json = RestAssured.get(LOCATION_BY_POST_CODE_AND_COUNTRY_URL).asPrettyString();
        System.out.print(json);

        Gson gson = new GsonBuilder().create();
        ReadBookings readBookings = gson.fromJson(json, ReadBookings.class);

        int data1 = readBookings.page;
        int data2 = readBookings.per_page;
        int data3 = readBookings.total;
        int data4 = readBookings.total_pages;
        int data5 = readBookings.data.get(0).id;
        String data6 = readBookings.data.get(0).email;
        String data7 = readBookings.data.get(0).first_name;
        String data8 = readBookings.data.get(0).last_name;
        String data9 = readBookings.data.get(0).avatar;
        String data10 = readBookings.support.url;
        String data11 = readBookings.support.text;

        return RestAssured.get("https://reqres.in/api/users?page=2").statusCode();
    }
}
