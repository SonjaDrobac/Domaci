package D_31_API;

import D_31_API.files.CreateUserBody;
import D_31_API.files.UpdateUserBody;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetstoreUserAPI {

    @Test
    public void createUser () {
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all()
                .header("Content-Type", "application/json")
                .body(CreateUserBody.createUser())
                .when().post("/user")
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test
    public void UserLogin () {
        JsonPath js = new JsonPath(CreateUserBody.createUser());
        String username = js.getString("username");
        String password = js.getString("password");
        System.out.println(username);
        RestAssured.baseURI ="https://petstore.swagger.io/v2";
        given().log().all()
                .when().get("/user/login?username="+username+"&password="+password)
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test
    public void UserLogout () {
        JsonPath js = new JsonPath(CreateUserBody.createUser());
        String username = js.getString("username");
        String password = js.getString("password");
        RestAssured.baseURI ="https://petstore.swagger.io/v2";
        given().log().all()
                .when().get("/user/login?username="+username+"&password="+password)
                .then().log().all()
                .assertThat().statusCode(200);
        given().log().all()
                .when().get("/user/logout")
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test
    public void getUserByUsername () {
        JsonPath js = new JsonPath(CreateUserBody.createUser());
        String username = js.getString("username");
        RestAssured.baseURI ="https://petstore.swagger.io/v2";
        given().log().all()
                .when().get("/user/"+username)
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test
    public void updateUser () {
        JsonPath js = new JsonPath(CreateUserBody.createUser());
        String username = js.getString("username");
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all()
                .header("Content-Type", "application/json")
                .body(UpdateUserBody.updateUser())
                .when().put("/user/"+username)
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test
    public void deleteUser () {
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        String response;
        given().log().all()
                .header("Content-Type", "application/json")
                .body(CreateUserBody.createUser2())
                .when().post("/user")
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response().asString();

        JsonPath js = new JsonPath(CreateUserBody.createUser2());
        String username = js.getString("username");
        System.out.println(username);

        given().log().all()
                .when().delete("/user/"+username)
                .then().log().all()
                .assertThat().statusCode(200);
        given().log().all()
                .when().get("/user/"+username)
                .then().log().all()
                .assertThat().statusCode(404);
    }

    @Test
    public static void crateListOfUser () {
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        String response;
        given().log().all()
                .header("Content-Type", "application/json")
                .body(CreateUserBody.listOfUser())
                .when().post("/user/createWithArray")
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response().asString();

    }



}
