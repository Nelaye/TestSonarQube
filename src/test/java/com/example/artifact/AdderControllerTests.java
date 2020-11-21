package com.example.artifact;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
public class AdderControllerTests {

    @Test
    public void monTrucTest(){
        when().get("/adder/current").then().body(equalTo("0"));
    }

    @Test
    public void testadd(){
        given().queryParam("num" ,10)
                .when().post("/adder").then().body(equalTo("10"));
    }
}
