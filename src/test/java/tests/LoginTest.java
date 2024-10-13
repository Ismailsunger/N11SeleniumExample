package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import utulity.BaseTest;

import static constants.TestUtils.customerInfo;


public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSignupButton()
                .spanClick()
                .lastSpanClick()
                .enterCustomerName(customerInfo.NAME);

        sleep(5000);

        loginPage.enterCustomerLastName(customerInfo.LASTNAME)
                .enterMail(customerInfo.MAIL)
                .enterPhoneNumber(customerInfo.PHONE_NUMBER)
                .enterPassword(customerInfo.PASSWORD);

        sleep(2000);

        loginPage.scrollToElement()
                .selectGenderandMove();

        Assert.assertTrue(loginPage.isDescriptionDisplayed());
    }
}
