package Pageobjects;
import
public class LoginPage {
    WebDriver driver;


    public void navigateToLoginPage() {
        String loginUrl = "https://www.saucedemo.com/";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(loginUrl);

    }

    private By username = By.id("user-name");

    public void enterUsername(String usernameText) {
        driver.findElement(username).sendKeys(usernameText);

    }
    private By pswrd = By.id("password");

    public void enterPswrd(String pswrdText) {
        driver.findElement(pswrd).sendKeys(pswrdText);

    }
}
