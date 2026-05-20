package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AdminPanelPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[3]/div/div[1]/h1")
    WebElement adminPanelHeading_xpath;

    public AdminPanelPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyAdminPanelPageIsVisible(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(adminPanelHeading_xpath));
        adminPanelHeading_xpath.isDisplayed();
    }
}
