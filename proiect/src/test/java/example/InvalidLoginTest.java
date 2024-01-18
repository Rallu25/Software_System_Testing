package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest {

    @Test(description = "Invalid Login Test")
    public void invalidLoginTest() {
        navigateToLoginPage();
        String invalidUsername = "invaliduser";
        String invalidPassword = "invalidpassword";
        boolean loginAttempt = performLogin(invalidUsername, invalidPassword);
        Assert.assertFalse(loginAttempt, "Login with invalid credentials should fail");
        boolean errorMessageDisplayed = checkErrorMessage();
        Assert.assertTrue(errorMessageDisplayed, "Error message not displayed");
    }


    private void navigateToLoginPage() {
    }


    private boolean performLogin(String username, String password) {
        return false;
    }


    private boolean checkErrorMessage() {

        return true;
    }
}
