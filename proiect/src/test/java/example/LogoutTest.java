package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest {
    @Test(description = "Logout Test")
    public void LogoutTest() {
        boolean loggedIn = simulateLogin("username", "password");
        Assert.assertTrue(loggedIn, "Login failed");
        boolean logoutButtonClicked = clickLogoutButton();
        Assert.assertTrue(logoutButtonClicked, "Logout button not clicked");
        boolean logoutMessageDisplayed = checkLogoutMessage();
        Assert.assertTrue(logoutMessageDisplayed, "Error message not displayed");
    }
    private boolean simulateLogin(String username, String password) {
        return true;
    }
    private boolean clickLogoutButton() {
        return true;
    }
    private boolean checkLogoutMessage() {

        return true;
    }

}
