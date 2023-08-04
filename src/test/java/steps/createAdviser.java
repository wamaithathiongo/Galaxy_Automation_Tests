package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import static steps.LoginSteps.driver;

public class createAdviser {
    private String firstName;
    private String lastName;
    private String email;
    private Integer cellphone;
    private Integer password;
    private Integer code;


    private final WebDriver driver = new FirefoxDriver();
    @Given("they click on create adviser account")
    public void they_click_on_create_adviser_account() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='bodyDiv']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]"))
              .click();
    }



//    @Given("they provide the title as test")
//    public void they_provide_the_title_as_test() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//    @Given("they provide the work email  as testuser@mail.com")
//    public void they_provide_the_work_email_as_testuser_mail_com() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//    @Given("they provide the P.O.Box  as {int}")
//    public void they_provide_the_P_O_Box_as(Integer int1) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//    @Given("they select the employment status Employeed")
//    public void they_select_the_employment_status_Employeed() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//    @Given("they provide the current employer as test")
//    public void they_provide_the_current_employer_as_test() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//    @Given("they provide the mode of communication as email")
//    public void they_provide_the_mode_of_communication_as_email() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//    @Given("they provide the linkedin as linkedin")
//    public void they_provide_the_linkedin_as_linkedin() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//    @Given("they click create advisor account")
//    public void they_click_create_advisor_account() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//    @Then("they should be able to create advisor")
//    public void they_should_be_able_to_create_advisor() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }



}
