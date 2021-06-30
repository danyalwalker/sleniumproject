package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonDashboardPage {
    public AmazonDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='nav-xshop']/a[5]")
    public WebElement pharmacy;

    @FindBy(xpath = "//div[@id='nav-xshop']/a[6]")
    public WebElement books;

    @FindBy(xpath = "//div[@id='nav-xshop']/a[7]")
    public WebElement fashion;

    @FindBy(xpath = "//div[@id='nav-xshop']/a[8]")
    public WebElement toysnGames;

    @FindBy(css= "a[data-csa-c-content-id='nav_cs_kindle_books_cb90cf2f444c4309b8c318987bb36150']")
    public WebElement kindleBooks;

    @FindBy(css="[id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(css="[id='nav-search-submit-button']")
    public WebElement submitButton;

}
