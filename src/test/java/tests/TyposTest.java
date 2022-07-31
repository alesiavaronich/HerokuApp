package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.TyposFactoryPage;

public class TyposTest extends BaseTest{

    @BeforeMethod
    public void openTyposUrl() {
        driver.get(Urls.HEROKUAPP_TYPOS_URL);
    }

    @Test
    public void readTextWithTypo() {
        String expected = "Sometimes you'll see a typo, other times you won't.";
        TyposFactoryPage typosFactoryPage = new TyposFactoryPage(driver);
        String actual = typosFactoryPage.getTextFromParagraph();
        Assert.assertEquals(actual, expected, "There is a typo in the text.");
    }
}
