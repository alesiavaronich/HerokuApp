package pages.pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessageFactoryPage extends BaseFactoryPage{

    @FindBy(xpath = "//a[text()='Click here']")
    private WebElement clickHereLink;

    @FindBy(xpath = "//div[@id='flash']")
    private WebElement notificationMessage;

    //Constructor
    public NotificationMessageFactoryPage(WebDriver driver) {
        super(driver);
    }

    public void clickLink() {
        clickHereLink.click();
    }

    public String getTextFromMessage() {
        return notificationMessage.getText().trim();
    }
}
