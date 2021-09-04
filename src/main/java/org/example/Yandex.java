package org.example;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yandex {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void z1() {
        driver.get("https://plus.yandex.ru/");
        driver.manage().window().setSize(new Dimension(1112, 699));
        driver.findElement(By.cssSelector(".ui-burger__inner")).click();
        driver.findElement(By.cssSelector(".ui-button_blue .ui-typography > span")).click();
        driver.findElement(By.xpath("//span/input")).click();
        driver.findElement(By.xpath("//span/input")).sendKeys("jul.ettka@gmail.com");
        driver.findElement(By.id("passp:sign-in")).click();
        driver.findElement(By.id("passp-field-passwd")).click();
        driver.findElement(By.id("passp-field-passwd")).sendKeys("9141505");
        driver.findElement(By.id("passp:sign-in")).click();
        js.executeScript("window.scrollTo(0,475)");
    }
}