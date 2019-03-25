import org.testng.annotations.Test;
import pages.Title;

public class TestTitle extends Title {

    @Test
    public void NewsLetter() {
        driver.navigate().to(url);
        this.typeOnID("j-subscribe-input", "testemail@mailserver.com");
    }
}
