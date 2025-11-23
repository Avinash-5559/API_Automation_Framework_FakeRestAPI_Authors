package com.avinashsinha.module;

public class PayloadManager {

    public String createAuthorRequest() {

        String createRequest = "{\n" +
                "    \"id\": 501,\n" +
                "    \"idBook\": 1125,\n" +
                "    \"firstName\": \"Tegan\",\n" +
                "    \"lastName\": \"Lindsey\"\n" +
                "}";

        return createRequest;

    }

    public String fullUpdateAuthorRequest() {

        String fullUpdateRequest = "{\n" +
                "    \"id\": 2035,\n" +
                "    \"idBook\": 115,\n" +
                "    \"firstName\": \"Priya\",\n" +
                "    \"lastName\": \"Schaefer\"\n" +
                "}";

        return fullUpdateRequest;

    }

    // MAIN dynamic method
    public String createAuthorJSONSchemaRequest(int id, int idBook, String firstName, String lastName) {

        return "{\n" +
                "  \"id\": " + id + ",\n" +
                "  \"idBook\": " + idBook + ",\n" +
                "  \"firstName\": \"" + firstName + "\",\n" +
                "  \"lastName\": \"" + lastName + "\"\n" +
                "}";
    }

    // DEFAULT no-argument method
    public String createAuthorJSONSchemaRequest() {
        return createAuthorJSONSchemaRequest(
                501,
                1125,
                "Tegan",
                "Lindsey"
        );
    }

}