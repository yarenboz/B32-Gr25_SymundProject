package com.symund.pages;


import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

public abstract class BasePage {


    @FindBy(xpath = "(//a[contains(.,'Talk')])[1]")
    public List<WebElement> talk;

    @FindBy(xpath = "(//a[contains(.,'Activity')])[1]")
    protected WebElement activity;

    @FindBy(xpath = "(//a[contains(.,'Photos')])[1]")
    public WebElement photos;

    @FindBy(xpath = "(//a[contains(.,'Files')])[1]")
    public WebElement files;

    @FindBy(xpath = "(//a[contains(.,'Dashboard')])[1]")
    public WebElement dashboard;

    @FindBy(xpath = "(//a[contains(.,'Mail')])[1]")
    public WebElement mail;

    @FindBy(xpath = "(//a[contains(.,'Contacts')])[1]")
    public WebElement contacts;

    @FindBy(xpath = "(//a[contains(.,'Tasks')])[1]")
    public WebElement tasks;

    @FindBy(xpath = "(//a[contains(.,'Calendar')])[1]")
    public WebElement calender;

    @FindBy(xpath = "(//a[contains(.,'Notes')])[1]")
    public WebElement notes;

    @FindBy(xpath = "(//a[contains(.,'Contacts')])[1]")
    public WebElement deck;

    @FindBy(id = "expand")
    public WebElement logoutButton;



    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    /**
     * This method will navigate user to the specific module in Symund application.
     * For example: if module is equals to Talk,
     * Then method will navigate user to this page: http://qa.symund.com/Talk/
     *
     * @param moduleName
     */
    public void navigateToModule(String moduleName) {

        moduleName = moduleName.substring(0,1).toUpperCase() + moduleName.substring(1).toLowerCase();

        String moduleLocator = "(//a[@aria-label='"+moduleName+"'])[1]";
        //BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
        //BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
        Driver.getDriver().findElement(By.xpath(moduleLocator)).click();

    }

}
