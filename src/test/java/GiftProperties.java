public class GiftProperties extends BasePage{

    public static void SetGiftProperties() throws Exception {

        //flow to get to set gift properties
        InsertXpathAndClickScreenShotOnFail("//span[.='סכום']");
        InsertClassAndClickAndScreenShotOnFail("active-result",3);

        InsertXpathAndClickScreenShotOnFail("//span[.='אזור']");
        InsertClassAndClickAndScreenShotOnFail("active-result",2);

        InsertXpathAndClickScreenShotOnFail("//span[.='קטגוריה']");
        InsertClassAndClickAndScreenShotOnFail("active-result",7);

        InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember836\"]");
    }
}
