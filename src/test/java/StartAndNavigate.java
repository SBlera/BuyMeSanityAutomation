import java.util.concurrent.TimeUnit;

public class StartAndNavigate {

    public static void RunStartAndNavigate() {

        SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //navigate to website
        SingeltonDriver.getDriverInstance().navigate().to(ProjectPropertiesReader.GetInstance().GetProjectUrl());
        SingeltonDriver.getDriverInstance().manage().window().maximize();
        SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }
}
