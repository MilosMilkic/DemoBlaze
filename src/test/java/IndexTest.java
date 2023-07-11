import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class IndexTest extends BaseTest{

    WebDriverWait wait;
    IndexPage indexPage;

    @BeforeMethod
    public void setUp()
    {
        driver = openBrowser();
        indexPage = new IndexPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void bySamsungS6()
    {
        indexPage.clickSamsungS6();
        indexPage.addToCartSamsungS6();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}
