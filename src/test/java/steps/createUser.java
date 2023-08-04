package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import static steps.LoginSteps.driver;

public class createUser {
    private String firstName;
    private String lastName;
    private String email;
    private Integer cellphone;
    private Integer password;
    private Integer code;


    private final WebDriver driver = new FirefoxDriver();
    @Given("they click on Sign Up")
    public void they_click_on_Sign_Up() {

        driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
    }

    @And("they provide the firstname as test")
    public void they_provide_the_firstname_as_test() {
        firstName = "test";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).
                sendKeys(firstName);
    }
    @And("they provide the lastname as one")
    public void they_provide_the_lastname_as_one() {
        lastName ="one";
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/input[1]")).
                sendKeys(lastName);

    }


    @And("they provide the email  as testuser@mail.com")
    public void they_provide_the_email_as_testuser_mail_com() throws Throwable {
        email ="testuser@mail.com";
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/input[1]")).
                sendKeys(email);
    }


    @And("they provide the cellphone  as {int}")
    public void they_provide_the_cellphone_as(Integer int1) throws Throwable {
        Thread.sleep(2000);
        cellphone = int1;
        WebElement cellphoneInput = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/input[1]"));
        cellphoneInput.sendKeys(String.valueOf(cellphone));
    }

    @And("they provide the user password as {int}")
    public void they_provide_the_user_password_as(Integer int1) throws Throwable {
        password = int1;
        WebElement passwordInput = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/form[1]/div[1]/div[1]/div[7]/div[1]/input[1]"));
        passwordInput.sendKeys(String.valueOf(password));
    }
//
//
//
    @And("they confirm the password as {int}")
    public void they_confirm_the_password_as(Integer int1)throws Throwable  {
        password = int1;
        WebElement passwordInput = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/form[1]/div[1]/div[1]/div[8]/div[1]/input[1]"));
        passwordInput.sendKeys(String.valueOf(password));
    }

    @And("they provide a referral code {int}")
    public void they_provide_a_referral_code(Integer int1)throws Throwable  {
        code = int1;
        WebElement codeInput = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/form[1]/div[1]/div[1]/div[9]/div[1]/input[1]"));
        codeInput.sendKeys(String.valueOf(code));
    }

    @And("they click sign up")
    public void they_click_sign_up()throws Throwable  {
       driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
    }



     @Then("they should be able to sign up")
     public void they_should_be_able_to_sign_up() {

}


}
