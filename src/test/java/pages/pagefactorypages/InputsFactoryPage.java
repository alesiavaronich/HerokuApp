package pages.pagefactorypages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsFactoryPage extends BaseFactoryPage {

    @FindBy(xpath = "//input[@type='number']")
    private WebElement inputField;

    //Constructor
    public InputsFactoryPage(WebDriver driver) {
        super(driver);
    }

    public void fillNumberInput(int num) {
        String initialNumberSetByUser = Integer.toString(num);
        inputField.sendKeys(initialNumberSetByUser);
    }

    public int getTextFromInputField() {
        String textFromInputField = inputField.getAttribute("value");
        return Integer.parseInt(textFromInputField);
    }

    public void increaseNumbersByArrowKeys(int increaseByNum) {
        for (int i = 1; i <= increaseByNum; i++) {
            inputField.sendKeys(Keys.ARROW_UP);
        }
    }

    public void decreaseNumbersByArrowKeys(int decreseByNum) {
        for (int i = 0; i > decreseByNum; i--) {
            inputField.sendKeys(Keys.ARROW_DOWN);
        }
    }
}
