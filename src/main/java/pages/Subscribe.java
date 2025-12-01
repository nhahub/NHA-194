package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Subscribe {
    WebDriver driver;
    public Subscribe(WebDriver driver){
        this.driver=driver;
    }


    By Title = By.xpath("//div[@class=\"text-white\"]");
    By Iframe1 = By.xpath("(//div[@class=\"bg-white border-4 border-transparent m-auto mt-5 w-full bg-white relative overflow-hidden justify-self-center max-w-lg lg:max-w-lg lg:mx-2.5 sm:px-0 rounded-2xl\"])[1]");
    By Iframe2 = By.xpath("(//div[@class=\"bg-white border-4 border-transparent m-auto mt-5 w-full bg-white relative overflow-hidden justify-self-center max-w-lg lg:max-w-lg lg:mx-2.5 sm:px-0 rounded-2xl\"])[2]");
    By Iframe3 = By.xpath("//div[@class=\"border-4 border-premiumYellow bg-surfaceNeutral m-auto mt-5 w-full bg-white relative overflow-hidden justify-self-center max-w-lg lg:max-w-lg lg:mx-2.5 sm:px-0 rounded-2xl\"]");
    By Button = By.xpath("//div[@class=\"py-2\"]");
    By SignIn = By.xpath("//a[@href=\"https://account.formula1.com/#/en/login?lead_source=web_f1core&redirect=https%3A%2F%2Fwww.formula1.com%2Fen-eg%2Fsubscribe-to-f1-tv\"]");
    By Back = By.xpath("//a[@href=\"https://www.formula1.com\"]");
    public void CheckTheTitle(){
        Assert.assertTrue(driver.findElement(Title).isDisplayed());
    }
    public void CheckIframes(){
        Assert.assertTrue(driver.findElement(Iframe1).isDisplayed());
        Assert.assertTrue(driver.findElement(Iframe2).isDisplayed());
        Assert.assertTrue(driver.findElement(Iframe3).isDisplayed());
    }
    public void ClickOntheButton(){
        driver.findElement(Button).click();
    }
    public void ClickOnSignIn(){
        driver.findElement(SignIn).click();
    }
    public void ClickOnTheBack(){
        driver.findElement(Back).click();
    }
}
