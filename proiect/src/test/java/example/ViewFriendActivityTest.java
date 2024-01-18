package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewFriendActivityTest {

    @Test(description = "View Friend's Activity Test")
    public void viewFriendActivityTest() {
        boolean loggedIn = simulateLogin("username", "password");
        Assert.assertTrue(loggedIn, "Login failed");
        String friendId = "123";
        boolean onFriendProfile = navigateToFriendProfile(friendId);
        Assert.assertTrue(onFriendProfile, "Navigation to friend's profile failed");
        boolean clickedActivityTab = clickActivityTab();
        Assert.assertTrue(clickedActivityTab, "Clicking Activity tab failed");
        boolean viewedFriendActivity = viewFriendActivity();
        Assert.assertTrue(viewedFriendActivity, "Viewing friend's activity failed");
    }


    private boolean simulateLogin(String username, String password) {

        return true;
    }


    private boolean navigateToFriendProfile(String friendId) {

        return true; }


    private boolean clickActivityTab() {

        return true;
    }

    private boolean viewFriendActivity() {

        return true;
    }
}
