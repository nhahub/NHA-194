package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Standing {
    WebDriver driver;
    public Standing(WebDriver driver){
        this.driver = driver;
    }

    By Title = By.xpath("//h1[@class=\"typography-module_display-xl-bold__Gyl5W typography-module_lg_display-2-xl-bold__chQ4m Text-module_upper__pWFEw max-w-content-fixed-lg md:max-w-content-fixed-lg lg:max-w-content-fixed-lg\"]");
    By FirstDriver = By.xpath("(//a[@href=\"/en/results/2025/drivers/LANNOR01/lando-norris\"])[2]");
    By Teams = By.xpath("(//span[@class=\"typography-module_body-m-compact-semibold__vAYUk\"])[2]");
    By FirstTeam = By.xpath("(//a[@href=\"/en/results/2025/team/McLaren-Mercedes\"])[2]");
    By Back = By.xpath("//a[@data-f1rd-a7s-click=\"header_navigation_click\"]");


    public void CheckTitle(){
        Assert.assertTrue(driver.findElement(Title).isDisplayed());
    }
    public void CheckFirstDriver(){
        Assert.assertTrue(driver.findElement(FirstDriver).isDisplayed());
    }
    public void ClickOnTeams(){
        driver.findElement(Teams).click();
    }
    public void CheckFirstTeam(){
        Assert.assertTrue(driver.findElement(FirstTeam).isDisplayed());
    }
    public void ClickOnBack(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(Back).click();
    }
}
