package Formula1;

import Drivers.DriverFactory;
import Drivers.DriverType;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;

@Listeners(TestListener.class)
public class formula1Test {
    /// //////////////////////////////////////////
    WebDriver driver;
    Homepage homepage;
    BigCarouselData bigCarousel;
    Standing standing;
    LatestNews latestNews;
    LatestVideo latestVideo;
    LiveTiming liveTiming;
    Drivers drivers;
    F1Unlocked f1Unlocked;
    Subscribe subscribe;
    SignIn signIn;
    Teams teams;
    Awards awards;
    /// //////////////////////////////////////////




    /// ///////////////////Cockies///////////////////////////
    private void loadCookies(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("cookies.data"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String name = parts[0];
                String value = parts[1];
                String domain = parts[2];
                String path = parts[3];
                Date expiry = null;
                if (!"null".equals(parts[4])) {
                    expiry = Date.from(Instant.parse(parts[4]));
                }
                boolean isSecure = Boolean.parseBoolean(parts[5]);

                Cookie cookie = new Cookie.Builder(name, value)
                        .domain(domain)
                        .path(path)
                        .isSecure(isSecure)
                        .expiresOn(expiry)
                        .build();
                driver.manage().addCookie(cookie);
            }
            reader.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }

    /// ///////////////////Coockies///////////////////////////

    @BeforeClass
    public void setUp() {
        DriverFactory driverFactory = new DriverFactory(DriverType.CHROME, false);
        driver = driverFactory.getDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.formula1.com/");
        Reporter.getCurrentTestResult().getTestContext().setAttribute("driver", driver);


        homepage = new Homepage(driver);
        bigCarousel = new BigCarouselData(driver);
        standing = new Standing(driver);
        latestNews = new LatestNews(driver);
        latestVideo = new LatestVideo(driver);
        liveTiming = new LiveTiming(driver);
        drivers = new Drivers(driver);
        f1Unlocked = new F1Unlocked(driver);
        subscribe = new Subscribe(driver);
        signIn = new SignIn(driver);
        teams = new Teams(driver);
        awards = new Awards(driver);

        loadCookies();
    }

    @Test(priority = 1)
    public void homepagetest() throws InterruptedException {
        homepage.clickonAccept();
        homepage.ClickOnBigCarousel();
    }



    @Test(priority = 2)
    public void BigCarouselPageTest() throws InterruptedException {
        bigCarousel.CheckThatTitleIsDisplayed();
        bigCarousel.CheckThatPhotoIsDisplayed();
        bigCarousel.CheckThatNextDisplayed();
        bigCarousel.CheckThatRelatedIsDisplayed();
        bigCarousel.ClickOnBackutton();
    }


    @Test(priority = 3)
    public void StandingPageTest() throws InterruptedException {
        homepage.ClickOnStandings();
        standing.CheckTitle();
        standing.CheckFirstDriver();
        standing.ClickOnTeams();
        standing.CheckFirstTeam();
        standing.ClickOnBack();
    }


    @Test(priority = 4)
    public void LatestNewsPageTest() throws InterruptedException {
        homepage.ClickOnLatestNews();
        latestNews.CheckThatTitleIsDisplayed();
        latestNews.CheckThatCarouselIsDisplayed();
        latestNews.ClickonAnalysisButton();
        latestNews.CheckThatAnalysisTitleIsDisplayed();
        latestNews.ClickonTechnicalButton();
        latestNews.CheckThatTechnicalTitleIsDisplayed();
        latestNews.ClickOnLifeStyle();
        latestNews.CheckThatLifeStyleTitleIsDisplayed();
        latestNews.ClickOnF1Unlocked();
        latestNews.CheckThatF1UnlockedTitleIsDisplayed();
        latestNews.ClickOnF2();
        latestNews.CheckThatF2TitleIsDisplayed();
        latestNews.ClickOnF3();
        latestNews.CheckThatF3TitleIsDisplayed();
        latestNews.ClickOnF1Academy();
        latestNews.CheckThatF1AcademyTitleIsDisplayed();
        latestNews.ClickOnBack();
    }


    @Test(priority = 5)
    public void LatestVideoPage() throws InterruptedException {
        homepage.ClickOnLatestVideo();
        latestVideo.CheckMustWatch();
        latestVideo.CheckHighlight();
        latestVideo.CheckInterView();
        latestVideo.CheckLatestVideos();
        latestVideo.ClickOnBack();
    }

    @Test(priority = 6)
    public void LiveTimingPageTest() throws InterruptedException {
        homepage.ClickOnLiveTiming();
        liveTiming.CheckThatTitleIsDisplayed();
//        liveTiming.CheckThatForm1sDisplayed();
//        liveTiming.CheckThatForm2sDisplayed();
        liveTiming.ClickOnBackButton();
    }


    @Test(priority = 7)
    public void DriversPageTest() throws InterruptedException {
        homepage.ClickOnViewAllDrivers();
        drivers.CheckThatTitleIsDisplayed();
        drivers.ClickOnPlayer1();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer2();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer3();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer4();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer5();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer6();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer7();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer8();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer9();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer10();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer11();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer12();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer13();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer14();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer15();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer16();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer17();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer18();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer19();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnPlayer20();
        drivers.CheckThatTextIsDisplayed();
        drivers.ClickOnBack();
        drivers.ClickOnBack2();
    }


    @Test(priority = 8)
    public void F1UnlockedPageTest ()  throws InterruptedException {
        homepage.ClickOnF1Unlocked();
        f1Unlocked.CheckThatTitleIsDisplayed();
        f1Unlocked.CheckThatIframesDisplayed();
        f1Unlocked.ClickOnBackButton();
    }

    @Test(priority = 9)
    public void SubscribePageTest() throws InterruptedException {
        homepage.ClickOnSubscribe();
        subscribe.CheckTheTitle();
        subscribe.CheckIframes();
        subscribe.ClickOntheButton();
        subscribe.CheckIframes();
        subscribe.ClickOnTheBack();
    }

//    @Test(priority = 10)
//    public void SigninPageTest() throws InterruptedException {
//        subscribe.ClickOnSignIn();
//        signIn.TypeEmail();
//        signIn.TypePassword();
//        signIn.ClickOnSignIn();
//        signIn.ClickOnBack();
//    }

    @Test(priority = 11)
    public void TeamsPageTest() throws InterruptedException {
        homepage.ClickOnTeams();
        teams.CheckTitleIsDisplayed();
        teams.ClickOnOne();
        teams.CheckTeamNameIsDisplayed();
        teams.CheckStaticsIsDisplayed();
        teams.CheckTeamProfileIsDisplayed();
        teams.ClickOnBack();
        teams.ClickOnTwo();
        teams.CheckTeamNameIsDisplayed();
        teams.CheckStaticsIsDisplayed();
        teams.CheckTeamProfileIsDisplayed();
        teams.ClickOnBack();
        teams.ClickOnThree();
        teams.CheckTeamNameIsDisplayed();
        teams.CheckStaticsIsDisplayed();
        teams.CheckTeamProfileIsDisplayed();
        teams.ClickOnBack();
        teams.ClickOnFour();
        teams.CheckTeamNameIsDisplayed();
        teams.CheckStaticsIsDisplayed();
        teams.CheckTeamProfileIsDisplayed();
        teams.ClickOnBack();
        teams.ClickOnFive();
        teams.CheckTeamNameIsDisplayed();
        teams.CheckStaticsIsDisplayed();
        teams.CheckTeamProfileIsDisplayed();
        teams.ClickOnBack();
        teams.ClickOnSix();
        teams.CheckTeamNameIsDisplayed();
        teams.CheckStaticsIsDisplayed();
        teams.CheckTeamProfileIsDisplayed();
        teams.ClickOnBack();
        teams.ClickOnSeven();
        teams.CheckTeamNameIsDisplayed();
        teams.CheckStaticsIsDisplayed();
        teams.CheckTeamProfileIsDisplayed();
        teams.ClickOnBack();
        teams.ClickOnEight();
        teams.CheckTeamNameIsDisplayed();
        teams.CheckStaticsIsDisplayed();
        teams.CheckTeamProfileIsDisplayed();
        teams.ClickOnBack();
        teams.ClickOnNine();
        teams.CheckTeamNameIsDisplayed();
        teams.CheckStaticsIsDisplayed();
        teams.CheckTeamProfileIsDisplayed();
        teams.ClickOnBack();
        teams.ClickOnTen();
        teams.CheckTeamNameIsDisplayed();
        teams.CheckStaticsIsDisplayed();
        teams.CheckTeamProfileIsDisplayed();
        teams.ClickOnBack();
        teams.ClickOnBack2();
    }

    @Test(priority = 12)
    public void AwardsPageTest() throws InterruptedException {
        homepage.ClickOnAwards();
        awards.CheckTitle();
        awards.ClickOnOne();
        awards.CheckAwardTitle();
        awards.ClickOnBack();
        homepage.ClickOnAwards();
        awards.CheckTitle();
        awards.ClickOnTwo();
        awards.CheckAwardTitle();
        awards.ClickOnBack();
        homepage.ClickOnAwards();
        awards.CheckTitle();
        awards.ClickOnThree();
        awards.CheckAwardTitle();
        awards.ClickOnBack();
        homepage.ClickOnAwards();
        awards.CheckTitle();
        awards.ClickOnFour();
        awards.CheckAwardTitle();
        awards.ClickOnBack();
        homepage.ClickOnAwards();
        awards.CheckTitle();
        awards.ClickOnFive();
        awards.CheckAwardTitle();
        awards.ClickOnBack();
    }

    @Test(priority = 13)
    public void FooterSponsorsStepByStepTest() throws InterruptedException {
        FooterSponsors footerSponsors = new FooterSponsors(driver);
        footerSponsors.checkSponsorsStepByStep();
    }



    @AfterClass
    public void tearDown() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        driver.quit();
    }
}
