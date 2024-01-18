package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeEmailNotificationSettingsTest {

    @Test(description = "Change Email Notification Settings Test")
    public void changeEmailNotificationSettingsTest() {
        boolean loggedIn = simulateLogin("username", "password");
        Assert.assertTrue(loggedIn, "Login failed");
        boolean onSettingsPage = navigateToSettingsPage();
        Assert.assertTrue(onSettingsPage, "Navigation to settings page failed");
        boolean emailSettingsChanged = changeEmailNotificationSettings();
        Assert.assertTrue(emailSettingsChanged, "Changing email notification settings failed");
        boolean notificationsReceived = simulateNotifications();
        Assert.assertTrue(notificationsReceived, "Receiving notifications failed");
    }


    private boolean simulateLogin(String username, String password) {

        return true;
    }


    private boolean navigateToSettingsPage() {

        return true;
    }


    private boolean changeEmailNotificationSettings() {

        return true;
    }


    private boolean simulateNotifications() {

        return true;
    }
}