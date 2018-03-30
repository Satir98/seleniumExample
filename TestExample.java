package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestExample {

    private WebDriver driver = WebDriverSingleton.getInstance();
//
//    @Test
//    public void shouldGoogleIbaMainPage() {
//        driver.get("https://www.google.by");
//        WebElement searchField = driver.findElement(By.className("gsfi"));
//
//        searchField.sendKeys(Keys.RETURN);
//        List<WebElement> results = driver.findElements(By.xpath("//div[@class='rc']//a"));
//        results.get(0).click();
//        Assert.assertEquals("IBA Беларусь", driver.getTitle());
//    }
    @Test
    public  void shoulloginPage(){
        driver.get("http://testing.cld.iba.by/");
        WebElement usernameField1 = driver.findElement(By.xpath("//*[@id=\"_58_login\"]"));
        WebElement passwordField2 = driver.findElement(By.xpath("//*[@id=\"_58_password\"]"));
        usernameField1.sendKeys("kabanov@tc.by");
        passwordField2.sendKeys("welcome");
        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();
    }
    @After
    public void shutDown() {
        driver.close();
    }

    @Test
    public  void button(){
        driver.get("http://testing.cld.iba.by/");
        WebElement usernameField1 = driver.findElement(By.xpath("//*[@id=\"_58_login\"]"));
        WebElement passwordField2 = driver.findElement(By.xpath("//*[@id=\"_58_password\"]"));
        usernameField1.sendKeys("kabanov@tc.by");
        passwordField2.sendKeys("welcome");
        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();
        WebElement buttonField1 = driver.findElement(By.xpath("//div[@id=\"navigationIcon3\"]"));
        buttonField1.click();
    }
    @After
    public void shutD() {
        driver.close();
    }


}
