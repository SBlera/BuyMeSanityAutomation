import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingeltonDriver {
    private static WebDriver driver;

    //create singelton driver
    public static WebDriver getDriverInstance()  {
        if(driver == null){
            var driverPath = ProjectPropertiesReader.GetInstance().GetDriverPath();
            var driverType = ProjectPropertiesReader.GetInstance().GetDriverType();
            System.setProperty(driverType, driverPath);
            driver = new ChromeDriver();
        }

        return driver;
    }
}
