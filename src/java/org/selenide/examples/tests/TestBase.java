package org.selenide.examples.tests;


import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenide.examples.appmanager.*;
import org.openqa.selenium.WebDriver;
import org.selenide.examples.appmanager.HomePage;
import org.selenide.examples.appmanager.LoginForm;


import static com.codeborne.selenide.Selenide.open;

/**
 * Created by bent5 on 02.12.2020.
 */


public class TestBase {

    public HomePage homePage;

    protected final LoginForm loginForm = new LoginForm();



    WebDriver webDriver = null;


    @Before
    public void setup() {
        chrome();
        homePage = open("https://clockify.me/", HomePage.class);

    }

    @After
    public void close() {
        webDriver.close();
    }


    public void chrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bent5\\Documents\\IBS\\QA_Automated_Testing\\Project\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        //webDriver.manage().window().setSize(new Dimension(1500, 1500));
        WebDriverRunner.setWebDriver(webDriver);
    }

    public void popUp() {
        org.openqa.selenium.Alert alert = WebDriverRunner.getWebDriver().switchTo().alert();
        alert.accept();
    }
}

