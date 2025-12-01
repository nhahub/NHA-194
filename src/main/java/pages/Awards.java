package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Awards {
    WebDriver driver;
    WebDriverWait wait;
    public Awards(WebDriver driver){
        this.driver = driver;
    }

    By Title = By.xpath("//p[@class=\"typography-module_display-xl-black__yz0ha typography-module_md_display-2-xl-black__Q-wh7 typography-module_lg_display-3-xl-black__DSxi2 Text-module_upper__pWFEw\"]");
    By One = By.xpath("(//a[@class=\"z-20\"])[1]");
    By two = By.xpath("(//a[@class=\"z-20\"])[2]");
    By three = By.xpath("(//a[@class=\"z-20\"])[3]");
    By four = By.xpath("(//a[@class=\"z-20\"])[4]");
    By five = By.xpath("(//a[@class=\"z-20\"])[5]");
    By AwardTitle = By.xpath("//h1[@class=\"typography-module_display-xl-regular__ML8sw typography-module_md_display-2-xl-regular__a78Zc typography-module_lg_display-3-xl-regular__ySVj4 Text-module_upper__pWFEw\"]");
    By Back = By.xpath("(//a[@data-f1rd-a7s-click=\"header_navigation_click\"])[1]");

    public void CheckTitle(){
        Assert.assertTrue(driver.findElement(Title).isDisplayed());
    }
    public void ClickOnOne(){
        driver.findElement(One).click();
    }
    public void ClickOnTwo(){
        driver.findElement(two).click();
    }
    public void ClickOnThree(){
        driver.findElement(three).click();
    }
    public void ClickOnFour(){
        driver.findElement(four).click();
    }
    public void ClickOnFive(){
        driver.findElement(five).click();
    }
    public void CheckAwardTitle(){
        Assert.assertTrue(driver.findElement(AwardTitle).isDisplayed());
    }
    public void ClickOnBack(){
        driver.findElement(Back).click();
    }

}
