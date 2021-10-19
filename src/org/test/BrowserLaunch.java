package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\syedameer\\eclipse\\SeleniumNew\\drivers\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://en-gbfacebook.com/");
     
}
}
