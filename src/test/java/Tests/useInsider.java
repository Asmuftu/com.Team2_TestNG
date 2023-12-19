package Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InsiderPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class useInsider {

    //● Test Automation
    //1. Visit https://useinsider.com/ and check Insider home page is opened or not
    //2. Select “Company” menu in navigation bar, select “Careers” and check Career page, its
    //Locations, Teams and Life at Insider blocks are opened or not
    //3. Click “See All Teams”, select Quality Assurance, click “See all QA jobs”, filter jobs by
    //Location - Istanbul, Turkey and department - Quality Assurance, check presence of
    //jobs list
    //4. Check that all jobs’ Position contains “Quality Assurance”, Department contains
    //“Quality Assurance”, Location contains “Istanbul, Turkey” and “Apply Now” button
    //5. Click “Apply Now” button and check that this action redirects us to Lever Application
    //form page
    //- Test case should be written using any programming language and framework
    //(Python or Java + Selenium would be preferable)
    //- No BDD(Cucumber, Quantum, Codeception, etc.) frameworks are allowed
    //- Screenshot should be taken If test fails one of steps
    //- Test case should be able to run in Chrome and Firefox browsers and ensure that the
    //browser is parametrically changeable.
    //- Test code should fully meet POM requirements

    @Test
    public void insiderTesti(){
        //1. Visit https://useinsider.com/ and check Insider home page is opened or not
        Driver.getDriver().get(ConfigReader.getProperty("insiderUrl"));
        String expectedUrl = "https://useinsider.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        //2. Select “Company” menu in navigation bar, select “Careers” and check Career page, its
        //Locations, Teams and Life at Insider blocks are opened or not
        InsiderPage insiderPage = new InsiderPage();
        insiderPage.cookiesAcceptElement.click();
        insiderPage.companyDdmElement.click();
        insiderPage.careerElement.click();

        Assert.assertTrue(insiderPage.FindYourCallingText.isDisplayed());
        Assert.assertTrue(insiderPage.OurLocationsText.isDisplayed());
        Assert.assertTrue(insiderPage.LifeAtInsiderText.isDisplayed());

        //3. Click “See All Teams”, select Quality Assurance, click “See all QA jobs”, filter jobs by
        //Location - Istanbul, Turkey and department - Quality Assurance, check presence of
        //jobs list
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.bekle(1);
        insiderPage.seeAllTeamsButton.sendKeys(Keys.ENTER);
        insiderPage.QAButton.sendKeys(Keys.ENTER);
        insiderPage.seeAllQAJobsButton.sendKeys(Keys.ENTER);
        Select select = new Select(insiderPage.locationFilterDdm);
        select.selectByVisibleText("Istanbul, Turkey");
        Assert.assertTrue(insiderPage.firstJobElement.isDisplayed());



        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }
}

