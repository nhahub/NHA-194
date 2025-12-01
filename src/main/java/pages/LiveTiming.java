package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class LiveTiming {
    WebDriver driver;
    WebDriverWait wait;

    public LiveTiming(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By Title = By.xpath("//h1[contains(@class,'f1-heading-black')]");
    By Form1 = By.xpath("(//div[@class=\"px-l py-normal\"])[1]");
    By Form2 = By.xpath("(//div[@class=\"px-l py-normal\"])[2]");
    By Back = By.xpath("//a[@class=\"grid grid-flow-col auto-cols-max rounded-5 cursor-pointer items-center transition-colors duration-200 font-titillium font-[600] w-full min-w-max laptop:w-auto laptop:text-center laptop:auto-cols-auto focus-visible:outline focus-visible:outline-offset-2 focus-visible:outline-[3px] focus-visible:outline-carbonBlack disabled:pointer-events-none disabled:opacity-75 disabled:cursor-default  m-auto w-max focus-visible:rounded-5 focus-visible:outline-offset-[3px] focus-visible:outline-[3px] hidden laptop:block pr-l z-10 laptop:focus:outline-white\"]");

    public void CheckThatTitleIsDisplayed(){
        WebElement title = wait.until(
                ExpectedConditions.visibilityOfElementLocated(Title)
        );
        Assert.assertTrue(title.isDisplayed());
    }

    public void CheckThatForm1sDisplayed(){
        WebElement f1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(Form1)
        );
        Assert.assertTrue(f1.isDisplayed());
    }

    public void CheckThatForm2sDisplayed(){
        WebElement f2 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(Form2)
        );
        Assert.assertTrue(f2.isDisplayed());
    }

    public void ClickOnBackButton(){
        WebElement back = wait.until(
                ExpectedConditions.elementToBeClickable(Back)
        );
        back.click();
    }
}
