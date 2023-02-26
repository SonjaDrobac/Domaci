package D_31_API;

import D_31_API.files.PlaceOrderBody;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetstoreOrdersAPI {

    @Test
    public void placeOrder  () {
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all()
                .header("Content-Type", "application/json")
                .body(PlaceOrderBody.placeOrder())
                .when().post("/store/order")
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test
    public void getOrderById () {
        JsonPath js = new JsonPath(PlaceOrderBody.placeOrder());
        int orderID = js.getInt("id");
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all()
                .when().get("/store/order/" + orderID )
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test
    public void getInventory () {
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all()
                .when().get("/store/inventory" )
                .then().log().all()
                .assertThat().statusCode(200);
    }

    @Test
    public void deleteOrderByID () {
        RestAssured.baseURI="https://petstore.swagger.io/v2";
        given().log().all()
                .header("Content-Type", "application/json")
                .body(PlaceOrderBody.placeOrder2())
                .when().post("/store/order")
                .then().log().all()
                .assertThat().statusCode(200);
        JsonPath js = new JsonPath(PlaceOrderBody.placeOrder2());
        int orderID = js.getInt("id");

        given().log().all()
                .when().delete("/store/order/" + orderID )
                .then().log().all()
                .assertThat().statusCode(200);

        given().log().all()
                .when().get("/store/order/" + orderID )
                .then().log().all()
                .assertThat().statusCode(404);
    }
}
