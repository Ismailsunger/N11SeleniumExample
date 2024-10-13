package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utulity.BasePage;

public class LoginPage extends BasePage {
    private final By customerNameLocator = By.xpath("//input[@name='firstName']");
    private final By customerlastnameLocator = By.id("lastName");
    private final By customeremailLocator = By.xpath("//input[@id='registrationEmail']");
    private final By customerPhoneNumberLocator = By.xpath("//input[@id='phoneNumber']");
    private final By customerPasswordLocator = By.xpath("//input[@id='password']");
    private final By customerGenderLocator = By.xpath("//div[@class='genderInputBox']");
    private final By signupButtonLocator = By.xpath("//a[@title='Üye Ol']");
    private final By spanLocator = By.xpath("//div[@class='btnPrimary agreement-button']");
    private final By lastSpanLocator = By.xpath("//button[@class='dn-slide-deny-btn']");
    private final By loginTestLocator = By.xpath("//div[text()='Maksimum deneme sayısına ulaştınız.']");
    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public Boolean isDescriptionDisplayed() {
        return isDisplayed(loginTestLocator);
    }

    public LoginPage lastSpanClick() {
        clickToElement(lastSpanLocator);
        return this;
    }

    public LoginPage spanClick() {
        clickToElement(spanLocator);
        return this;
    }

    public LoginPage clickSignupButton() {
        clickToElement(signupButtonLocator);
        return this;
    }

    public LoginPage enterCustomerName(String customerName) {
        sendKeysToElement(customerNameLocator, customerName);
        return this;
    }

    public LoginPage enterCustomerLastName(String customerLastName) {
        sendKeysToElement(customerlastnameLocator, customerLastName);
        return this;
    }

    public LoginPage enterMail(String mail) {
        sendKeysToElement(customeremailLocator, mail);
        return this;
    }

    public LoginPage enterPhoneNumber(String phoneNumber) {
        sendKeysToElement(customerPhoneNumberLocator, phoneNumber);
        return this;
    }

    public LoginPage enterPassword(String password) {
        sendKeysToElement(customerPasswordLocator, password);
        return this;
    }

    public LoginPage scrollToElement() {
        scroll(customerPasswordLocator);
        return this;
    }

    public LoginPage selectGenderandMove() throws InterruptedException {
        clickToElement(customerGenderLocator);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB)
                .click()
                .sendKeys(Keys.TAB);
        Thread.sleep(3000);
        actions.click()
                .sendKeys(Keys.TAB);
        Thread.sleep(3000);
        actions.sendKeys(Keys.TAB)
                .click()
                .perform();
        return this;
    }
}






