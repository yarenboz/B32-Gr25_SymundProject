package com.symund.step_definitions;

import com.google.errorprone.annotations.Var;
import com.symund.pages.TasksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.symund.utilities.BrowserUtils.sleep;
import static com.symund.utilities.Driver.getDriver;

public class TasksStepDefs {

    TasksPage tasksPage = new TasksPage();

    @And("the user navigates to {string} module")
    public void the_user_navigates_to_module(String moduleName) {
        tasksPage.navigateToModule(moduleName);
    }

    @Given("user create new note")
    public void user_create_new_note() {
    tasksPage.NewNote.click();
    }

    @Then("user type {string}")
    public void userType(String arg0) {

        tasksPage.TextInput.sendKeys(arg0);
    }


    @Then("user able to see new note title matches with the first word in the note created {string}")
    public void userAbleToSeeNewNoteTitleMatchesWithTheFirstWordInTheNoteCreated(String arg0) {

        sleep(1);
        Assert.assertEquals(arg0,tasksPage.NoteTitle.getAttribute("title"));


    }

    private final String url= getDriver().getCurrentUrl();
    @Then("user click 3dots in note module")
    public void user_click_3dots_in_note_module() {
        Actions actions=new Actions(getDriver());
        actions.moveToElement(tasksPage.Note3Dot).click().perform();
    //tasksPage.Note3Dot.click();
    }

    @Then("user able to see add to favorites")
    public void user_able_to_see_add_to_favorites() {
       tasksPage.AddToFavorites.isDisplayed();
    }
    @When("user click add to favorites")
    public void user_click_add_to_favorites() {
        tasksPage.AddToFavorites.click();
    }

    @Then("user navigates to {string} module")
    public void userNavigatesToModule(String arg0) {
        tasksPage.navigateToModule(arg0);
    }
    @Then("user click to favorites")
    public void user_click_to_favorites() {
       tasksPage.Favorites.click();
    }
    @Then("user can see the new note added to favorites")
    public void user_can_see_the_new_note_added_to_favorites() {
        String urlId="";
        for (int i = 0; i < url.length(); i++) {
            if (Character.isDigit(url.charAt(i))){
                urlId+=""+url.charAt(i);
            }
        }


        Assert.assertEquals(tasksPage.NoteAddedToFavorites.getAttribute("id"),urlId);
    }


    @Then("user click 3dots in the top right page")
    public void user_click_3dots_in_the_top_right_page() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(tasksPage._3dotsBtn).click().perform();
    }
    @Then("user able to see Details")
    public void user_able_to_see_details() {
       tasksPage.DetailBtnIsDisplayed.isDisplayed();
    }
    @When("user click Details")
    public void user_click_details() {
        tasksPage.DetailBtn.click();
    }
    @Then("user can see the number of letters and words that the notes includes under the note title")
    public void user_can_see_the_number_of_letters_and_words_that_the_notes_includes_under_the_note_title() {
     tasksPage.NumberOfLetter.isDisplayed();
    }

    @Then("user able to see Delete note")
    public void user_able_to_see_delete_note() {
tasksPage.DeleteNote.isDisplayed();
    }
    @When("user click Delete note")
    public void user_click_delete_note() {
        tasksPage.DeleteBtn.click();
    }

    @Then("user able to see Delete {string} in top right page")
    public void userAbleToSeeDeleteInTopRightPage(String arg0) {

        Assert.assertTrue(tasksPage.DeleteLabel.getText().contains(arg0));
    }
}
