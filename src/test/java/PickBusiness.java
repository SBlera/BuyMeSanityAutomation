public class PickBusiness extends BasePage {
    //flow to set gift type and price details
    public static void SetGiftAndPrice() throws Exception {
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1380\"]/div");
        InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1525\"]", "250");
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1524\"]/div[2]/div/button");

    }
}
