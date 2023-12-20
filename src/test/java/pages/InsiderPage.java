package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.Watchable;
import java.util.List;

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

    @FindBy(xpath = "//h3[text()='Quality Assurance']")
    public WebElement QAButton;

    @FindBy(xpath = "//*[text()='See all QA jobs']")
    public WebElement seeAllQAJobsButton;

    @FindBy(xpath = "//select[@id='filter-by-location']")
    public WebElement locationFilterDdm;

    @FindBy(xpath = "(//div[@class='position-list-item-wrapper bg-light'])[1]")
    public WebElement firstJobElement;
    @FindBy(xpath = "//div[@class='col-12 d-flex flex-column flex-lg-row justify-content-lg-between align-items-lg-end']")
    public WebElement BrowseYaziElementi;

    @FindBy(xpath = "//div[@class='position-location text-large']")
    public List<WebElement> positionLocation;

    @FindBy(xpath = "//span[@class='position-department text-large font-weight-600 text-primary']")
    public List<WebElement> positionDepartment;

    @FindBy(xpath = "//a[@class='btn btn-navy rounded pt-2 pr-5 pb-2 pl-5']")
    public WebElement viewRoleBtn;
}
