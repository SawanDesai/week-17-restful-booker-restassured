package com.restful.booker.crudtest;

import com.restful.booker.model.BookingPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CrudTests extends TestBase {

    @Test
    public void getAllProductsInfo() {
        Response response = given()
                .when()
                .get("/Booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getSingleProductInfo() {
        Response response = given()
                .pathParam("id", 4450)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void createProduct() {

        List<String> courseList = new ArrayList<>();
        courseList.add("New booking");

        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstName("Krish");
        bookingPojo.setLastName("Desai");
        bookingPojo.setTotalprice(649);


        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(bookingPojo)
                .post();
        response.prettyPrint();
        response.then().log().all().statusCode(201);
    }
    @Test
    public void deleteRecord(){
        Response response = given()
                .basePath("/booking")
                .pathParam("id",1444)
                .when()
                .delete("/{id}");
        response.then().statusCode(404);
        response.prettyPrint();

    }
    @Test
    public void patchRecord() {
        Response response = given()
                .basePath("/booking")
                .pathParam("price", 111)
                .when()
                .patch("/{price},110");
        response.then().statusCode(200);
        response.prettyPrint();

    }
    }
