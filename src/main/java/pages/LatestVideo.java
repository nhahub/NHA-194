package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LatestVideo {
    WebDriver driver;
    public LatestVideo(WebDriver driver) {
        this.driver = driver;
    }


    By MustWatch = By.xpath("(//div[@class=\"flex gap-px-16 justify-between items-center\"])[1]");
    By Highlight = By.xpath("(//h2[@class=\"typography-module_display-xl-black__yz0ha typography-module_lg_display-2-xl-black__LOh1v Text-module_upper__pWFEw\"])[2]");
    By InterView = By.xpath("(//h2[@class=\"typography-module_display-xl-black__yz0ha typography-module_lg_display-2-xl-black__LOh1v Text-module_upper__pWFEw\"])[3]");
    By LatestVideos = By.xpath("(//h2[@class=\"BundleHeader-module_heading__LTH8y typography-module_display-2-xl-black__WHPIk typography-module_lg_display-3-xl-black__DSxi2\"])[1]");
    By Back = By.xpath("(//a[@data-f1rd-a7s-click=\"header_navigation_click\"])[1]");




    public void CheckMustWatch(){
        Assert.assertTrue(driver.findElement(MustWatch).isDisplayed());
    }
    public void CheckHighlight(){
        Assert.assertTrue(driver.findElement(Highlight).isDisplayed());
    }
    public void CheckInterView(){
       Assert.assertTrue(driver.findElement(InterView).isDisplayed());
    }
    public void CheckLatestVideos(){
        Assert.assertTrue(driver.findElement(LatestVideos).isDisplayed());
    }
    public void ClickOnBack(){
        driver.findElement(Back).click();
    }
}
