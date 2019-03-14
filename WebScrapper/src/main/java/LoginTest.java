import base.commonAPI;
import org.testng.annotations.Test;

public class LoginTest extends commonAPI {
    String url = "http://testing-ground.scraping.pro/login";
    @Test
    public void LoginPageTest() throws InterruptedException {
        driver.navigate().to(url);
        driver.manage().window().maximize();
        //driver.findElement(By.id("usr")).sendKeys("admin");
        //driver.findElement(By.id("pwd")).sendKeys("12345");
        //driver.findElement(By.id("submit")).click();
        this.typeOnID("usr", "admin");
        this.typeOnID("pwd", "12345");
    }
}