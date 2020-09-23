public class EventType extends BasePage {
    //flow for setting an event type for gift
    public static void SetEventType() throws Exception {
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1652_chosen\"]");
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1652_chosen\"]/div/ul/li[4]");
        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember2114\"]");
    }
}
