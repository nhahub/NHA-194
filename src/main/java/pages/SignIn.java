package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignIn {

    WebDriver driver;
    WebDriverWait wait;

    public SignIn(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }



    By Email = By.name("Login");
    By Password = By.name("Password");
    By Back = By.xpath("//a[@href='https://www.formula1.com']");
    By Button = By.xpath("(//button[@class='btn btn-primary'])[1]");




    public void TypeEmail(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Email))
                .sendKeys("aehab3850@gmail.com");
    }


    public void TypePassword(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Password))
                .sendKeys("XrsnF-zV.j9DNi9");
    }

    public void ClickOnSignIn(){
        wait.until(ExpectedConditions.elementToBeClickable(Button)).click();
    }

    public void ClickOnBack() {
        wait.until(ExpectedConditions.elementToBeClickable(Back)).click();

    }

}
