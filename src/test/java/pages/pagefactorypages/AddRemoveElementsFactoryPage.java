package pages.pagefactorypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddRemoveElementsFactoryPage extends BaseFactoryPage{

    @FindBy(xpath = "//button[text()='Add Element']")
    private WebElement addElementButton;

    @FindBy(xpath = "//div[@id='elements']/button[1]")
    private WebElement deleteButton;

    //Constructor
    public AddRemoveElementsFactoryPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddElementButton(int count) {
        for(int i = 0; i<count; i++) {
            addElementButton.click();
        }
    }

    public void clickDeleteElementButton() {
        List<WebElement> deleteElements = driver.findElements(By.xpath("//button[@class='added-manually']"));
        int deleteElementsCount = deleteElements.size();
        if(deleteElementsCount > 0) {
            deleteButton.click();
            System.out.println("Deleted one element.");
        }
    }

    public int countDeleteElements() {
        List<WebElement> deleteElements = driver.findElements(By.xpath("//button[@class='added-manually']"));
        int deleteElementsCount = deleteElements.size();
        System.out.println("'Delete' buttons count: " + deleteElementsCount);
        return deleteElementsCount;
    }



}
