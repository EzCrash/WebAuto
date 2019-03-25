import org.testng.annotations.Test;

public class TestLogin extends Login {
    @Test
    public void LoginPageTest() throws InterruptedException {
        driver.navigate().to(url);
        driver.manage().window().maximize();
        this.typeOnID("usr", "admin");
        this.typeOnID("pwd", "12345");
    }
}
