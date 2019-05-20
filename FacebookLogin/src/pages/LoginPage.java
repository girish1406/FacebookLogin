package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="email")
    private WebElement unTB;
    
    @FindBy(id="pass")
    private WebElement pwTB;
    
    @FindBy(xpath="//input[@type='submit']")
    private WebElement loginBTN;
    
    public LoginPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void setUN(String un) {
 	   unTB.sendKeys(un);
    }
    
    public void setPW(String pw) {
 	   pwTB.sendKeys(pw);
    }
    
    public void clickLogin() {
 	   loginBTN.click();
    }
}
