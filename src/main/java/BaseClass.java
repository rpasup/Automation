import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
    public String projectUrl ="http://35.238.96.65/";
    public static WebDriver driver;

    @BeforeClass
    public void setup(){
       try {
        // System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Driver//geckodriver");
        // options = Options();
        // options.headless = True;
        // driver = webdriver.Firefox(options=options, executable_path=r'C:\Utility\BrowserDrivers\geckodriver.exe')
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Driver//geckodriver");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        driver = new FirefoxDriver(firefoxOptions);
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
