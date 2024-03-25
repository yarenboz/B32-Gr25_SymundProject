package com.symund.step_definitions;

import com.github.javafaker.Faker;
import com.symund.pages.DeckPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.Toda;
import io.cucumber.java.zh_cn.而且;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;

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
        deckPage.threeLineBtn.click();
        deckPage.personalBtn.click();


       // Assert.assertTrue(deckPage.personalBtn.getText().equals(bordName));
    }

    @When("user creates a new list {string} under the board")
    public void userCreatesANewListUnderTheBoard(String listName) {
    deckPage.addListButton.click();
    deckPage.typeListNameInput.sendKeys(listName + Keys.ENTER);

    }

    @Then("{string} list is created successfully")
    public void listIsCreatedSuccessfully(String expectedNewBoardName) {

        //Assert.assertTrue();
    }

    @Given("user has a board named {string} with a list {string}")
    public void userHasABoardNamedWithAList(String passNewCardName, String Todo) {


        System.out.println("passNewCardName.indexOf(passNewCardName) = " + passNewCardName.indexOf(passNewCardName));

    }

    @When("user adds a new card task {string} to the {string} list")
    public void userAddsANewCardTaskToTheList(String arg0, String arg1) {
        deckPage.threeLineBtn.click();
       // deckPage.Allboards.click();
        deckPage.personalBtn.click();
        deckPage.addCardBtn.click();
        deckPage.passNewCardName.sendKeys("Task1");
        deckPage.enterCardName.click();
    }

    @Then("{string} is added successfully to the list")
    public void isAddedSuccessfullyToTheList(String arg0) {
        deckPage.checkCardName.isDisplayed();

    }




    @Given("user assigns {string} to self")
    public void userAssignsToSelf(String arg0) {
        deckPage.threeLineBtn.click();
        // deckPage.Allboards.click();
        deckPage.personalBtn.click();
        deckPage.treeDots.click();
        deckPage.assginToMeOption.click();
//        deckPage.addCardBtn.click();
//        deckPage.passNewCardName.sendKeys("Task1");
//        deckPage.enterCardName.click();
//    }
    }

    @Then("{string} is assigned to the user")
    public void isAssignedToTheUser(String arg0) {
       deckPage.assignedToTheUser.isDisplayed();
    }
}
