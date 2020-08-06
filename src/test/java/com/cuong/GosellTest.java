package com.cuong;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashMap;


public class GosellTest {

    @Test
    public void test(){

         String  useName = "input#username";
         String pass = "input#password";
        WebDriverManager.chromedriver().setup();

//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");

//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://admin.unisell.vn/login");
        webDriver.manage().window().maximize();


        webDriver.findElement(By.cssSelector(useName)).sendKeys("gofree.stg@mailinator.com");
        webDriver.findElement(By.cssSelector(pass)).sendKeys("gofree.stg@mailinator.com");


    }

}
