package tests;

import constants.Urls;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pagefactorypages.NotificationMessageFactoryPage;

public class NotificationMessageTest extends BaseTest{

    @BeforeMethod
    public void openNotificationMessageUrl() {
        driver.get(Urls.HEROKUAPP_NOTIFICATION_MESSAGE_URL);
    }

    @Test(priority = 1)
    public void readSuccessMessage() {
        String expectedSuccessMessage = "Action successful";
        NotificationMessageFactoryPage notificationMessageFactoryPage = new NotificationMessageFactoryPage(driver);
        notificationMessageFactoryPage.clickLink();
        String actualSuccessMessage = notificationMessageFactoryPage.getTextFromMessage();
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "Invalid message");
    }

}

