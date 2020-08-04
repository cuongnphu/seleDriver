package com.cuong;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashMap;


public class GosellTest {

    @Test
    public void test(){
//        WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized"); // open Browser in maximized mode
//        options.addArguments("disable-infobars"); // disabling infobars
//        options.addArguments("--disable-extensions"); // disabling extensions
//        options.addArguments("--disable-gpu"); // applicable to windows os only
//        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//        options.addArguments("--no-sandbox"); // Bypass OS security model


//        ChromeOptions opt = new ChromeOptions();
//        opt.setBinary("/usr/bin/google-chrome");  //chrome binary location specified here
//        opt.addArguments("start-maximized");
//        opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        opt.setExperimentalOption("useAutomationExtension", false);

//        String downloadFilepath = System.getProperty("downloadFilepath");
//        HashMap<String, Object> chromePrefs = new HashMap<>();
//        chromePrefs.put("profile.default_content_settings.popups", 0);
//        chromePrefs.put("download.default_directory", downloadFilepath);
//        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--no-sandbox");
        options.addArguments("--headless"); //should be enabled for Jenkins
        options.addArguments("--disable-dev-shm-usage"); //should be enabled for Jenkins
        options.addArguments("--window-size=1920x1080"); //should be enabled for Jenkins

        WebDriver webDriver = new ChromeDriver(options);

        webDriver.get("https://admin.unisell.vn/login");
        webDriver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.close();
        webDriver.quit();
    }

}
