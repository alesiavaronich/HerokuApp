package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.AddRemoveElementsFactoryPage;

public class AddRemoveElementsTest extends BaseTest{

    @BeforeMethod
    public void openAddRemoveElementsUrl() {
        AddRemoveElementsFactoryPage addRemoveElementsFactoryPage = new AddRemoveElementsFactoryPage(driver);
        addRemoveElementsFactoryPage.clickAddRemoveElementsLink();
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
