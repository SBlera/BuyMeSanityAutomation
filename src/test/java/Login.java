import java.util.concurrent.TimeUnit;

public class Login extends BasePage {

    public static void RunLoginNewUser() throws Exception {

        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember714\"]/div/ul[1]/li[3]/a/span[2]");
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember688\"]/div/div[1]/div/div/div[3]/p/span");
        SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1218\"]", "Lera");
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1220\"]", "lera.segal2+se56@gmail.com");
        InsertIDAndKeysToSendScreenShotOnFail("valPass", "Qwer1234");
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1225\"]","Qwer1234" );
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1217\"]/button");

    }
    public static void RunLoginOldUser() throws Exception {
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember714\"]/div/ul[1]/li[3]/a");
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1205\"]", "lera.segal2+se23@gmail.com");
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1207\"]", "Qwer1234");
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1197\"]/button");

    }
}
