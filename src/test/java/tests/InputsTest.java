package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.InputsFactoryPage;

public class InputsTest extends BaseTest{

    @BeforeMethod
    public void openInputsUrl() {
        driver.get(Urls.HEROKUAPP_INPUTS_URL);
    }

    @Test(priority = 1)
    public void increaseNumber() {
        int initialNumber = 10;
        int increaseValue = 15;
        InputsFactoryPage inputsFactoryPage = new InputsFactoryPage(driver);
        //принимаем исходное число от пользователя и конвертируем его в строку
        inputsFactoryPage.fillNumberInput(initialNumber);
        //увеличиваем число, используя arrowkeys
        inputsFactoryPage.increaseNumbersByArrowKeys(increaseValue);
        int expected = initialNumber + increaseValue;
        int actual = inputsFactoryPage.getTextFromInputField();
        Assert.assertEquals(actual, expected);
    }

   @Test(priority = 2)
    public void decreaseNumber() {
       int initialNumber = 16;
       int decreaseValueBy = -20; //Число должно быть отрицательным
       InputsFactoryPage inputsFactoryPage = new InputsFactoryPage(driver);
       //принимаем исходное число от пользователя и конвертируем его в строку
       inputsFactoryPage.fillNumberInput(initialNumber);
       //уменьшаем число, используя arrowkeys
       inputsFactoryPage.decreaseNumbersByArrowKeys(decreaseValueBy);
       int expected = initialNumber + decreaseValueBy;
       int actual = inputsFactoryPage.getTextFromInputField();
       Assert.assertEquals(actual, expected);
   }


}
