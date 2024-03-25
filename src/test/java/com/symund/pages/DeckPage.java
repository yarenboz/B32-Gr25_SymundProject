package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.Before;
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
    @FindBy(xpath = "//div[@id='stack-add']/button")
    public WebElement addListButton;

    @FindBy(id = "new-stack-input-main")
    public WebElement typeListNameInput;

    @FindBy(xpath = "//input[@class='icon-confirm has-tooltip']")
    public WebElement addListNameField;

    @FindBy(xpath = "//h3[@class='stack__title has-tooltip']")
    public WebElement Todo;

    public void typeListName(String listName) {

        personalBtn.click();
        addListButton.click();
        typeListNameInput.sendKeys(listName);
        BrowserUtils.waitFor(2);
        addListNameField.click(); // Assuming this is the button to confirm adding the list

    }

    public void addTodoItem(String todoItem) {
        Todo.sendKeys(todoItem);
         addCardBtn.click();
         passNewCardName.click();
         treeDots.click();
         assginToMeOption.click();
    }

@FindBy(xpath = "//div[@class='smooth-dnd-draggable-wrapper']/div/div/button")
  public WebElement addCardBtn;
 @FindBy(xpath = "//input[@placeholder='Card name']")
   public WebElement passNewCardName;
 @FindBy(xpath= "//button[@class='icon-collapse']")
 public WebElement Allboards;

    @FindBy(xpath = "//input[@placeholder='Card name']//following-sibling::*")
    public WebElement enterCardName;

    @FindBy(xpath = "//input[@placeholder='Card name']//following-sibling::*")
    public WebElement checkCardName;


    @FindBy(xpath = "//div[@class='badges']//button")
 public WebElement treeDots;

@FindBy(xpath = "//div[@class='popover vue-popover-theme open']//li[1]//button")
    public WebElement assginToMeOption;

    @FindBy(xpath = "//div[@class='avatars']//img")
    public WebElement assignedToTheUser;

}



