package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LatestNews {
    WebDriver driver;
    public LatestNews(WebDriver driver) {
        this.driver = driver;
    }

    By Title = By.xpath("//p[@class=\"typography-module_display-2-xl-black__WHPIk typography-module_lg_display-3-xl-black__DSxi2 Text-module_upper__pWFEw text-text-5\"]");
    By Carousel = By.xpath("(//li[@class=\"ArticleListCard-module_articlecard__T-Ylh ArticleListCard-module_white__1HqgX link-target\"])[1]");
    By AnalysisButton = By.xpath("(//span[@class=\"Chip-module_inner__XjMR7\"])[2]");
    By AnalysisTitle = By.xpath("//span[@class=\"TextGradientCaption-module_blur__YZmEG TextGradientCaption-module_bottom__SuvlQ\"]");
    By TechnicalButton = By.xpath("(//a[@class=\"Chip-module_chip__9wrSg typography-module_body-xs-bold__TovJz\"])[2]");
    By TechnicalTitle = By.xpath("//span[@class=\"TextGradientCaption-module_blur__YZmEG TextGradientCaption-module_bottom__SuvlQ\"]");
    By LifeStyle = By.xpath("(//a[@class=\"Chip-module_chip__9wrSg typography-module_body-xs-bold__TovJz\"])[3]");
    By LifeStyleTitle = By.xpath("//span[@class=\"TextGradientCaption-module_outer__R-bP- TextGradientCaption-module_bottom__SuvlQ\"]");
    By F1Unlocked = By.xpath("(//a[@class=\"Chip-module_chip__9wrSg typography-module_body-xs-bold__TovJz\"])[4]");
    By F1UnlockedTitle = By.xpath("//span[@class=\"TextGradientCaption-module_blur__YZmEG TextGradientCaption-module_bottom__SuvlQ\"]");
    By F2 = By.xpath("(//a[@class=\"Chip-module_chip__9wrSg typography-module_body-xs-bold__TovJz\"])[5]");
    By F2Title = By.xpath("//span[@class=\"TextGradientCaption-module_outer__R-bP- TextGradientCaption-module_bottom__SuvlQ\"]");
    By F3 = By.xpath("(//a[@class=\"Chip-module_chip__9wrSg typography-module_body-xs-bold__TovJz\"])[6]");
    By F3Title = By.xpath("//span[@class=\"TextGradientCaption-module_blur__YZmEG TextGradientCaption-module_bottom__SuvlQ\"]");
    By F1Academy= By.xpath("(//a[@class=\"Chip-module_chip__9wrSg typography-module_body-xs-bold__TovJz\"])[7]");
    By F1AcademyTitle = By.xpath("//span[@class=\"TextGradientCaption-module_blur__YZmEG TextGradientCaption-module_bottom__SuvlQ\"]");
    By Back = By.xpath("(//a[@data-f1rd-a7s-click=\"header_navigation_click\"])[1]");






    public void CheckThatTitleIsDisplayed(){
        Assert.assertTrue(driver.findElement(Title).isDisplayed());
    }
    public void CheckThatCarouselIsDisplayed(){
        Assert.assertTrue( driver.findElement(Carousel).isDisplayed());
    }
    public void ClickonAnalysisButton(){
        driver.findElement(AnalysisButton).click();
    }
    public void CheckThatAnalysisTitleIsDisplayed(){
        Assert.assertTrue(driver.findElement(AnalysisTitle).isDisplayed());
    }
    public void ClickonTechnicalButton(){
        driver.findElement(TechnicalButton).click();
    }
    public void CheckThatTechnicalTitleIsDisplayed(){
        Assert.assertTrue(driver.findElement(TechnicalTitle).isDisplayed());
    }
    public void ClickOnLifeStyle(){
        driver.findElement(LifeStyle).click();
    }
    public void CheckThatLifeStyleTitleIsDisplayed(){
        Assert.assertTrue(driver.findElement(LifeStyleTitle).isDisplayed());
    }
    public void ClickOnF1Unlocked(){
        driver.findElement(F1Unlocked).click();
    }
    public void CheckThatF1UnlockedTitleIsDisplayed(){
        Assert.assertTrue(driver.findElement(F1UnlockedTitle).isDisplayed());
    }
    public void ClickOnF2(){
        driver.findElement(F2).click();
    }
    public void CheckThatF2TitleIsDisplayed(){
        Assert.assertTrue(driver.findElement(F2Title).isDisplayed());
    }
    public void ClickOnF3(){
        driver.findElement(F3).click();
    }
    public void CheckThatF3TitleIsDisplayed(){
        Assert.assertTrue(driver.findElement(F3Title).isDisplayed());
    }
    public void ClickOnF1Academy(){
        driver.findElement(F1Academy).click();
    }
    public void CheckThatF1AcademyTitleIsDisplayed(){
        Assert.assertTrue(driver.findElement(F1AcademyTitle).isDisplayed());
    }
    public void ClickOnBack(){
        driver.findElement(Back).click();
    }
}


