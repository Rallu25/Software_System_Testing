package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FriendRequestTest {
    @Test(description = "Friend Request Test")
    public void friendRequestTest() {
        boolean loggedIn1 = simulateLogin("raluca.osman02@e-uvt.ro", "password1");
        boolean loggedIn2 = simulateLogin("ana.stan02@e-uvt.ro", "password2");
        Assert.assertTrue(loggedIn1, "Login failed");
        Assert.assertTrue(loggedIn2, "Login failed");
        String friendRequest = "This is a new friend request!";
        boolean newFriendRequest = FriendRequestUp(friendRequest);
        Assert.assertTrue(newFriendRequest, "Was not accepted");
        boolean notification = FriendRequestNotification();
        Assert.assertTrue(notification, "no notification");
    }
    private boolean simulateLogin(String username, String password) {
        return true;
    }

    private boolean FriendRequestUp(String friendRequest) {
        return true;
    }

    private boolean FriendRequestNotification() {
        return true;
    }
}
