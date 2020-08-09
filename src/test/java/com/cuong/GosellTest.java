package com.cuong;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class GosellTest {

    @Test
    public void test() {

        String useName = "input#username";
        String pass = "input#password";

        WebDriverManager.chromedriver().setup();

//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");

        WebDriver webDriver = new ChromeDriver(chromeOptions);

        webDriver.navigate().to("https://admin.unisell.vn/login");

        webDriver.get("https://admin.unisell.vn/login");
        webDriver.manage().window().maximize();


        webDriver.findElement(By.cssSelector(useName)).sendKeys("gofree.stg@mailinator.com");
        webDriver.findElement(By.cssSelector(pass)).sendKeys("gofree.stg@mailinator.com");


        webDriver.close();
        webDriver.quit();

    }

}
