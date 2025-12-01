package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.actions = new Actions(driver);
    }

    By BigCarousel = By.id("title:S3:");
    By Cookies = By.xpath("//button[text()='Accept All']");
    By iframe = By.xpath("//iframe[@title='SP Consent Message']");
    By Standing = By.xpath("(//span[@class='FeaturedButtonCard-module_overlay__pXDgk'])[1]");
    By LatestNews = By.xpath("(//span[@class='FeaturedButtonCard-module_overlay__pXDgk'])[2]");
    By LatestVideo = By.xpath("(//a[@class='FeaturedButtonCard-module_card__qicw6 FeaturedButtonCard-module_purple__CFE-X typography-module_display-m-bold__qgZFB'])[3]");
    By LiveTiming = By.xpath("(//span[@class='FeaturedButtonCard-module_overlay__pXDgk'])[4]");
    By ViewAllDrivers = By.xpath("(//a[contains(@class,'Button-module_link-ghost')])[2]");
    By F1Unlocked = By.xpath("(//a[@class='FeaturedButtonCard-module_card__qicw6 FeaturedButtonCard-module_purple__CFE-X typography-module_display-m-bold__qgZFB'])[5]");
    By Subscribe = By.xpath("(//a[contains(@class,'Button-module_brand')])[2]");
    By Teams = By.xpath("(//a[@href='/en/teams'])[1]");
    By Awards = By.xpath("//span[text()='F1 Awards']");


    public void clickonAccept() {
        WebElement cookieIframe = wait.until(ExpectedConditions.presenceOfElementLocated(iframe));
        driver.switchTo().frame(cookieIframe);

        WebElement rejectButton = driver.findElement(
                By.xpath("//button[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'essential')]")
        );
        rejectButton.click();

        driver.switchTo().defaultContent();
    }

    public void ClickOnBigCarousel() {
        wait.until(ExpectedConditions.elementToBeClickable(BigCarousel)).click();
    }

    public void ClickOnStandings() {
        wait.until(ExpectedConditions.elementToBeClickable(Standing)).click();
    }

    public void ClickOnLatestNews() {
        wait.until(ExpectedConditions.elementToBeClickable(LatestNews)).click();
    }

    public void ClickOnLatestVideo() {
        wait.until(ExpectedConditions.elementToBeClickable(LatestVideo)).click();
    }

    public void ClickOnLiveTiming() {
        wait.until(ExpectedConditions.elementToBeClickable(LiveTiming)).click();
    }

    public void ClickOnViewAllDrivers() {
        wait.until(ExpectedConditions.elementToBeClickable(ViewAllDrivers)).click();
    }

    public void ClickOnF1Unlocked() {
        wait.until(ExpectedConditions.elementToBeClickable(F1Unlocked)).click();
    }

    public void ClickOnSubscribe() {
        wait.until(ExpectedConditions.elementToBeClickable(Subscribe)).click();
    }

    public void ClickOnTeams() {
        wait.until(ExpectedConditions.elementToBeClickable(Teams)).click();
    }

    public void ClickOnAwards() {
        WebElement resultsMenu = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[@data-f1rd-a7s-click='header_navigation_click' and contains(text(),'Results')]")
                )
        );

        actions.moveToElement(resultsMenu).perform();

        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(Awards));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn);
        btn.click();
    }
}
