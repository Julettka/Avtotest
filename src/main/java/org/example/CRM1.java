package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


public class CRM1 {
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
    public void p1() {
        driver.get("https://crm.geekbrains.space/user/login");
        driver.manage().window().setSize(new Dimension(1030, 715));
        driver.findElement(By.id("prependedInput")).click();
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).click();
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
        {
            WebElement element = driver.findElement(By.xpath("//a[@class=\'unclickable\']/*[contains(text(),\'Контрагенты\')]//.."));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".first .last .title")).click();
        driver.findElement(By.linkText("Создать контактное лицо")).click();
        driver.findElement(By.xpath("//*[@name=\'crm_contact[lastName]\']")).click();
        driver.findElement(By.name("crm_contact[lastName]")).sendKeys("Петров");
        driver.findElement(By.xpath("//*[@name=\'crm_contact[firstName]\']")).click();
        driver.findElement(By.name("crm_contact[firstName]")).sendKeys("Иван");
        driver.findElement(By.cssSelector(".responsive-cell:nth-child(1) > .control-group:nth-child(4) > .controls")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".select2-chosen"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".select2-chosen"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("select2-drop-mask"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".lang-ru")).click();
        driver.findElement(By.name("crm_contact[jobTitle]")).click();
        driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("повар");
        driver.findElement(By.cssSelector(".responsive-cell:nth-child(2) > .control-group:nth-child(3) > .controls")).click();
        driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
    }
}

