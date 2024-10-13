package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utulity.BasePage;

public class DetailPage extends BasePage {
    private final By addToCart = By.xpath("//button[@class='addBasketUnify']");
    private final By basketLocator = By.xpath("//span[@class='basketTotalNum']");
    private final By spanLocator = By.xpath("//span[@class='btn btnBlack']");
    private final By scrollLocator = By.xpath("//td[@class='prodDetail']");
    private final By detailTestLocator = By.xpath("//a[@class='prodDescription']");

    public DetailPage(WebDriver driver) {
        super(driver);
    }

    public DetailPage addToCart() {
        clickToElement(addToCart);
        return this;
    }

    public DetailPage basket() {
        clickToElement(basketLocator);
        return this;
    }

    public DetailPage span() {
        clickToElement(spanLocator);
        return this;
    }

    public DetailPage scrollToElement() {
        scroll(scrollLocator);
        return this;
    }

    public Boolean isDescriptionDisplayed() {
        return isDisplayed(detailTestLocator);
    }
}
