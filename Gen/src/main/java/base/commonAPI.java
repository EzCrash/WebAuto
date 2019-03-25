package base;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class commonAPI {
    public WebDriver driver = null;
    String url = null;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "../Gen/driver/chromedriverLinux");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
    public void typeOnID(String locator,String Value){
        driver.findElement(By.id(locator)).sendKeys(Value, Keys.ENTER);
    }
    public void typeOnCSS(String locator,String Value){
        driver.findElement(By.cssSelector(locator)).sendKeys(Value, Keys.ENTER);
    }
    public void typeOnWebElement(String locator,String Value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(Value, Keys.ENTER);
        }catch(Exception ex){
            System.out.println("Tried with CSS, did not work. will try by ID now");
            driver.findElement(By.id(locator)).sendKeys(Value, Keys.ENTER);
        }
    }
    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value,Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value,Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value,Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value,Keys.ENTER);
                }
            }
        }
    }
}
