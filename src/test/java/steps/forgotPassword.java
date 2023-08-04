package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import static steps.LoginSteps.driver;

public class forgotPassword {
     private String email;

    private final WebDriver driver = new FirefoxDriver();
    @Given("they click on forgot password")
    public void they_click_on_forgot_password() {
        driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
    }



    @And("they provide their email as charlynmbugua@gmail.com")
    public void they_provide_their_email_as_charlynmbugua_gmail_com() throws Throwable {
        email ="charlynmbugua@gmail.com";
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]")).
                sendKeys(email);
    }


    @And("they click recover my password")
    public void they_click_recover_my_password() throws Throwable  {
       driver.findElement(By.xpath("//button[contains(text(),'Recover My Password')]")).click();
    }



     @Then("they should recover password")
     public void they_should_recover_password() {

}


}
