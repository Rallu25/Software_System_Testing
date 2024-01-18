package example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JoinEventTest {

    @Test(description = "Join Event Test")
    public void joinEventTest() {
        boolean loggedIn = simulateLogin("username", "password");
        Assert.assertTrue(loggedIn, "Login failed");
        boolean browsingEvents = browseEvents();
        Assert.assertTrue(browsingEvents, "Browsing events failed");
        String eventId = "12465";
        boolean joinedEvent = joinEvent(eventId);

        Assert.assertTrue(joinedEvent, "Joining the event failed");
    }


    private boolean simulateLogin(String username, String password) {
        return true;
    }


    private boolean browseEvents() {
        return true;
    }


    private boolean joinEvent(String eventId) {
        return true;
    }
}

