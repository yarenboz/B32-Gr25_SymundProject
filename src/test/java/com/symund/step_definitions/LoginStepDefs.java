package com.symund.step_definitions;

import com.symund.pages.BasePage;
import com.symund.pages.LoginPage;
import com.symund.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import org.jsoup.Connection;

public class LoginStepDefs extends BasePage{


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);

    }







}
