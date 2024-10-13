package utulity;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToElement(By locator) {
        driver.findElement(locator).click();
    }

    public void clickToElementByIndex(By locator, Integer index) {
        driver.findElements(locator).get(index).click();
    }

    public void sendKeysToElement(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).sendKeys(text);
    }

    public void scroll(By locator) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        try {
            int yScrollPosition = driver.findElement(locator).getLocation().getY() - 500;
            javascriptExecutor.executeScript("window.scroll(0, " + yScrollPosition + ");");
        } catch (Exception e) {
            System.out.println("Could not scrool to element...");
        }
    }

    public Boolean isDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }
}

