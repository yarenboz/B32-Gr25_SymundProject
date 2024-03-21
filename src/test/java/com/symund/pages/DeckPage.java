package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DeckPage extends BasePage {

    public DeckPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Add board']")
    public WebElement createNewBoardBtn;
    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement newBoardInput;

    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement threeLineBtn;

    @FindBy(xpath = "//input[@type='submit'][@class='icon-confirm']")
    public WebElement newBoardSubmitBtn;
    @FindBy(xpath = "//span[@title='go']")
    public WebElement newlyCreatedBoard;

    public void createNewBoard(String newBoardName) {
        threeLineBtn.click();
        createNewBoardBtn.click();
        newBoardInput.sendKeys(newBoardName);
        newBoardSubmitBtn.click();

    }

    @FindBy(xpath = "//span[@title='Personal']")
    public WebElement personalBtn;
    @FindBy(xpath = "//button[@class='action-item action-item--single icon-add undefined undefined has-tooltip']")
    public WebElement addListButton;

    @FindBy(id = "new-stack-input-main")
    public WebElement typeListNameInput;

    @FindBy(xpath = "//input[@type='submit'][@class='icon-confirm']")
    public WebElement addListNameField;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement Todo;
   public void typeListName(String listName) {

       personalBtn.click();
       addListButton.click();
       typeListNameInput.sendKeys(listName);
   }
}



    // driver.findElement(By.xpath("//div[@class='board-tile-details-name'][contains(text(),'My Board')]")).click();
//
//            // Wait for the board to open
//            Thread.sleep(2000); // Introduce a small delay to ensure board loads completely
//
//            // Create a new list "To Do"
//            WebElement addListButton = driver.findElement(By.xpath("//span[contains(text(),'Add a list')]"));
//            addListButton.click();
//
//            WebElement listNameField = driver.findElement(By.xpath("//input[@class='list-name-input']"));
//            listNameField.sendKeys("To Do");
//
//            // Click the "Add List" button
//            WebElement addList = driver.findElement(By.xpath("//input[@value='Add List']"));
//            addList.click();
//
//            System.out.println("List created successfully!");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {