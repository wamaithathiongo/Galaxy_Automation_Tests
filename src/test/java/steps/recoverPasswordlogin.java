package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class recoverPasswordlogin {

    private final WebDriver driver = new FirefoxDriver();
    @Given("they click forgot password")
    public void they_click_forgot_password() {
        driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
    }


    @And("they click login")
    public void they_click_login() throws Throwable  {
        Thread.sleep(2000);
       driver.findElement(By.xpath("//a[contains(text(),'Log In?')]")).click();
    }



     @Then("they should be redirected to the login page")
     public void they_should_be_redirected_to_te_login_page() {
       driver.findElement(By.xpath("//h5[contains(text(),'Login to your account')]"));

     }


}
