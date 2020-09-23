import org.openqa.selenium.By;

public class Notifications extends BasePage {
    //flow to set notification type and phone details
    public static void SetNotificationTypeAndInfo() throws Exception {
        SingeltonDriver.getDriverInstance().findElement(By.className("send-now"));
        InsertXpathAndClickScreenShotOnFail("//span[.='ב-SMS']");
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember2122\"]", "0544566318");
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"resendReciver\"]", "0545932442");
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1593\"]/div/div[5]/div[2]/button[2]");
    }

    public static void SendNotificationUponPayment() throws Exception {
        BasePage.InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1538\"]/div[3]/div/div[1]/label[1]");

    }
}

