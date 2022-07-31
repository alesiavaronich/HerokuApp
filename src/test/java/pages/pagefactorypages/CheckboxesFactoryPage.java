package pages.pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesFactoryPage extends BaseFactoryPage {

    @FindBy(xpath = "//input[@type='checkbox'][1]")
    private WebElement checkboxOne;

    @FindBy(xpath = "//input[@type='checkbox'][2]")
    private WebElement checkboxTwo;

    public CheckboxesFactoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCheckboxOneChecked() {
        return checkboxOne.isSelected();
    }

    public boolean isCheckboxTwoChecked() {
        return checkboxTwo.isSelected();
    }

    public void clickCheckboxOne() {
        checkboxOne.click();
    }

    public void clickCheckboxTwo() {
        checkboxTwo.click();
    }


}
