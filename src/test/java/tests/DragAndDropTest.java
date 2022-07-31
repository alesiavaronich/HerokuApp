package tests;

import constants.Urls;
import org.testng.annotations.BeforeMethod;

public class DragAndDropTest extends BaseTest{

    @BeforeMethod
    public void openDragAndDropUrl() {
        driver.get(Urls.HEROKUAPP_DRAGANDDROP_URL);
    }

}
