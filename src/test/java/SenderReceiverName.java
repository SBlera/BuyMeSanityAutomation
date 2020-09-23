import org.openqa.selenium.By;

public class SenderReceiverName extends BasePage {
    //flow to set sender & receiver of gift name details
    public static void SetSenderReceiverNameInfo() throws Exception {
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1642\"]/label[1]/span[2]");
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1648\"]","Big Sister");
        SingeltonDriver.getDriverInstance().findElement(By.xpath("//*[@id=\"ember1650\"]")).clear();
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1650\"]","Lil Sister");

    }
}
