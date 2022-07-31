package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.DropdownListFactoryPage;

import java.util.ArrayList;
import java.util.List;

public class DropdownListTest extends BaseTest{

    @BeforeMethod
    public void openDropdownListUrl() {
        driver.get(Urls.HEROKUAPP_DROPDOWNLIST_URL);
    }

    @Test
    public void validateNumberOfOptions() {
        WebElement dropdownList = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownList);
        List<WebElement> allOptions = select.getOptions();
        Assert.assertEquals(3, allOptions.size());
    }

    @Test
    public void validateNamesOfOptions() {
        DropdownListFactoryPage dropdownListFactoryPage = new DropdownListFactoryPage(driver);
        List<String> actualStrings = dropdownListFactoryPage.stringifyOptions();
        List<String> expectedStrings = new ArrayList<String>();
        expectedStrings.add("Please select an option");
        expectedStrings.add("Option 1");
        expectedStrings.add("Option 2");
        Assert.assertEquals(actualStrings, expectedStrings);
    }

    @Test
    public void validateSelectionOfOptionOne() {
        DropdownListFactoryPage ddList = new DropdownListFactoryPage(driver);
        Select select = ddList.createSelectObject();
        String option = "Option 1";
        select.selectByVisibleText(option);
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        Assert.assertTrue(ddList.isOptionOneSelected());
        Assert.assertEquals(option, selectedOptions.get(0).getText());
    }

    @Test
    public void validateSelectionOfOptionTwo() {
        DropdownListFactoryPage ddList = new DropdownListFactoryPage(driver);
        Select select = ddList.createSelectObject();
        String option = "Option 2";
        select.selectByVisibleText(option);
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        Assert.assertTrue(ddList.isOptionTwoSelected());
        Assert.assertEquals(option, selectedOptions.get(0).getText());
    }
}
