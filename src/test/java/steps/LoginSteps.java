package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSteps {
//    public static WebDriver driver = null;
    private final WebDriver driver = new FirefoxDriver();

    @Given("^the user is on landing page$")
    public void url_opened() {
        System.setProperty("webdriver.chrome.driver", "/home/charlene/Documents/Charlene/Workspace/chromedriver");
//        driver = new ChromeDriver();
      driver.manage().window().maximize();

        driver.get("https://enterprise-galaxy.vercel.app/login");
    }

    @And("^they provide the email as ([^\"]*)$")
    public void she_provides_the_email_as(String email) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(email);
    }

    @And("^they provide the password as ([^\"]*)$")
    public void she_provides_the_password_as(String password) throws Throwable {
       driver.findElement(By.name("password")).sendKeys(password);
    }

//    @And("they click the login button")
//    public void they_click_the_login_button() throws Throwable{
//        driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
//    }
//
    @Then("^they should log in$")
    public void she_logs_in() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
    }

}
