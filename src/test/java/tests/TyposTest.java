package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.TyposFactoryPage;

public class TyposTest extends BaseTest{

    @BeforeMethod
    public void openInputsUrl() {
        driver.get(Urls.HEROKUAPP_TYPOS_URL);
    }

    @Test
    public void readTextWithTypo() {
        TyposFactoryPage typosFactoryPage = new TyposFactoryPage(driver);
        String actual = typosFactoryPage.getTextFromParagraph();
        String expected = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertTrue(actual.equals(expected), "There is a typo in the text.");

        //что делать с неустойчивыми тестами? результат то правильный, то неправильный
    }
}
