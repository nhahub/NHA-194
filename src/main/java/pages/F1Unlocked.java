package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class F1Unlocked {
    WebDriver driver;
    public F1Unlocked(WebDriver driver) {
        this.driver = driver;
    }


    By Title = By.xpath("//span[@class=\"TextGradientCaption-module_blur__YZmEG TextGradientCaption-module_bottom__SuvlQ\"]");
    By Iframe1 = By.xpath("(//div[@class=\"bg-surface-neutral-1 rounded-m px-px-32 py-px-24 md:px-px-48 md:py-px-24 grid [grid-template-columns:auto_1fr] [grid-template-rows:1fr_1fr] [grid-auto-flow:row] [grid-template-areas:'icon_headline''._body'] gap-x-px-16 gap-y-px-8 md:flex md:flex-col md:gap-0 md:items-start\"])[1]");
    By Iframe2 = By.xpath("(//div[@class=\"bg-surface-neutral-1 rounded-m px-px-32 py-px-24 md:px-px-48 md:py-px-24 grid [grid-template-columns:auto_1fr] [grid-template-rows:1fr_1fr] [grid-auto-flow:row] [grid-template-areas:'icon_headline''._body'] gap-x-px-16 gap-y-px-8 md:flex md:flex-col md:gap-0 md:items-start\"])[2]");
    By Iframe3 = By.xpath("(//div[@class=\"bg-surface-neutral-1 rounded-m px-px-32 py-px-24 md:px-px-48 md:py-px-24 grid [grid-template-columns:auto_1fr] [grid-template-rows:1fr_1fr] [grid-auto-flow:row] [grid-template-areas:'icon_headline''._body'] gap-x-px-16 gap-y-px-8 md:flex md:flex-col md:gap-0 md:items-start\"])[3]");
    By Back = By.xpath("(//a[@data-f1rd-a7s-click=\"header_navigation_click\"])[1]");

    public void CheckThatTitleIsDisplayed() {
        Assert.assertTrue(driver.findElement(Title).isDisplayed());
    }
    public void CheckThatIframesDisplayed() {
        Assert.assertTrue(driver.findElement(Iframe1).isDisplayed());
        Assert.assertTrue(driver.findElement(Iframe2).isDisplayed());
        Assert.assertTrue(driver.findElement(Iframe3).isDisplayed());
    }
    public void ClickOnBackButton() {
        driver.findElement(Back).click();
    }

}
