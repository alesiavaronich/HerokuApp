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
    public void isCheckboxOneUnchecked() {
        CheckboxesFactoryPage checkboxesFactoryPage = new CheckboxesFactoryPage(driver);
        boolean isCheckboxChecked = checkboxesFactoryPage.isCheckboxOneChecked();
        Assert.assertFalse(isCheckboxChecked);
    }

    @Test(priority = 2)
    public void isCheckboxOneChecked() {
        CheckboxesFactoryPage checkboxesFactoryPage = new CheckboxesFactoryPage(driver);
        checkboxesFactoryPage.clickCheckboxOne();
        boolean isCheckboxOneChecked = checkboxesFactoryPage.isCheckboxOneChecked();
        Assert.assertTrue(isCheckboxOneChecked);
    }

    @Test(priority = 3)
    public void isCheckboxTwoChecked() {
        CheckboxesFactoryPage checkboxesFactoryPage = new CheckboxesFactoryPage(driver) ;
        boolean isCheckboxChecked = checkboxesFactoryPage.isCheckboxTwoChecked();
        Assert.assertTrue(isCheckboxChecked, "Error. Checkbox 2 is unchecked.");
    }

    @Test(priority = 4)
    public void isCheckboxTwoUnchecked() {
        CheckboxesFactoryPage checkboxesFactoryPage = new CheckboxesFactoryPage(driver);
        checkboxesFactoryPage.clickCheckboxTwo();
        boolean isCheckboxTwoChecked = checkboxesFactoryPage.isCheckboxTwoChecked();
        Assert.assertFalse(isCheckboxTwoChecked);
    }



}

