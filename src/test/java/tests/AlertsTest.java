package tests;

import constants.Urls;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.AlertsFactoryPage;

public class AlertsTest extends BaseTest {

    @BeforeMethod
    public void openAlertsUrl() {
        driver.get(Urls.HEROKUAPP_ALERTS_URL);
    }

    @Test(priority = 1)
    public void validateJsAlertText() {
        String expectedTextFromAlert = "I am a JS Alert";
        AlertsFactoryPage alertsFactoryPage = new AlertsFactoryPage(driver);
        alertsFactoryPage.clickJsAlertButton();
        Alert alert = driver.switchTo().alert();
        String actualTextFromAlert = alert.getText();
        alert.accept();
        Assert.assertEquals(actualTextFromAlert, expectedTextFromAlert, "Alert's text is not correct.");
    }

    @Test(priority = 2)
    public void validateJsConfirmText() {
        String expectedTextFromConfirm = "I am a JS Confirm";
        AlertsFactoryPage alertsFactoryPage = new AlertsFactoryPage(driver);
        alertsFactoryPage.clickJsConfirmButton();
        Alert confirm = driver.switchTo().alert();
        String actualTextFromConfirm = confirm.getText();
        confirm.dismiss();
        Assert.assertEquals(actualTextFromConfirm, expectedTextFromConfirm, "Confirm's text is not correct");
    }

    @Test(priority = 3)
    public void validateJsPromptTextExistsOnPage() {
        AlertsFactoryPage alertsFactoryPage = new AlertsFactoryPage(driver);
        alertsFactoryPage.clickJsPromptButton();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Hello, World!");
        prompt.accept();
        String actualMessageOnPage = alertsFactoryPage.getPromptTextFromPage();
        String expectedMessageOnPage = "You entered: " + "Hello, World!";
        Assert.assertTrue(alertsFactoryPage.resultMessageIsVisible(), "Sent message is not visible on the page.");
        Assert.assertEquals(actualMessageOnPage, expectedMessageOnPage);
    }

}
