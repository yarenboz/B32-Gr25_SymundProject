package com.symund.step_definitions;

import com.github.javafaker.Faker;
import com.symund.pages.DeckPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        WebElement actualNewBoardNamexpath = Driver.getDriver().findElement(By.xpath("//span[@title='" + expectedNewBoardName + "']"));
        //String actualNewBoardName = deckPage.newlyCreatedBoard.getText();
        String actualNewBoardName = actualNewBoardNamexpath.getText();
        System.out.println("actualNewBoardName =" + actualNewBoardName);
        System.out.println("Board created successfully: " + expectedNewBoardName);
        Assert.assertEquals(actualNewBoardName, expectedNewBoardName);
        System.out.println("Board created successfully: " + expectedNewBoardName);
    }


    @Given("user has a board named {string}")
    public void userHasABoardNamed(String bordName) {

    }

    @When("user creates a new list {string} under the board")
    public void userCreatesANewListUnderTheBoard(String listName) {
    }

    @Then("{string} list is created successfully")
    public void listIsCreatedSuccessfully(String expectedNewBoardName) {
    }

    @Then("user adds {string} todo item to the list")
    public void userAddsTodoItemToTheList(String todoItem) {
        userAddsTodoItemToTheList(todoItem);
    }
}
