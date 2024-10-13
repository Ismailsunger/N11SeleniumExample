package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utulity.BasePage;


public class ProductPage extends BasePage {
    private final By addToFavoriteLocator = By.xpath("//span[@data-productid='634946208']");
    private final By imagesLocator = By.xpath("//img[@class='lazy cardImage']");
    private final By productTestLocator = By.xpath("//h1[@class='proName']");
    protected WebDriver driver;

    public ProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isDescriptionDisplayed() {
        return isDisplayed(productTestLocator);

    }

    public ProductPage addToFavorite() {
        clickToElement(addToFavoriteLocator);
        clickToElementByIndex(imagesLocator, 2);
        return this;
    }

    public DetailPage selectProductIndex(int productIndex) {
        clickToElementByIndex(imagesLocator, productIndex);
        return new DetailPage(driver);
    }


}
