import base.commonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle extends commonAPI {
    String url = "https://dhgate.com";

        @Test
        public void VerifyTitle () {
            driver.navigate().to(url);
        String title = driver.getTitle();
            Assert.assertEquals(title, "Wholesale – Buy China Wholesale Products on DHgate.com");


        }

}
