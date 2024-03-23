package com.symund.step_definitions;


import com.symund.pages.DeleteFilePage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.BrokenBarrierException;


public class DeletedFiles_StepDefinitions {

    DeleteFilePage deleteFilePage = new DeleteFilePage();

    @When("user should see File icon on the home page click on it")
    public void userShouldSeeFileIconOnTheHomePageClickOnIt() {
        BrowserUtils.sleep(3);
        deleteFilePage.files.click();

    }

    @Then("user  should see Deleted files option and click on it")
    public void userShouldSeeDeletedFilesOptionAndClickOnIt() {
        BrowserUtils.sleep(3);
        //deleteFilePage.deletedFilesBtn.click();
        deleteFilePage.deletedFilesButton.click();
    }

    @Then("user should click and see files by newest to oldest or vice versa")
    public void user_should_click_and_see_files_by_newest_to_oldest_or_vice_versa() {

        //List<LocalDateTime> actualList= new ArrayList<>();
        List<String> actualList = new ArrayList<>();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM dd, yyyy h:mm a");
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now().format(df));

        for (WebElement each : deleteFilePage.listDates) {

            //actualList.add(LocalDateTime.parse(each.getAttribute("data-original-title"), df));
            actualList.add(each.getAttribute("data-original-title"));

        }
        System.out.println("actualList = " + actualList);


        //Set<LocalDateTime> expectedList = new TreeSet<>(actualList);

        //Assert.assertEquals(expectedList,actualList);

    }

    /*  List<LocalDateTime> expectedList1 = new ArrayList<>(deleteFilePage.sortedList());
      Collections.sort(expectedList1);
      List<LocalDateTime> expectedList2 = new ArrayList<>(expectedList1);

      Collections.sort(expectedList2,Collections.reverseOrder());

//        System.out.println(expectedList1);
//        System.out.println(expectedList2);

      boolean statement = expectedList1.equals(deleteFilePage.sortedList()) || expectedList2.equals(deleteFilePage.sortedList());
      Assert.assertTrue(statement);

  }

*/
    @When("user click three dots button")
    public void user_click_three_dots_button() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(deleteFilePage.threeDots).contextClick().perform();


    }

    @When("user click delete permanently button")
    public void user_click_delete_permanently_button() {
        //deleteFilePage.threeDotsClick.click();


    }

    @Then("user should delete Deleted file permanently")
    public void user_should_delete_deleted_file_permanently(String expectedDeleteFile) {


    }


    @When("user click restore button")
    public void user_click_restore_button() {

    }

    @Then("user should see Deleted file under the all file tab")
    public void user_should_see_deleted_file_under_the_all_file_tab() {

    }


}
