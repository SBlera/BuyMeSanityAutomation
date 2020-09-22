import org.openqa.selenium.By;

public class NotificaionType extends BasePage {
    public static void SetNotificationTypeAndInfo() throws Exception {
        SingeltonDriver.getDriverInstance().findElement(By.className("send-now"));
        InsertXpathAndClickScreenShotOnFail("//span[.='ב-SMS']");
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember2123\"]", "0544566318");
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"resendReciver\"]", "0545932442");
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1593\"]/div/div[5]/div[2]/button[2]");
    }
}
