import org.testng.annotations.Test;

public class FirstTestCase extends BaseClass{

    @Test(priority = 1)
   public void login() throws InterruptedException {
        driver.get(projectUrl);
        Thread.sleep(1000);
    }
}
