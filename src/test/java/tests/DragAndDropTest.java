package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.DragAndDropFactoryPage;

public class DragAndDropTest extends BaseTest{

    @BeforeMethod
    public void openDragAndDropUrl() {
        driver.get(Urls.HEROKUAPP_DRAGANDDROP_URL);
    }

    @Test
    public void dragAndDrop() {
        DragAndDropFactoryPage dragAndDrop = new DragAndDropFactoryPage(driver);
        dragAndDrop.switchToFrame();
        dragAndDrop.dragAndDrop();
        String actualText = dragAndDrop.getDroppedText();
        String expectedText = "Dropped!";
        Assert.assertEquals(actualText, expectedText, "No text or incorrect text message is displayed.");
    }
}
