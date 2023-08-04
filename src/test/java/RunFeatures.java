import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true ,features ={
        "src/test/java/features/createUser.feature"
        , "src/test/java/features/Login.feature"
        ,"src/test/java/features/forgotPassword.feature"
        ,"src/test/java/features/recoverpasswordlogin.feature"
       }
)
public class RunFeatures {


}
