package D_31_API.files;

public class CreateUserBody {
    public static String createUser () {
        return " {\n" +
                "  \"id\": 1234,\n" +
                "  \"username\": \"Sonja13\",\n" +
                "  \"firstName\": \"Sonja\",\n" +
                "  \"lastName\": \"Drobac\",\n" +
                "  \"email\": \"sonjadrobac13@gmail.com\",\n" +
                "  \"password\": \"SonjaSonja123\",\n" +
                "  \"phone\": \"123156155\",\n" +
                "  \"userStatus\": 0\n" +
                "}";
    }

    public static String createUser2 () {
        return " {\n" +
                "  \"id\": 1123,\n" +
                "  \"username\": \"Korisnik3\",\n" +
                "  \"firstName\": \"Marija\",\n" +
                "  \"lastName\": \"Markovic\",\n" +
                "  \"email\": \"marija@marija.com\",\n" +
                "  \"password\": \"MarijaMarija123\",\n" +
                "  \"phone\": \"111222333\",\n" +
                "  \"userStatus\": 1\n" +
                "}";
    }

    public static String listOfUser () {
        return " [\n" +
                "    {\n" +
                "        \"id\": 76350402,\n" +
                "        \"pet\": {\n" +
                "            \"name\": \"Guru\",\n" +
                "            \"photoUrls\": [\n" +
                "                \"sed pariatur\",\n" +
                "                \"dolore minim nostrud\"\n" +
                "            ],\n" +
                "            \"id\": -74332934,\n" +
                "            \"category\": {\n" +
                "                \"id\": -67953842,\n" +
                "                \"name\": \"ex labore\",\n" +
                "                \"sub\": {\n" +
                "                    \"prop1\": \"commodo magna laboris\"\n" +
                "                }\n" +
                "            },\n" +
                "            \"friend\": {\n" +
                "                \"value\": \"<Circular reference to #/components/schemas/Pet detected>\"\n" +
                "            },\n" +
                "            \"tags\": [\n" +
                "                {\n" +
                "                    \"id\": -51150682,\n" +
                "                    \"name\": \"Duis irure\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"status\": \"pending\",\n" +
                "            \"petType\": \"cillum\"\n" +
                "        },\n" +
                "        \"username\": \"John78\",\n" +
                "        \"firstName\": \"John\",\n" +
                "        \"lastName\": \"Smith\",\n" +
                "        \"email\": \"john.smith@example.com\",\n" +
                "        \"password\": \"// // // //\",\n" +
                "        \"phone\": \"/+38-707-80-81-6/\",\n" +
                "        \"userStatus\": -89473261\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 96547787,\n" +
                "        \"pet\": {\n" +
                "            \"name\": \"Guru\",\n" +
                "            \"photoUrls\": [\n" +
                "                \"velit veniam\",\n" +
                "                \"ea eu\"\n" +
                "            ],\n" +
                "            \"id\": 37156173,\n" +
                "            \"category\": {\n" +
                "                \"id\": 5149870,\n" +
                "                \"name\": \"Excepteur commodo\",\n" +
                "                \"sub\": {\n" +
                "                    \"prop1\": \"enim anim ipsum cillum\"\n" +
                "                }\n" +
                "            },\n" +
                "            \"friend\": {\n" +
                "                \"value\": \"<Circular reference to #/components/schemas/Pet detected>\"\n" +
                "            },\n" +
                "            \"tags\": [\n" +
                "                {\n" +
                "                    \"id\": 16741606,\n" +
                "                    \"name\": \"est commodo\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"status\": \"pending\",\n" +
                "            \"petType\": \"culpa\"\n" +
                "        },\n" +
                "        \"username\": \"John78\",\n" +
                "        \"firstName\": \"John\",\n" +
                "        \"lastName\": \"Smith\",\n" +
                "        \"email\": \"john.smith@example.com\",\n" +
                "        \"password\": \"// // // //\",\n" +
                "        \"phone\": \"/+3-0-9-8-6-786-047-392-0/\",\n" +
                "        \"userStatus\": -28483941\n" +
                "    }\n" +
                "]";
    }

}
