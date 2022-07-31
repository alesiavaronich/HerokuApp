package pages.pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropFactoryPage extends BaseFactoryPage{

    @FindBy(xpath = "//iframe[@class='demo-frame']")
    private WebElement iFrame;

    @FindBy(xpath = "//div[@id='draggable']")
    private WebElement source;

    @FindBy(xpath = "//div[@id='droppable']")
    private WebElement target;

    @FindBy(xpath = "//div[@id='droppable']/p")
    private WebElement droppedText;

    public DragAndDropFactoryPage(WebDriver driver) {
        super(driver);
    }

    public void switchToFrame() {
        driver.switchTo().frame(iFrame);
    }

    public void dragAndDrop() {
        Actions actions = new Actions(driver);
        actions.clickAndHold(source).moveToElement(target).release().build().perform();
    }

    public String getDroppedText() {
        return droppedText.getText();
    }

}
