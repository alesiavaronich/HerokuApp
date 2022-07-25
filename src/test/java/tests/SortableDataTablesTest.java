package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.SortableDataTablesFactoryPage;

public class SortableDataTablesTest extends BaseTest{

    @BeforeMethod
    public void openSortableTablesUrl() {
        SortableDataTablesFactoryPage sortableDataTablesFactoryPage = new SortableDataTablesFactoryPage(driver);
        sortableDataTablesFactoryPage.clickSortableDataTablesLink();
    }

    @Test
    public void getRowContent() {
        SortableDataTablesFactoryPage sortableDataTablesFactoryPage = new SortableDataTablesFactoryPage(driver);
        //find the row number for a selected email and save it into a variable
        int rawNum = sortableDataTablesFactoryPage.getRowNumberForEmail("fbach@yahoo.com");
        //use the variable to extract the remaining data from the row where that email was found
        sortableDataTablesFactoryPage.printRawContent(rawNum);
    }


}
