package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BlockUserTest {

    @Test(description = "Block User Test")
    public void blockUserTest() {
        boolean loggedIn = simulateLogin("username", "password");
        Assert.assertTrue(loggedIn, "Login failed");
        String userProfileId = "123";
        boolean onUserProfile = navigateToUserProfile(userProfileId);

        Assert.assertTrue(onUserProfile, "Navigation to user's profile failed");

        boolean userBlocked = blockUser();
        Assert.assertTrue(userBlocked, "Blocking user failed");
    }
    private boolean simulateLogin(String username, String password) {

        return true; }
    private boolean navigateToUserProfile(String userProfileId) {

        return true;
    }
    private boolean blockUser() {
        return true;
    }
}
