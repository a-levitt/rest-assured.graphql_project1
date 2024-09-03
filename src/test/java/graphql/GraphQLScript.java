package graphql;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.util.Arrays;

import static io.restassured.RestAssured.*;
import static payload.ScriptPayload.bodyMutationPayload;
import static payload.ScriptPayload.bodyQueryPayload;

public class GraphQLScript {
    public static void main(String[] args) {
        // Query
        /*String response =
        given()
            .log().all()
            .header("Content-Type", "application/json")
            .body(bodyQueryPayload())
        .when()
            .post("https://rahulshettyacademy.com/gq/graphql")
        .then()
            .extract().response().asString()
        ;
        System.out.println(response);

        JsonPath js = new JsonPath(response);
        String characterName = js.getString("data.character.name");
        System.out.println(characterName);
        Assert.assertEquals(characterName, "Test");*/

        // Mutation
        String mutationResponse =
        given()
             .log().all()
             .header("Content-Type", "application/json")
             .body(bodyMutationPayload())
        .when()
             .post("https://rahulshettyacademy.com/gq/graphql")
        .then()
              .extract().response().asString()
        ;
        System.out.println(mutationResponse);

        JsonPath jsm = new JsonPath(mutationResponse);
        String newCharacterId = jsm.getString("data.createCharacter.id");
        System.out.println("Character id: " + newCharacterId);
    }
}
