package tests;

import constants.TestUtils;
import org.junit.Assert;
import org.junit.Test;
import pages.DetailPage;
import pages.HomePage;
import pages.ProductPage;
import utulity.BaseTest;

public class DetailTest extends BaseTest {
    @Test
    public void testDetail() {
        HomePage homePage = new HomePage(driver);

        ProductPage productPage =
                homePage.search(TestUtils.searchInfo.SEARCH_BOX)
                        .searchBar();

        DetailPage detailPage =
                productPage.selectProductIndex(2);

        detailPage.addToCart()
                .basket();

        sleep(3000);
        detailPage.span();
        sleep(3000);
        detailPage.scrollToElement();

        Assert.assertTrue(detailPage.isDescriptionDisplayed());
    }
}
