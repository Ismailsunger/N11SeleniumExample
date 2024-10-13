package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import utulity.BaseTest;

import static constants.TestUtils.searchInfo;

public class HomePageTest extends BaseTest {

    private HomePage homePage;

    @Test
    public void testHomePage() {
        homePage = new HomePage(driver);
        homePage.search(searchInfo.SEARCH_BOX)
                .searchBar();
        Assert.assertTrue(homePage.isDescriptionDisplayed());
    }
}
