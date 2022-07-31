package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.SortableDataTablesFactoryPage;

import java.util.ArrayList;
import java.util.List;

public class SortableDataTablesTest extends BaseTest{

    @BeforeMethod
    public void openSortableTablesUrl() {
        driver.get(Urls.HEROKUAPP_SORTABLE_DATATABLES_URL);
    }

    @Test
    public void getRowDataByEmail() {
        SortableDataTablesFactoryPage sortableDataTablesFactoryPage = new SortableDataTablesFactoryPage(driver);
        List<String> actualStrings = sortableDataTablesFactoryPage.getRowFromTableOne();
        List<String> expectedStrings = new ArrayList<String>();
        expectedStrings.add("Bach");
        expectedStrings.add("Frank");
        expectedStrings.add("fbach@yahoo.com");
        expectedStrings.add("$51.00");
        expectedStrings.add("http://www.frank.com");
        Assert.assertEquals(actualStrings, expectedStrings);
    }

    @Test
    public void getFirstNameLastNameByEmail() {
        SortableDataTablesFactoryPage sortableDataTablesFactoryPage = new SortableDataTablesFactoryPage(driver);
        List<String> actualStrings = sortableDataTablesFactoryPage.getFirstNameLastNameFromTableOne();
        List<String> expectedStrings = new ArrayList<String>();
        expectedStrings.add("Bach");
        expectedStrings.add("Frank");
        Assert.assertEquals(actualStrings, expectedStrings);
    }

    @Test
    public void getAmountDueAndWebsiteByEmail() {
        SortableDataTablesFactoryPage sortableDataTablesFactoryPage = new SortableDataTablesFactoryPage(driver);
        List<String> actualStrings = sortableDataTablesFactoryPage.getAmountDueAndWebsiteFromTableTwo();
        List<String> expectedStrings = new ArrayList<String>();
        expectedStrings.add("$51.00");
        expectedStrings.add("http://www.frank.com");
        Assert.assertEquals(actualStrings, expectedStrings);
    }

}
