package pages.pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploaderFactoryPage extends BaseFactoryPage{

    @FindBy(xpath = "//input[@type='file']")
    private WebElement chooseFileButton;

    @FindBy(xpath = "//input[@id='file-submit']")
    private WebElement uploadButton;

    @FindBy(xpath = "//div[@id='uploaded-files']")
    private WebElement uploadedFileName;

    public FileUploaderFactoryPage(WebDriver driver) {
        super(driver);
    }

    public void chooseFile() {
        chooseFileButton.sendKeys("D:/Projects/HerokuApp/src/test/resources/testFileForHerokuApp.txt");
    }

    public void clickUploadButton() {
        uploadButton.click();
    }

    public String getUploadedFileName() {
        return uploadedFileName.getText();
    }
}
