package example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchForFriendsTest {

    @Test(description = "Search for Friends Test")
    public void searchForFriendsTest() {

        boolean onHomepage = navigateToHomepage();
        Assert.assertTrue(onHomepage, "Navigation to homepage failed");


        String searchTerm = "FriendName";
        boolean searchResultsDisplayed = searchForFriends(searchTerm);

        Assert.assertTrue(searchResultsDisplayed, "Search for friends failed");
    }


    private boolean navigateToHomepage() {

        return true;
    }


    private boolean searchForFriends(String searchTerm) {

        return true;
    }
}

