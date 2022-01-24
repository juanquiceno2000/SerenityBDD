package POJO.JsonBodyRequests;


import POJO.JsonModel.ReadBookings;
import POJO.XmlModel.PhoneDetails;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.restassured.RestAssured;
import com.google.gson.*;

import java.io.IOException;
import java.util.Objects;


public class ReadBookingsIds {
    private static final String LOCATION_BY_POST_CODE_AND_COUNTRY_URL = "https://reqres.in/api/users?page=2";

    public static int deserializeFromJsonBookingIds() {
        String jsonString = RestAssured.get(LOCATION_BY_POST_CODE_AND_COUNTRY_URL).asPrettyString();

        Gson gson = new GsonBuilder().create();
        ReadBookings readBookings = gson.fromJson(jsonString, ReadBookings.class);

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

        return RestAssured.get(LOCATION_BY_POST_CODE_AND_COUNTRY_URL).statusCode();
    }

    public static boolean deserializeFromXMLPhoneDetails() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();

        String xmlString = "<PhoneDetails><name>Note 20</name><displaySize>6.2</displaySize><memory>12Gb</memory><price>3000000</price></PhoneDetails>";

        // deserialize from the XML into a Phone object
        PhoneDetails deserializedData = xmlMapper.readValue(xmlString, PhoneDetails.class);

        // Print object details
        String data1 = deserializedData.name;
        String data2 = deserializedData.displaySize;
        String data3 = deserializedData.memory;
        int data4 = deserializedData.price;

        if (!Objects.equals(data1, "") && !Objects.equals(data2, "") && !Objects.equals(data3, "") && data4 != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
