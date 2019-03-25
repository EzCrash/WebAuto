import org.testng.annotations.Test;
import pages.SearchBar;

public class TestSearchBar extends SearchBar {


    @Test
    public void SearchBar() {
        driver.navigate().to(url);
        this.typeOnID("searchkey", "Glasses");
    }
}
