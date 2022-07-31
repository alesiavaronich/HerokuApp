package pages.pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TyposFactoryPage extends BaseFactoryPage{

    @FindBy(xpath = "//div[@class='example']/p[2]")
    private WebElement textWithTypo;

    //Constructor
    public TyposFactoryPage(WebDriver driver) {
        super(driver);
    }

    public String getTextFromParagraph() {
        return textWithTypo.getText();
    }
}

