package com.avinashsinha.tests.crud;

import com.avinashsinha.base.BaseTest;
import com.avinashsinha.endpoints.APIConstants;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestAuthorBookById extends BaseTest {

    private static final Logger logger = LogManager.getLogger(TestAuthorBookById.class);

    @Test(groups = "Regression", priority = 1)
    @Owner("Avinash Sinha")
    @Description("TC#1 : Step 1. Details of Author Book By Id")
    public void testBookOfAuthor_GET() {

        int idBook_e = 50;

        logger.info("Send the API Request");

        // 1) send request
        response = RestAssured.given(requestSpecification)
                .pathParam("idBook", idBook_e)
                .when().log().all()
                .get(APIConstants.AUTHOR_BOOK_BY_ID);

        // 2) basic status code validation
        validatableResponse = response.then().log().all().statusCode(200);

        System.out.println();

        logger.info("End the API Request");

    }
}