package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.Map;

public class Wiki {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void www() {
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        driver.manage().window().setSize(new Dimension(1096, 638));
        driver.findElement(By.linkText("Создать учётную запись")).click();
        driver.findElement(By.id("wpName2")).click();
        driver.findElement(By.id("wpName2")).sendKeys("WWWWWWvvvvvvv7777777");
        driver.findElement(By.id("wpPassword2")).click();
        driver.findElement(By.id("wpPassword2")).sendKeys("9141505QQ");
        driver.findElement(By.id("wpRetype")).click();
        driver.findElement(By.id("wpRetype")).sendKeys("9141505QQ");
        driver.findElement(By.id("wpEmail")).click();
        driver.findElement(By.id("wpEmail")).sendKeys("Jul.ettka@gmail.com");
        driver.findElement(By.id("mw-input-captchaWord")).click();
        driver.findElement(By.id("mw-input-captchaWord")).sendKeys("daisbilge");
        driver.findElement(By.id("wpCreateaccount")).click();
    }
}