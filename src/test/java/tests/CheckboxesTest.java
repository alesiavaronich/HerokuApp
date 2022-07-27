package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.CheckboxesFactoryPage;

public class CheckboxesTest extends BaseTest {

    @BeforeMethod
    public void openCheckboxesUrl() {
        driver.get(Urls.HEROKUAPP_CHECKBOXES_URL);
    }

    @Test(priority = 1)
    public void selectCheckboxOne() {
        CheckboxesFactoryPage checkboxesFactoryPage = new CheckboxesFactoryPage(driver);
        boolean isCheckSelectedBefore = checkboxesFactoryPage.checkboxOne.isSelected(); //false
        if(!isCheckSelectedBefore)
            checkboxesFactoryPage.selectCheckboxOne();
        boolean isCheckSelectedAfter = checkboxesFactoryPage.checkboxOne.isSelected(); //true

        Assert.assertTrue(isCheckSelectedAfter, "Checkbox is not selected after performing click action.");
    }

    @Test(priority = 2)
    public void deselectCheckboxTwo() {
        CheckboxesFactoryPage checkboxesFactoryPage = new CheckboxesFactoryPage(driver);
        boolean isCheckSelectedBefore = checkboxesFactoryPage.checkboxTwo.isSelected(); //true
        if(isCheckSelectedBefore)
            checkboxesFactoryPage.deselectCheckboxTwo();
        boolean isCheckSelectedAfter = checkboxesFactoryPage.checkboxTwo.isSelected();

        Assert.assertFalse(isCheckSelectedAfter, "Checkbox is selected after performing click action.");
    }



}

