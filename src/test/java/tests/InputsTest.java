package tests;

import constants.Urls;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.InputsFactoryPage;

public class InputsTest extends BaseTest{

    @BeforeMethod
    public void openInputsUrl() {
        driver.get(Urls.HEROKUAPP_INPUTS_URL);
    }

    @Test(priority = 1)
    public void increaseNumbersb() {
        InputsFactoryPage inputsFactoryPage = new InputsFactoryPage(driver);
        inputsFactoryPage.inputField.sendKeys("10");
        inputsFactoryPage.increaseNumbersByArrowKeys(15);

        //как привинтить сюда ассерт? хочу конвертировать стринг в инт, выдает ошибку
    }

   @Test(priority = 2)
    public void decreaseNumbers() throws InterruptedException {
        InputsFactoryPage inputsFactoryPage = new InputsFactoryPage(driver);
        inputsFactoryPage.inputField.sendKeys("5");
        inputsFactoryPage.decreaseNumbersByArrowKeys(-10);
        Thread.sleep(2000);

       //как привинтить сюда ассерт?
   }


}
