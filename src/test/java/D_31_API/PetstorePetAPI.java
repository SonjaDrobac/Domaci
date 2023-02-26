package D_31_API;

import D_31_API.files.AddNewPetBody;
import D_31_API.files.UpdatePetBody;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetstorePetAPI {


    @Test
    public void addNewPet () {
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        String response;
        response= given().log().all()
                .header("Content-Type", "application/json")
                .body(AddNewPetBody.addNewPetBody())
                .when().post("/pet")
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response().asString();

        JsonPath js= new JsonPath(response);
        String petID= js.getString("id");
        System.out.println(petID);
    }

    @Test
    public void findPetById () {
        long petID = 9223372036854252242L;
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all()
                .when().get("/pet/"+petID)
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test
    public void UpdateAnExistingPet () {
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all()
                .header("Content-Type", "application/json")
                .body(UpdatePetBody.UpdatePet())
                .when().put("/pet")
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test
    public void FindPetByStatus () {
        String status= "sold";
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all()
                .when().get("/pet/findByStatus?status="+status)
                .then().log().all()
                .assertThat().statusCode(200);
    }
}
