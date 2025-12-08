package com.avinashsinha.asserts;

import io.restassured.response.Response;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertActions {

    private final Response response;

    public AssertActions(Response response) {
        this.response = response;
    }

    public void verifyAuthorIdNotNull() {
        Integer id = response.jsonPath().getInt("id");
        assertThat(id).isNotNull();
    }

    public void verifyBookIdNotNull() {
        Integer idBook = response.jsonPath().getInt("idBook");
        assertThat(idBook).isNotNull();
    }

    public void verifyFirstNameNotBlank() {
        String firstName = response.jsonPath().getString("firstName");
        assertThat(firstName).isNotBlank();
    }

    public void verifyLastNameNotEmpty() {
        String lastName = response.jsonPath().getString("lastName");
        assertThat(lastName).isNotEmpty();
    }

}