package tests;

import constants.TestUtils;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ProductPage;
import utulity.BaseTest;

public class ProductTest extends BaseTest {
    ProductPage productPage;
    HomePage homePage;

    @Test
    public void testProduct() {
        productPage = new ProductPage(driver);
        homePage = new HomePage(driver);

        homePage.search(TestUtils.searchInfo.SEARCH_BOX)
                .searchBar();
        productPage.selectProductIndex(2);
        Assert.assertTrue(productPage.isDescriptionDisplayed());
    }
}
