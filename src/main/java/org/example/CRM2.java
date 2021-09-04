package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.HashMap;
import java.util.Map;
import java.time.Duration;

public class CRM2 {
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
    public void p2() {
        driver.get("https://crm.geekbrains.space/user/login");
        driver.manage().window().setSize(new Dimension(1030, 715));
        driver.findElement(By.id("prependedInput")).click();
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).click();
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
        {
            WebElement element = driver.findElement(By.xpath("//a[@class=\'unclickable\']/span[contains(text(),\'Проекты\')]"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".dropdown:nth-child(3) .single:nth-child(4) .title")).click();
        driver.findElement(By.linkText("Создать проект")).click();
        driver.findElement(By.name("crm_project[name]")).click();
        driver.findElement(By.name("crm_project[name]")).sendKeys("projekt1010");
        {
            WebElement element = driver.findElement(By.cssSelector(".select2-default > .select2-chosen"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".select2-default > .select2-chosen"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("select2-drop-mask"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector(".lang-ru")).click();
        {
            WebElement element = driver.findElement(By.xpath("//div[2]/div/a/span"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.xpath("//div[2]/div/a/span"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        WebElement element1 = (new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#select2-drop-mask"))));

        driver.findElement(By.cssSelector(".lang-ru")).click();
        driver.findElement(By.name("crm_project[businessUnit]")).click();
        {
            WebElement dropdown = driver.findElement(By.name("crm_project[businessUnit]"));
            dropdown.findElement(By.xpath("//option[. = 'Research & Development']")).click();
        }
        driver.findElement(By.name("crm_project[curator]")).click();
        {
            WebElement dropdown = driver.findElement(By.name("crm_project[curator]"));
            dropdown.findElement(By.xpath("//option[. = 'Юзеров Юзер']")).click();
        }
        driver.findElement(By.name("crm_project[rp]")).click();
        {
            WebElement dropdown = driver.findElement(By.name("crm_project[rp]"));
            dropdown.findElement(By.xpath("//option[. = 'Корыстин Василий']")).click();
        }
        driver.findElement(By.name("crm_project[administrator]")).click();
        {
            WebElement dropdown = driver.findElement(By.name("crm_project[administrator]"));
            dropdown.findElement(By.xpath("//option[. = 'Юзеров Юзер']")).click();
        }
        driver.findElement(By.name("crm_project[manager]")).click();
        {
            WebElement dropdown = driver.findElement(By.name("crm_project[manager]"));
            dropdown.findElement(By.xpath("//option[. = 'Палкина Анна']")).click();
        }
        driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
    }
}
