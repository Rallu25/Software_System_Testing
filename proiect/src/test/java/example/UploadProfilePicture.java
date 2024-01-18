package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadProfilePicture {

    @Test(description = "Upload Profile Picture Test")
    public void uploadProfilePictureTest() {
        boolean loggedIn = simulateLogin("raluca.osman02@e-uvt.ro", "password");
        Assert.assertTrue(loggedIn, "Login failed");
        String profilePictureUpdate = "This is the new profile picture!";
        boolean newProfilePicture = ProfilePictureUpdate(profilePictureUpdate);
        Assert.assertTrue(newProfilePicture, "The profile picture not updated");
        boolean postButtonClicked = clickPostButton();
        Assert.assertTrue(postButtonClicked, "Post button not clicked");
        boolean statusAppearsOnTimeline = checkStatusOnTimeline(profilePictureUpdate);

        Assert.assertTrue(statusAppearsOnTimeline, "Status does not appear on the timeline");
    }
    private boolean simulateLogin(String username, String password) {
        return true;
    }

    private boolean ProfilePictureUpdate(String statusText) {
        return true;
    }

    private boolean clickPostButton() {
        return true;
    }
    private boolean checkStatusOnTimeline(String statusPicture) {

        return true;
    }
}
