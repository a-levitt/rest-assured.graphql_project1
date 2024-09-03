package graphql;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static payload.ScriptPayload.bodyPayload;

public class GraphQLScript {
    public static void main(String[] args) {
        String response =
        given()
            .log().all()
            .header("Content-Type", "application/json")
            .body(bodyPayload())
        .when()
            .post("https://rahulshettyacademy.com/gq/graphql")
        .then()
            .extract().response().asString()
        ;
        System.out.println(response);

        JsonPath js = new JsonPath(response);
        String characterName = js.getString("data.character.name");
        System.out.println(characterName);
        Assert.assertEquals(characterName, "Test");
    }
}
