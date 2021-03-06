package com.jikssystem.jikdb;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JikdbApplicationTests {

    @Before
    public void setup() {
        RestAssured.port = 8080;
    }

    @Test
    public void JikDbMainCall() {

        given()
                .when()
                .get("/")
                .then()
                .statusCode(200)
                .contentType("text/html")
                .body(containsString("Jiks"));
    }

}
