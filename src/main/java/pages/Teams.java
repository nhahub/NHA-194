package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Teams {
    WebDriver driver;
    WebDriverWait wait;
    public Teams(WebDriver driver){
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    By Title = By.xpath("//h1[@class=\"typography-module_display-2-xl-black__WHPIk typography-module_lg_display-3-xl-black__DSxi2 Text-module_upper__pWFEw\"]");
    By One = By.xpath("(//p[@class=\"typography-module_display-l-bold__m1yaJ typography-module_lg_display-xl-bold__4nIv1 group-hover/team-card:underline\"])[1]");
    By Two = By.xpath("(//p[@class=\"typography-module_display-l-bold__m1yaJ typography-module_lg_display-xl-bold__4nIv1 group-hover/team-card:underline\"])[2]");
    By Three = By.xpath("(//p[@class=\"typography-module_display-l-bold__m1yaJ typography-module_lg_display-xl-bold__4nIv1 group-hover/team-card:underline\"])[3]");
    By Four = By.xpath("(//p[@class=\"typography-module_display-l-bold__m1yaJ typography-module_lg_display-xl-bold__4nIv1 group-hover/team-card:underline\"])[4]");
    By Five = By.xpath("(//p[@class=\"typography-module_display-l-bold__m1yaJ typography-module_lg_display-xl-bold__4nIv1 group-hover/team-card:underline\"])[5]");
    By Six = By.xpath("(//p[@class=\"typography-module_display-l-bold__m1yaJ typography-module_lg_display-xl-bold__4nIv1 group-hover/team-card:underline\"])[6]");
    By Seven = By.xpath("(//p[@class=\"typography-module_display-l-bold__m1yaJ typography-module_lg_display-xl-bold__4nIv1 group-hover/team-card:underline\"])[7]");
    By Eight = By.xpath("(//p[@class=\"typography-module_display-l-bold__m1yaJ typography-module_lg_display-xl-bold__4nIv1 group-hover/team-card:underline\"])[8]");
    By Nine = By.xpath("(//p[@class=\"typography-module_display-l-bold__m1yaJ typography-module_lg_display-xl-bold__4nIv1 group-hover/team-card:underline\"])[9]");
    By Ten = By.xpath("(//p[@class=\"typography-module_display-l-bold__m1yaJ typography-module_lg_display-xl-bold__4nIv1 group-hover/team-card:underline\"])[10]");
    By TeamName= By.xpath("//h1[@class=\"typography-module_display-3-xl-black__CWhFe typography-module_lg_display-4-xl-black__zBSx5 typography-module_xl_display-5-xl-black__gce0d Text-module_upper__pWFEw text-center\"]");
    By Statics = By.xpath("(//h2[@class=\"BundleHeader-module_heading__LTH8y typography-module_display-2-xl-black__WHPIk typography-module_lg_display-3-xl-black__DSxi2\"])[1]");
    By TeamProfile = By.xpath("(//h2[@class=\"BundleHeader-module_heading__LTH8y typography-module_display-2-xl-black__WHPIk typography-module_lg_display-3-xl-black__DSxi2\"])[2]");
    By Back = By.xpath("//a[@class=\"Button-module_button__j6Qut Button-module_ghost__fV52q Button-module_small__3QaV7 typography-module_body-xs-bold__TovJz Button-module_showSpacers__iMklt\"]");
    By Back2 = By.xpath("(//a[@data-f1rd-a7s-click=\"header_navigation_click\"])[1]");


    public void CheckTitleIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Title));
        Assert.assertTrue(driver.findElement(Title).isDisplayed());
    }

    public void ClickOnOne() {
        wait.until(ExpectedConditions.elementToBeClickable(One));
        driver.findElement(One).click();
    }

    public void ClickOnTwo() {
        wait.until(ExpectedConditions.elementToBeClickable(Two));
        driver.findElement(Two).click();
    }

    public void ClickOnThree() {
        wait.until(ExpectedConditions.elementToBeClickable(Three));
        driver.findElement(Three).click();
    }

    public void ClickOnFour() {
        wait.until(ExpectedConditions.elementToBeClickable(Four));
        driver.findElement(Four).click();
    }

    public void ClickOnFive() {
        wait.until(ExpectedConditions.elementToBeClickable(Five));
        driver.findElement(Five).click();
    }

    public void ClickOnSix() {
        wait.until(ExpectedConditions.elementToBeClickable(Six));
        driver.findElement(Six).click();
    }

    public void ClickOnSeven() {
        wait.until(ExpectedConditions.elementToBeClickable(Seven));
        driver.findElement(Seven).click();
    }

    public void ClickOnEight() {
        wait.until(ExpectedConditions.elementToBeClickable(Eight));
        driver.findElement(Eight).click();
    }

    public void ClickOnNine() {
        wait.until(ExpectedConditions.elementToBeClickable(Nine));
        driver.findElement(Nine).click();
    }

    public void ClickOnTen() {
        wait.until(ExpectedConditions.elementToBeClickable(Ten));
        driver.findElement(Ten).click();
    }

    public void CheckTeamNameIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TeamName));
        Assert.assertTrue(driver.findElement(TeamName).isDisplayed());
    }

    public void CheckTeamProfileIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TeamProfile));
        Assert.assertTrue(driver.findElement(TeamProfile).isDisplayed());
    }

    public void CheckStaticsIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Statics));
        Assert.assertTrue(driver.findElement(Statics).isDisplayed());
    }

    public void ClickOnBack() {
        wait.until(ExpectedConditions.elementToBeClickable(Back));
        driver.findElement(Back).click();
    }

    public void ClickOnBack2() {
        wait.until(ExpectedConditions.elementToBeClickable(Back2));
        driver.findElement(Back2).click();
    }
}
