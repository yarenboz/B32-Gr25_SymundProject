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


    @FindBy (className = "CodeMirror-cursors")
    public WebElement Cursor;

    //@FindBy (xpath = "//div[@class='markdown-editor']/textarea")
    @FindBy (xpath = "//div[contains(@class,'CodeMirror cm-s-easymde CodeMirror-wrap')]/div/textarea")
    public WebElement TextInput;


    @FindBy (xpath = "//*[@class='app-navigation__list']/li[3]//span")
    public WebElement NoteTitle;


    @FindBy(xpath = "//ul[@class='app-navigation__list']//li[3]//button")
    public WebElement Note3Dot;

    @FindBy (xpath = "//ul[contains(@id,'menu')]//li[2]/button")
    public  WebElement AddToFavorites;

    @FindBy (xpath = "//*[.='Favorites']")
    public  WebElement Favorites;

    @FindBy (xpath = "//table[@class='list-container']//tbody/tr")
    public WebElement NoteAddedToFavorites;

    @FindBy(xpath = "//span[@class='action-buttons']//button[@aria-haspopup='true']")
    public WebElement _3dotsBtn;

    @FindBy(xpath = "//p[@class='app-sidebar-header__subtitle']")
    public WebElement NumberOfLetter;


    @FindBy(xpath = "//span[text()='Details']")
    public WebElement DetailBtnIsDisplayed;

    @FindBy (xpath = "//li[@class='action active']/button")
    public WebElement DetailBtn;



    @FindBy (xpath = "//*[.='Delete note']")
    public  WebElement DeleteNote;

    @FindBy (xpath = "//ul[contains(@id,'menu')]//li[3]/button")
    public  WebElement DeleteBtn;

    @FindBy (xpath = "//span[@class='deletedLabel']")
    public  WebElement DeleteLabel;



}
