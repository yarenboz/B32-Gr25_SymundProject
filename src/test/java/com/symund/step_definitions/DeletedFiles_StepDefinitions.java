package com.symund.step_definitions;

import com.symund.pages.BasePage;
import com.symund.pages.DeleteFilePage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DeletedFiles_StepDefinitions extends BasePage {

    DeletedFiles_StepDefinitions filesPage = new DeletedFiles_StepDefinitions();

    @When("user should see {string} icon on the home page click on it")
    public void user_should_see_icon_on_the_home_page_click_on_it() {




    }
    @Then("user  should see Delete files option")
    public void user_should_see_delete_files_option() {

    }
    @Then("user should click and see files by newest to oldest or vice versa")
    public void user_should_click_and_see_files_by_newest_to_oldest_or_vice_versa() {

    }






}
