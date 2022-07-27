package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.AddRemoveElementsFactoryPage;

public class AddRemoveElementsTest extends BaseTest{

    @BeforeMethod
    public void openAddRemoveElementsUrl() {
        driver.get(Urls.HEROKUAPP_ADD_REMOVE_ELEMENTS_URL);
    }

    @Test(priority = 1)
    public void addAndRemoveElements() {
        //Adding two elements
        AddRemoveElementsFactoryPage addRemoveElementsFactoryPage = new AddRemoveElementsFactoryPage(driver);
        addRemoveElementsFactoryPage.clickAddElementButton(2);
        addRemoveElementsFactoryPage.countDeleteElements();

        //Removing one element
        addRemoveElementsFactoryPage.clickDeleteElementButton();
        int finalCount = addRemoveElementsFactoryPage.countDeleteElements();

        Assert.assertTrue(finalCount == 1);
    }
}
