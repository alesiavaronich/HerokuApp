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
        NotificationMessageFactoryPage notificationMessageFactoryPage = new NotificationMessageFactoryPage(driver);
        notificationMessageFactoryPage.clickLink();
        String actualSuccessMessage = notificationMessageFactoryPage.getMessageText();
        String expectedSuccessMessage = "Action unsuccesful, please try again";
        Assert.assertTrue(actualSuccessMessage.equals(expectedSuccessMessage), "Invalid message");

        //что делать с неустойчивыми тестами? результат то правильный, то неправильный
    }

    @Test(priority = 2)
    public void readFailureMessage() {
        NotificationMessageFactoryPage notificationMessageFactoryPage = new NotificationMessageFactoryPage(driver);
        notificationMessageFactoryPage.clickLink();
        String actualSuccessMessage = notificationMessageFactoryPage.getMessageText();
        String expectedSuccessMessage = "Action successful";
        Assert.assertTrue(actualSuccessMessage.equals(expectedSuccessMessage), "Invalid message");

        //что делать с неустойчивыми тестами? результат то правильный, то неправильный
    }
}

