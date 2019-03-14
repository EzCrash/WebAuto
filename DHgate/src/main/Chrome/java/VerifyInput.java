import base.commonAPI;
import org.testng.annotations.Test;

public class VerifyInput extends commonAPI {
    String url = "https://dhgate.com";

    @Test
    public void VerifyInput() {
        driver.navigate().to(url);
        this.typeOnID("searchkey", "Glasses");
    }
}
