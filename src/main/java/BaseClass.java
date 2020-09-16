import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public String projectUrl ="https://www.google.com/";
    public static WebDriver driver;

    @BeforeClass
    public void setup(){
       try {
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Driver//geckodriver");
        driver = new FirefoxDriver(options=options, );
        options = Options()
        options.headless = True
        // driver = webdriver.Firefox(options=options, executable_path=r'C:\Utility\BrowserDrivers\geckodriver.exe')
       } catch (Exception e) {
           //TODO: handle exception
           System.out.println(e.getLocalizedMessage());
       }

    }

    @AfterClass
    public void teardown(){
        driver.close();
    }

}
