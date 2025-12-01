package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Drivers {
    WebDriver driver;
    WebDriverWait wait;

    public Drivers(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By Biography = By.xpath("(//h2[contains(@class,'BundleHeader-module_heading')])[1]");
    By ShopNow = By.xpath("//a[contains(text(), 'Shop now')]");
    By Title = By.xpath("//h1[contains(@class,'typography-module_display-2-xl-black')]");
    By One = By.xpath("(//div[contains(@class,'min-h-[112px]')])[1]");
    By two = By.xpath("(//div[contains(@class,'min-h-[112px]')])[2]");
    By three = By.xpath("(//div[contains(@class,'min-h-[112px]')])[3]");
    By four = By.xpath("(//div[contains(@class,'min-h-[112px]')])[4]");
    By five = By.xpath("(//div[contains(@class,'min-h-[112px]')])[5]");
    By six = By.xpath("(//div[contains(@class,'min-h-[112px]')])[6]");
    By seven = By.xpath("(//div[contains(@class,'min-h-[112px]')])[7]");
    By eight = By.xpath("(//div[contains(@class,'min-h-[112px]')])[8]");
    By nine = By.xpath("(//div[contains(@class,'min-h-[112px]')])[9]");
    By ten = By.xpath("(//div[contains(@class,'min-h-[112px]')])[10]");
    By eleven = By.xpath("(//div[contains(@class,'min-h-[112px]')])[11]");
    By twelve = By.xpath("(//div[contains(@class,'min-h-[112px]')])[12]");
    By thirteen = By.xpath("(//div[contains(@class,'min-h-[112px]')])[13]");
    By fourteen = By.xpath("(//div[contains(@class,'min-h-[112px]')])[14]");
    By fifteen = By.xpath("(//div[contains(@class,'min-h-[112px]')])[15]");
    By sixteen = By.xpath("(//div[contains(@class,'min-h-[112px]')])[16]");
    By seventeen = By.xpath("(//div[contains(@class,'min-h-[112px]')])[17]");
    By eighteen = By.xpath("(//div[contains(@class,'min-h-[112px]')])[18]");
    By nineteen = By.xpath("(//div[contains(@class,'min-h-[112px]')])[19]");
    By twenty = By.xpath("(//div[contains(@class,'min-h-[112px]')])[20]");
    By Back = By.xpath("//a[@class=\"Button-module_button__j6Qut Button-module_ghost__fV52q Button-module_small__3QaV7 typography-module_body-xs-bold__TovJz Button-module_showSpacers__iMklt\"]");
    By Back2 = By.xpath("(//a[@data-f1rd-a7s-click=\"header_navigation_click\"])[1]");
    public void CheckThatTitleIsDisplayed(){
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(Title));
        Assert.assertTrue(title.isDisplayed());
    }

    public void CheckThatTextIsDisplayed(){
        WebElement bio = wait.until(ExpectedConditions.visibilityOfElementLocated(Biography));
        Assert.assertTrue(bio.isDisplayed());
    }

    public void ClickOnBack2 (){
        wait.until(ExpectedConditions.elementToBeClickable(Back2)).click();
    }


    public void ClickOnPlayer1 () { wait.until(ExpectedConditions.elementToBeClickable(One)).click(); }
    public void ClickOnPlayer2 () { wait.until(ExpectedConditions.elementToBeClickable(two)).click(); }
    public void ClickOnPlayer3 () { wait.until(ExpectedConditions.elementToBeClickable(three)).click(); }
    public void ClickOnPlayer4 () { wait.until(ExpectedConditions.elementToBeClickable(four)).click(); }
    public void ClickOnPlayer5 () { wait.until(ExpectedConditions.elementToBeClickable(five)).click(); }
    public void ClickOnPlayer6 () { wait.until(ExpectedConditions.elementToBeClickable(six)).click(); }
    public void ClickOnPlayer7 () { wait.until(ExpectedConditions.elementToBeClickable(seven)).click(); }
    public void ClickOnPlayer8 () { wait.until(ExpectedConditions.elementToBeClickable(eight)).click(); }
    public void ClickOnPlayer9 () { wait.until(ExpectedConditions.elementToBeClickable(nine)).click(); }
    public void ClickOnPlayer10 () { wait.until(ExpectedConditions.elementToBeClickable(ten)).click(); }
    public void ClickOnPlayer11 () { wait.until(ExpectedConditions.elementToBeClickable(eleven)).click(); }
    public void ClickOnPlayer12 () { wait.until(ExpectedConditions.elementToBeClickable(twelve)).click(); }
    public void ClickOnPlayer13 () { wait.until(ExpectedConditions.elementToBeClickable(thirteen)).click(); }
    public void ClickOnPlayer14 () { wait.until(ExpectedConditions.elementToBeClickable(fourteen)).click(); }
    public void ClickOnPlayer15 () { wait.until(ExpectedConditions.elementToBeClickable(fifteen)).click(); }
    public void ClickOnPlayer16 () { wait.until(ExpectedConditions.elementToBeClickable(sixteen)).click(); }
    public void ClickOnPlayer17 () { wait.until(ExpectedConditions.elementToBeClickable(seventeen)).click(); }
    public void ClickOnPlayer18 () { wait.until(ExpectedConditions.elementToBeClickable(eighteen)).click(); }
    public void ClickOnPlayer19 () { wait.until(ExpectedConditions.elementToBeClickable(nineteen)).click(); }
    public void ClickOnPlayer20 () { wait.until(ExpectedConditions.elementToBeClickable(twenty)).click(); }

    public void ClickOnBack () { wait.until(ExpectedConditions.elementToBeClickable(Back)).click(); }
}
