package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.Watchable;

public class InsiderPage {

    public InsiderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "wt-cli-accept-all-btn")
    public WebElement cookiesAcceptElement;

    @FindBy(xpath = "(//a[@id='navbarDropdownMenuLink'])[5]")
    public WebElement companyDdmElement;

    @FindBy(xpath = "//*[text()='Careers']")
    public WebElement careerElement;

    @FindBy(xpath = "(//h3[@class='category-title-media'])[1]")
    public WebElement FindYourCallingText;

    @FindBy(xpath = "(//h3[@class='category-title-media ml-0'])[1]")
    public WebElement OurLocationsText;

    @FindBy(xpath = "(//h2[@class='elementor-heading-title elementor-size-default'])[2]")
    public WebElement LifeAtInsiderText;

    @FindBy(xpath = "//a[text()='See all teams']")
    public WebElement seeAllTeamsButton;

    @FindBy(xpath = "(//h3[@class='text-center mb-4 mb-xl-5'])[12]")
    public WebElement QAButton;

    @FindBy(xpath = "//*[text()='See all QA jobs']")
    public WebElement seeAllQAJobsButton;

    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[1]")
    public WebElement locationFilterDdm;

    @FindBy(xpath = "(//div[@class='position-list-item-wrapper bg-light'])[1]")
    public WebElement firstJobElement;
}
