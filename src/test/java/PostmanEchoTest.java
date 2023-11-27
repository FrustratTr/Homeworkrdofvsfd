import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {

    @Test
    void shouldReturnPostedData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi everyone")
                .contentType("text/plain; charset=UTF-8")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hi everyone"));
    }
}
