package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.symund.utilities.Driver.getDriver;

public class TasksPage extends BasePage{

    public TasksPage() {
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy (id = "notes_new_note")
    public WebElement NewNote;

    @FindBy (id = "notes_new_note")
    public WebElement NewNote;

    @FindBy (id = "notes_new_note")
    public WebElement NewNote;

    @FindBy (id = "notes_new_note")
    public WebElement NewNote;
}
