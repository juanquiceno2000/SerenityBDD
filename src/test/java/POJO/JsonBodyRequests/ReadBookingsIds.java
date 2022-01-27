package POJO.JsonBodyRequests;


import POJO.JsonModel.ReadBookings;
import POJO.XmlModel.Payload;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
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

    public static boolean deserializeFromXMLActionItem() throws IOException {
        String xmlString = "<Payload>" +
                "    <Status>Success</Status>" +
                "    <Message>PublishWorkflowItem processed 2 records for event type [Action Item] from 2020-03-01T00:00:00 to 2020-03-10T00:00:00</Message>" +
                "    <EventType>Action Item</EventType>" +
                "    <records>" +
                "        <record>" +
                "            <Id>88495</Id>" +
                "            <EntityTypeName>WorkflowItem</EntityTypeName>" +
                "            <WorkflowItemGuid>f166312c-f737-4892</WorkflowItemGuid>" +
                "            <StudyId>826</StudyId>" +
                "            <StudyGuid>83218726-3889-4842</StudyGuid>" +
                "            <StudyName>Manchester United Study</StudyName>" +
                "            <SiteId>2596</SiteId>" +
                "            <SiteGuid>7df7cd35-5eb1-hhh</SiteGuid>" +
                "            <SiteCode>CA-01</SiteCode>" +
                "            <SiteName>Manchester United</SiteName>" +
                "            <SiteCountry>Canada</SiteCountry>" +
                "            <PrincipalInvestigatorName>No No</PrincipalInvestigatorName>" +
                "            <SitePrimaryCraName>JQ</SitePrimaryCraName>" +
                "            <Name></Name>" +
                "            <Details></Details>" +
                "            <Content>" +
                "                <ActionItemContent>" +
                "                    <SequentialIdentifier>10</SequentialIdentifier>" +
                "                    <ActionItemCategory>Data Management</ActionItemCategory>" +
                "                    <ActionItemStudyCategory>Data Management</ActionItemStudyCategory>" +
                "                </ActionItemContent>" +
                "            </Content>" +
                "            <WorkflowTypeName>Action Item</WorkflowTypeName>" +
                "            <WorkflowStatusName>Ongoing</WorkflowStatusName>" +
                "            <WorkflowStatusTypeName>Open</WorkflowStatusTypeName>" +
                "            <TargetDate>2020-05-01T22:00:00</TargetDate>" +
                "            <IdentifiedDate>2020-03-02T22:00:00</IdentifiedDate>" +
                "            <IdentifiedPersonName>JQ</IdentifiedPersonName>" +
                "            <CreatedDate>2020-03-02T21:45:19.9319433</CreatedDate>" +
                "            <CreatedPersonId>143</CreatedPersonId>" +
                "            <CreatedPersonExternalIdentifier>TestUser-33333</CreatedPersonExternalIdentifier>" +
                "            <CreatedPersonName>JQ</CreatedPersonName>" +
                "            <ModifiedDate>2020-03-02T21:45:19.9319433</ModifiedDate>" +
                "            <ModifiedPersonId>143</ModifiedPersonId>" +
                "            <ModifiedPersonExternalIdentifier>TestUser-3333</ModifiedPersonExternalIdentifier>" +
                "            <ModifiedPersonName>JQ</ModifiedPersonName>" +
                "            <IsPackagedFlag>false</IsPackagedFlag>" +
                "        </record>" +
                "        <record>" +
                "            <Id>88546</Id>" +
                "            <EntityTypeName>WorkflowItem</EntityTypeName>" +
                "            <WorkflowItemGuid>56f0149a-9337</WorkflowItemGuid>" +
                "            <StudyId>1</StudyId>" +
                "            <StudyGuid>aa522116-1914-4aef</StudyGuid>" +
                "            <StudyName>CTE-1501</StudyName>" +
                "            <SiteId>40</SiteId>" +
                "            <SiteGuid>cb0c4c65-4e86-4ceb</SiteGuid>" +
                "            <SiteCode>1</SiteCode>" +
                "            <SiteName></SiteName>" +
                "            <SiteCountry></SiteCountry>" +
                "            <PrincipalInvestigatorName></PrincipalInvestigatorName>" +
                "            <SitePrimaryCraName>JQ</SitePrimaryCraName>" +
                "            <SiteVisitId>552</SiteVisitId>" +
                "            <SiteVisitEventType>SQV</SiteVisitEventType>" +
                "            <SiteVisitPrimaryCraName>JQ</SiteVisitPrimaryCraName>" +
                "            <SiteVisitStartDate>2020-02-11T13:29:55</SiteVisitStartDate>" +
                "            <SiteVisitEndDate>2020-02-11T13:29:55</SiteVisitEndDate>" +
                "            <SiteVisitStatusName>Projected</SiteVisitStatusName>" +
                "            <SiteVisitLength>1</SiteVisitLength>" +
                "            <Name></Name>" +
                "            <Details></Details>" +
                "            <Content>" +
                "                <ActionItemContent>" +
                "                    <SequentialIdentifier>7</SequentialIdentifier>" +
                "                    <ActionItemCategory>Data Management</ActionItemCategory>" +
                "                    <ActionItemStudyCategory>Data Management</ActionItemStudyCategory>" +
                "                </ActionItemContent>" +
                "            </Content>" +
                "            <WorkflowTypeName>Action Item</WorkflowTypeName>" +
                "            <WorkflowStatusName>Resolved</WorkflowStatusName>" +
                "            <WorkflowStatusTypeName>Closed</WorkflowStatusTypeName>" +
                "            <TargetDate>2020-02-28T22:00:00</TargetDate>" +
                "            <IdentifiedDate>2020-02-11T22:00:00</IdentifiedDate>" +
                "            <IdentifiedPersonName>JQ</IdentifiedPersonName>" +
                "            <ClosedDate>2020-03-06T17:21:08.75</ClosedDate>" +
                "            <ClosedPerson>JQ</ClosedPerson>" +
                "            <CreatedDate>2020-03-03T12:38:55.808345</CreatedDate>" +
                "            <CreatedPersonId>19</CreatedPersonId>" +
                "            <CreatedPersonExternalIdentifier>TestUser-222</CreatedPersonExternalIdentifier>" +
                "            <CreatedPersonName>JQ</CreatedPersonName>" +
                "            <ModifiedDate>2020-03-06T17:21:15.0309044</ModifiedDate>" +
                "            <ModifiedPersonId>876</ModifiedPersonId>" +
                "            <ModifiedPersonExternalIdentifier>TestUser-876</ModifiedPersonExternalIdentifier>" +
                "            <ModifiedPersonName>JQ</ModifiedPersonName>" +
                "            <IsPackagedFlag>false</IsPackagedFlag>" +
                "            <SiteVisitEventDisplayName>SQV</SiteVisitEventDisplayName>" +
                "        </record>" +
                "    </records>" +
                "</Payload>";

        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        Payload deserializedData = xmlMapper.readValue(xmlString, Payload.class);

        // Print object details
        String data1 = deserializedData.Status;
        String data2 = deserializedData.Message;
        String data3 = deserializedData.EventType;
        int data4 = deserializedData.records.record.get(0).Id;
        int data5 = deserializedData.records.record.get(0).SiteId;
        int data6 = deserializedData.records.record.get(1).Content.ActionItemContent.SequentialIdentifier;
        String data7 = deserializedData.records.record.get(1).Content.ActionItemContent.ActionItemCategory;

        if (!Objects.equals(data1, "") && !Objects.equals(data2, "") && !Objects.equals(data3, "") && !Objects.equals(data4, ""))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
