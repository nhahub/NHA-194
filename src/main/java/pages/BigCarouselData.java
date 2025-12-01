package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BigCarouselData {
    WebDriver driver;
    public BigCarouselData(WebDriver driver) {
        this.driver = driver;
    }
    By Title = By.xpath("//h1[@class=\"typography-module_display-xl-regular__ML8sw typography-module_md_display-2-xl-regular__a78Zc typography-module_lg_display-3-xl-regular__ySVj4 Text-module_upper__pWFEw\"]");
    By photo = By.xpath("//img[@id=\"f1-article-hero-image\"]");
    By Next = By.xpath("//p[@class=\"typography-module_display-2-xl-black__WHPIk typography-module_lg_display-3-xl-black__DSxi2 Text-module_upper__pWFEw\"]");
    By Related = By.xpath("(//h2[@class=\"typography-module_display-xl-black__yz0ha typography-module_lg_display-2-xl-black__LOh1v Text-module_upper__pWFEw\"])[1]");
    By Back = By.xpath("(//a[@data-f1rd-a7s-click=\"header_navigation_click\"])[1]");




    public void CheckThatTitleIsDisplayed() throws InterruptedException {
        Assert.assertTrue(driver.findElement(Title).isDisplayed());
    }
    public void CheckThatPhotoIsDisplayed() throws InterruptedException {
        Assert.assertTrue(driver.findElement(photo).isDisplayed());
    }
    public void CheckThatNextDisplayed() throws InterruptedException {
        Assert.assertTrue(driver.findElement(Next).isDisplayed());
    }
    public void CheckThatRelatedIsDisplayed() throws InterruptedException {
        Assert.assertTrue(driver.findElement(Related).isDisplayed());
    }
    public void ClickOnBackutton() throws InterruptedException {
        driver.findElement(Back).click();
    }
}
