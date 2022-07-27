package pages.pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesFactoryPage extends BaseFactoryPage {

    @FindBy(xpath = "//input[@type='checkbox'][1]")
    public WebElement checkboxOne;

    @FindBy(xpath = "//input[@type='checkbox'][2]")
    public WebElement checkboxTwo;

    public CheckboxesFactoryPage(WebDriver driver) {
        super(driver);
    }

    public void selectCheckboxOne() {
        checkboxOne.click();
    }

    public void deselectCheckboxOne() {
        checkboxOne.click();
    }

    public void selectCheckboxTwo() {
        checkboxTwo.click();
    }

    public void deselectCheckboxTwo() {
        checkboxTwo.click();
    }

}
