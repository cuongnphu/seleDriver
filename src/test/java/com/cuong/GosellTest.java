package com.cuong;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class GosellTest {

    @Test
    public void test() {

        String useName = "input#username";
        String pass = "input#password";

        WebDriverManager.firefoxdriver().setup();

//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");


        WebDriver webDriver = new FirefoxDriver();

        webDriver.get("https://admin.unisell.vn/login");
        webDriver.manage().window().maximize();


        webDriver.findElement(By.cssSelector(useName)).sendKeys("gofree.stg@mailinator.com");
        webDriver.findElement(By.cssSelector(pass)).sendKeys("gofree.stg@mailinator.com");


    }

}
