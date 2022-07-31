package pages.pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsFactoryPage extends BaseFactoryPage{

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    private WebElement jsAlertButton;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    private WebElement jsConfirmButton;

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    private WebElement jsPromptButton;

    @FindBy(xpath = "//p[@id='result']")
    private WebElement resultMessage;

    public AlertsFactoryPage(WebDriver driver) {
        super(driver);
    }

    public void clickJsAlertButton() {
        jsAlertButton.click();
    }

    public void clickJsConfirmButton() {
        jsConfirmButton.click();
    }

    public void clickJsPromptButton() {
        jsPromptButton.click();
    }

    public boolean resultMessageIsVisible() {
        return resultMessage.isDisplayed();
    }

    public String getPromptTextFromPage() {
        return resultMessage.getText();
    }
}
