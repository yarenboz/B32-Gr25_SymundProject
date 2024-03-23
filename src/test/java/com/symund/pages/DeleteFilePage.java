package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DeleteFilePage extends BasePage {

    public DeleteFilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='app-content-trashbin']//td[@class='date']/span")
    public List<WebElement> listDates;

    @FindBy(xpath = "//a[text()='Deleted files']")
    public WebElement deletedFilesButton;

   /* @FindBy(xpath = "//a[text()='Deleted files']")
    public WebElement deletedFilesBtn;

    @FindBy(xpath = "//div[@id='app-content-trashbin']//td[@class='date']//span")
    public List<WebElement> dateOfListElements;

    public List<LocalDateTime> sortedList() {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM dd, yyyy h:mm a");
        List<LocalDateTime> actualList = new ArrayList<>();
        for (WebElement each : dateOfListElements) {
            actualList.add(LocalDateTime.parse(each.getAttribute("data-original-title"), df));
        }

        return actualList;

*/
        //User story2
    //@FindBy(xpath = "//div[@id='app-content-files']//tr[1]//span[@class='fileactions']//a[2]")
    @FindBy(xpath = "//table[@id='filestable']//tr[1]//th[2]")
    public WebElement threeDots;

    //@FindBy(xpath = "(//span[contains(@class, 'icon icon-delete')])[4]")
    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement threeDotsClick;

    @FindBy(xpath = "(//span[contains(@class, 'icon icon-history')])[1]")
    public WebElement restore;



    }
