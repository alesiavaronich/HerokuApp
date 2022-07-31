package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.FileUploaderFactoryPage;

public class FileUploaderTest extends BaseTest{

    @BeforeMethod
    public void openFileUploaderUrl() {
        driver.get(Urls.HEROKUAPP_FILEUPLOADER_URL);
    }

    @Test
    public void uploadFile() {
        String expectedFileName = "testFileForHerokuApp.txt";
        FileUploaderFactoryPage fileUploader = new FileUploaderFactoryPage(driver);
        fileUploader.chooseFile();
        fileUploader.clickUploadButton();
        String actualFileName = fileUploader.getUploadedFileName();
        Assert.assertEquals(actualFileName, expectedFileName, "Uploaded file name is incorrect!");
    }

}
