package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FooterSponsors {
    WebDriver driver;

    public FooterSponsors(WebDriver driver) {
        this.driver = driver;
    }

    By footer = By.xpath("//footer[@class='webview-hidden']");
    By sponsorsList = By.xpath("//footer[@class='webview-hidden']//a/img");

    public void checkSponsorsStepByStep() throws InterruptedException {
        WebElement footerElement = driver.findElement(footer);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footerElement);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> sponsors = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(sponsorsList));

        Actions actions = new Actions(driver);

        for (WebElement sponsorImg : sponsors) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sponsorImg);

            String originalBorder = (String) ((JavascriptExecutor) driver)
                    .executeScript("return arguments[0].style.border || '';", sponsorImg);
            String originalOpacity = (String) ((JavascriptExecutor) driver)
                    .executeScript("return arguments[0].style.opacity || '';", sponsorImg);
            String originalTransition = (String) ((JavascriptExecutor) driver)
                    .executeScript("return arguments[0].style.transition || '';", sponsorImg);

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].style.transition = 'opacity 300ms ease, border 300ms ease';" +
                            "arguments[0].style.border = '3px solid rgba(255,0,0,0.8)';" +
                            "arguments[0].style.opacity = '0.5';",
                    sponsorImg);

            actions.moveToElement(sponsorImg).perform();

            String src = sponsorImg.getAttribute("src");

            WebElement link = sponsorImg.findElement(By.xpath("./.."));
            String href = link.getAttribute("href");
            Boolean imageLoaded = (Boolean) ((JavascriptExecutor) driver)
                    .executeScript(
                            "return arguments[0].complete && typeof arguments[0].naturalWidth != 'undefined' && arguments[0].naturalWidth > 0",
                            sponsorImg);


            Thread.sleep(250);

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].style.border = arguments[1];" +
                            "arguments[0].style.opacity = arguments[2];" +
                            "arguments[0].style.transition = arguments[3];",
                    sponsorImg, originalBorder, originalOpacity, originalTransition);
        }
    }
}
