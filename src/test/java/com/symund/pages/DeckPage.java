package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage extends BasePage{

 public DeckPage (){
     PageFactory.initElements(Driver.getDriver(),this);
 }
 @FindBy(xpath = "//span[@title='Add board']")
    public WebElement createNewBoardBtn;
 @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement newBoardInput;

    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement threeLineBtn;

    @FindBy(xpath = "//input[@type='submit'][@class='icon-confirm']")
    public WebElement newBoardSubmitBtn;
    @FindBy(xpath = "//*[@aria-current='page']")
    public WebElement newlyCreatedBoard;
    public void createNewBoard(String newBoardName){
        threeLineBtn.click();
        createNewBoardBtn.click();
        newBoardInput.sendKeys(newBoardName);
        newBoardSubmitBtn.click();

    }




}
