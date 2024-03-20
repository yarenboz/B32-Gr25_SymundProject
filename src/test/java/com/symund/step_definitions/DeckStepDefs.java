package com.symund.step_definitions;

import com.github.javafaker.Faker;
import com.symund.pages.DeckPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeckStepDefs {

    String expectedNewBoardName;
    DeckPage deckPage = new DeckPage();
    @When("user creates a new board")
    public void user_creates_a_new_board() {
        Faker faker = new Faker();
        expectedNewBoardName = String.valueOf(faker.name());
        deckPage.createNewBoard(expectedNewBoardName);
        System.out.println("New board created with name: " + expectedNewBoardName);
    }
    @Then("the board is created successfully")
    public void the_board_is_created_successfully() {
        //to get the actual newly created board name
        String actualNewBoardName = deckPage.newlyCreatedBoard.getText();
        Assert.assertEquals(actualNewBoardName,expectedNewBoardName);
        System.out.println("Board created successfully: " + expectedNewBoardName);
    }


//    @Given("user has a board named {string}")
//    public void userHasABoardNamed(String arg0) {
//    }
//
//    @When("user creates a new list {string} under the board")
//    public void userCreatesANewListUnderTheBoard(String arg0) {
//    }
//
//    @Then("{string} list is created successfully")
//    public void listIsCreatedSuccessfully(String arg0) {
//    }
}
