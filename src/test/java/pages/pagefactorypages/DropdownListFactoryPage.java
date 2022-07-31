package pages.pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownListFactoryPage extends BaseFactoryPage{

    @FindBy(xpath = "//select[@id='dropdown']")
    private WebElement dropdownElement;

    @FindBy(xpath = "//select[@id='dropdown']/option")
    private List<WebElement> listOfOptions;

    @FindBy(xpath = "//option[@disabled='disable']")
    private WebElement disabledOption;

    @FindBy(xpath = "//option[@value='1']")
    private WebElement optionOne;

    @FindBy(xpath = "//option[@value='2']")
    private WebElement optionTwo;

    public DropdownListFactoryPage(WebDriver driver) {
        super(driver);
    }

    public List<String> stringifyOptions() {
        List<String> textFromWebElements = new ArrayList<String>();
        for(WebElement element : listOfOptions) {
            textFromWebElements.add(element.getText());
        }
        return textFromWebElements;
    }

    public Select createSelectObject() {
        Select select = new Select(dropdownElement);
        return select;
    }

    public boolean isOptionOneSelected() {
        WebElement option = optionOne;
        return optionOne.isSelected();
    }

    public boolean isOptionTwoSelected() {
        WebElement option = optionTwo;
        return optionTwo.isSelected();
    }

}
