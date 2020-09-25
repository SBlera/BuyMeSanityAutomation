import java.util.concurrent.TimeUnit;

public class StartAndNavigate {

    public static void RunStartAndNavigate() {
        //flow to start main flow and navigate to relevant website
        SingeltonDriver.getDriverInstance().navigate().to(ProjectPropertiesReader.GetInstance().GetProjectUrl());
        SingeltonDriver.getDriverInstance().manage().window().maximize();
        SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }
}
