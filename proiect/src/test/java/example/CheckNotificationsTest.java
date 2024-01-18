package example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckNotificationsTest {

    @Test(description = "Check Notifications Test")
    public void checkNotificationsTest() {
        boolean loggedIn = simulateLogin("username", "password");
        Assert.assertTrue(loggedIn, "Login failed");
        boolean notificationsChecked = checkNotifications();
        Assert.assertTrue(notificationsChecked, "Checking notifications failed");
    }


    private boolean simulateLogin(String username, String password) {
        return true;
    }


    private boolean checkNotifications() {
        return true;
    }
}
