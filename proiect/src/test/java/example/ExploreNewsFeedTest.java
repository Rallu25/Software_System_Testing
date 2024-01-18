package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExploreNewsFeedTest {

    @Test(description = "Explore News Feed Test")
    public void exploreNewsFeedTest() {
        boolean loggedIn = simulateLogin("username", "password");
        Assert.assertTrue(loggedIn, "Login failed");
        boolean exploreNewsFeed = exploreNewsFeed();
        Assert.assertTrue(exploreNewsFeed, "Exploring News Feed failed");
    }
    private boolean simulateLogin(String username, String password) {
        return true;
    }
    private boolean exploreNewsFeed() {
        return true;
    }
}

