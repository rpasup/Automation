import org.testng.annotations.Test;

public class FirstTestCase extends BaseClass{

    @Test(priority = 1)
   public void login(){
        driver.get(projectUrl);
    }
}
