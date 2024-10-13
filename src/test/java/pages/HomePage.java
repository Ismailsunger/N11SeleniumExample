package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utulity.BasePage;

public class HomePage extends BasePage {
    private final By signupButtonLocator = By.xpath("//a[@class='btnSignUp']");
    private final By searchButtonLocator = By.id("searchData");
    private final By searchBarLocator = By.className("iconsSearch");
    private final By homePageTestLocator = By.xpath("//div[@class='resultText ']");
    protected WebDriver driver;
    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public HomePage search(String search) {
        driver.findElement(searchButtonLocator).click();
        driver.findElement(searchButtonLocator).sendKeys(search);
        return this;
    }

    public ProductPage searchBar() {
        clickToElement(searchBarLocator);
        return new ProductPage(driver);
    }

    public HomePage clickSignupButton() {
        clickToElement(signupButtonLocator);
        return this;
    }

    public Boolean isDescriptionDisplayed() {
        return isDisplayed(homePageTestLocator);
    }
}
