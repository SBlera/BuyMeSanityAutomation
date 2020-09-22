import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class BasePage {


    private static String xpath;

    public static void InsertXpathAndClick(String xpath) {
        BasePage.xpath = xpath;
        SingeltonDriver.getDriverInstance().findElement(By.xpath(xpath)).click();
    }

    static void InsertXpathAndClickScreenShotOnFail(String xpath) throws Exception {
        try {
            InsertXpathAndClick(xpath);
        } catch (NoSuchElementException e) {
            System.out.println("InsertXpathAndClickANoSuchElement");
            TakeScrShot("C:\\Users\\Lera\\Desktop\\InsertXpathAndClickANoSuchElement.png");

        }

    }

    public static void InsertClassIndexAndClick(String Class, int Index) {
        SingeltonDriver.getDriverInstance().findElements(By.className(Class)).get(Index).click();
    }

    static void InsertClassAndClickAndScreenShotOnFail(String Class, int index) throws Exception {
        try {
            InsertClassIndexAndClick(Class, index);
        } catch (NoSuchElementException e) {
            System.out.println("InsertClassIndexAndClickNoSuchElement");
            TakeScrShot("C:\\Users\\Lera\\Desktop\\InsertClassIndexAndClickNoSuchElement.png");
        }
    }

    public static void InsertIDAndKeysToSend(String ID, String KeysToSend) {
        SingeltonDriver.getDriverInstance().findElement(By.id(ID)).sendKeys(KeysToSend);
    }

    static void InsertIDAndKeysToSendScreenShotOnFail(String ID, String KeysToSend) throws Exception {
        try {
            InsertIDAndKeysToSend(ID, KeysToSend);
        } catch (NoSuchElementException e) {
            TakeScrShot("C:\\Users\\Lera\\Desktop\\InsertIDAndKeysToSendNoSuchElement.png");
            System.out.println("InsertIDAndKeysToSendNoSuchElement");
        }
    }

    public static void InsertIDAndClick(String ID) {
        SingeltonDriver.getDriverInstance().findElement(By.id(ID)).click();
    }

    static void InsertIDAndClickScreenShotOnFail(String ID) throws Exception {
        try {
            InsertIDAndClick(ID);
        } catch (NoSuchElementException e) {
            TakeScrShot("C:\\Users\\Lera\\Desktop\\InsertIDAndClickNoSuchElement.png");
            System.out.println("InsertIDAndClickNoSuchElement");
        }
    }

    public static void InsertClassNameAndClick(String ClassName) {
        SingeltonDriver.getDriverInstance().findElement(By.className(ClassName)).click();
    }

    static void InsertClassNameAndClickScreenShotOnFail(String ClassName) throws Exception {
        try {
            InsertClassNameAndClick(ClassName);
        } catch (NoSuchElementException e) {
            TakeScrShot("C:\\Users\\Lera\\Desktop\\InsertClassNameAndClickNoSuchElement.png");
            System.out.println("InsertClassNameAndClickNoSuchElement");
        }
    }

    public static void InsertNameAndKeysToSend(String Name, String KeysToSend) {
        SingeltonDriver.getDriverInstance().findElement(By.name(Name)).sendKeys(KeysToSend);
    }

    static void InsertNameAndKeysToSendScreenShotOnFail(String Name, String KeysToSend) throws Exception {
        try {
            InsertNameAndKeysToSend(Name, KeysToSend);
        } catch (NoSuchElementException e) {
            TakeScrShot("C:\\Users\\Lera\\Desktop\\InsertNameAndKeysToSendNoSuchElement.png");
            System.out.println("InsertNameAndKeysToSendNoSuchElement");
        }
    }

    public static void InsertXpathAndKeysToSend(String Xpath, String KeysToSend) {
        SingeltonDriver.getDriverInstance().findElement(By.xpath(Xpath)).sendKeys(KeysToSend);
    }

    static void InsertXpathAndKeysToSendScreenShotOnFail(String Xpath, String KeysToSend) throws Exception {
        try {
            InsertXpathAndKeysToSend(Xpath, KeysToSend);
        } catch (NoSuchElementException e) {
            TakeScrShot("C:\\Users\\Lera\\Desktop\\InsertXpathAndKeysToSendSendNoSuchElement.png");
            System.out.println("InsertXpathAndKeysToSendSendNoSuchElement");
        }
    }

    public static String TakeScrShot(String Path) throws Exception{
        TakesScreenshot scrShot = ((TakesScreenshot) SingeltonDriver.getDriverInstance());
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestinationFile = new File(Path);
        FileUtils.copyFile(SrcFile, DestinationFile);
        return Path;

    }
}





