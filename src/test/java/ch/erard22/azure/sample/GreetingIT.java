package ch.erard22.azure.sample;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;

@QuarkusIntegrationTest
public class GreetingIT {

    @Test
    public void testIt() {
        given()
                .when().get("/hello?name=mike")
                .then()
                .statusCode(200)
                .body(startsWith("hello mike"));
    }
}
