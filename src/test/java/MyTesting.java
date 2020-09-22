import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MyTesting extends BasePage {
    public static ExtentReports extent;
    public static ExtentTest test;



    @Test
    public void TestAssertUrl() throws Exception {
        try {
            StartAndNavigate.RunStartAndNavigate();
            String myURL = SingeltonDriver.getDriverInstance().getCurrentUrl();
            System.out.println(myURL);
            Assert.assertEquals(myURL, ProjectPropertiesReader.GetInstance().GetProjectUrl());
            SingeltonDriver.getDriverInstance().close();
        } catch (WebDriverException n) {
//            TakeScrShot();
            System.out.println("TestAssertUrl failed");
        }
    }

    @Test
    public void TestAssertName() {
        try {
            StartAndNavigate.RunStartAndNavigate();
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember676\"]/div/ul[1]/li[3]/a");
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember650\"]/div/div[1]/div/div/div[3]/p/span");
            SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            InsertIDAndKeysToSendScreenShotOnFail("ember1179", "Lera");
            WebElement SentName = SingeltonDriver.getDriverInstance().findElement(By.id("ember1179"));
            String GetName = SentName.getAttribute("value");
            Assert.assertEquals("Lera", GetName);
            SingeltonDriver.getDriverInstance().close();
        } catch(Exception e) {
            System.out.println("TestAssertName failed");
        }
    }

    @Test
    public void TestAssertEmail()  {
        try {
            StartAndNavigate.RunStartAndNavigate();
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember676\"]/div/ul[1]/li[3]/a/span[2]");
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember650\"]/div/div[1]/div/div/div[3]/p/span");
            SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            InsertIDAndKeysToSendScreenShotOnFail("ember1181", "lera.segal2+se39@gmail.com");

            WebElement SentEmail = SingeltonDriver.getDriverInstance().findElement(By.id("ember1181"));
            String GetEmail = SentEmail.getAttribute("value");
            Assert.assertEquals("lera.segal2+se39@gmail.com", GetEmail);
            SingeltonDriver.getDriverInstance().close();

        }catch (Exception e) {
            System.out.println("TestAssertEmail failed");
        }
    }

    @Test
    public void TestAssertPass() {
        try {
            StartAndNavigate.RunStartAndNavigate();
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember676\"]/div/ul[1]/li[3]/a/span[2]");
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember650\"]/div/div[1]/div/div/div[3]/p/span");
            SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            InsertIDAndKeysToSendScreenShotOnFail("valPass", "Qwer1234");

            WebElement SentPass = SingeltonDriver.getDriverInstance().findElement(By.id("valPass"));
            String GetPass = SentPass.getAttribute("value");
            Assert.assertEquals("Qwer1234", GetPass);
            SingeltonDriver.getDriverInstance().close();
        } catch (Exception e){
            System.out.println("TestAssertPass failed");
        }
    }

    @Test
    public void TestAssertConfPass() throws Exception {
        try {
            StartAndNavigate.RunStartAndNavigate();
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember676\"]/div/ul[1]/li[3]/a/span[2]");
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember650\"]/div/div[1]/div/div/div[3]/p/span");
            SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            InsertIDAndKeysToSendScreenShotOnFail("ember1185", "Qwer1234");

            WebElement SentPassConf = SingeltonDriver.getDriverInstance().findElement(By.id("ember1185"));
            String GetPassConf = SentPassConf.getAttribute("value");
            Assert.assertEquals("Qwer1234", GetPassConf);
            SingeltonDriver.getDriverInstance().close();
        } catch (Exception e) {
            System.out.println("TestAssertConfPass failed");
        }
    }

    @Test
    public void TestReceiverName() throws Exception {
        try {
            StartAndNavigate.RunStartAndNavigate();
            Login.RunLoginOldUser();
            GiftProperties.SetGiftProperties();
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1323\"]/div/div[2]/img");
            InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1468\"]", "250");
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1467\"]/div[2]/div/button");
            InsertXpathAndClickScreenShotOnFail("//span[.='למישהו אחר']");
            InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1591\"]", "Big Sister");
            WebElement SentReceiverName = SingeltonDriver.getDriverInstance().findElement(By.xpath("//*[@id=\"ember1591\"]"));
            String GetReceiverName = SentReceiverName.getAttribute("value");
            Assert.assertEquals("Big Sister", GetReceiverName);
            SingeltonDriver.getDriverInstance().close();
        } catch(Exception e){
            System.out.println("TestReceiverName failed");
        }
    }


    @Test
    public void TestSenderName() throws Exception {
            try {
                StartAndNavigate.RunStartAndNavigate();
                Login.RunLoginOldUser();
                GiftProperties.SetGiftProperties();
                InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1323\"]/div/div[2]/img");
                InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1323\"]/div/div[2]/img");
                InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1468\"]", "250");
                InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1467\"]/div[2]/div/button");
                InsertXpathAndClickScreenShotOnFail("//span[.='למישהו אחר']");
                SingeltonDriver.getDriverInstance().findElement(By.id("ember1593")).clear();
                InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1593\"]", "Lil Sister");
                WebElement SentSenderName = SingeltonDriver.getDriverInstance().findElement(By.xpath("//*[@id=\"ember1593\"]"));
                String GetSenderName = SentSenderName.getAttribute("value");
                Assert.assertEquals("Lil Sister", GetSenderName);
                SingeltonDriver.getDriverInstance().close();
            } catch (Exception e){
                System.out.println("TestSenderName failed");
            }
        }}




//    @AfterClass
//    public static void tearDown() {
//        SingeltonDriver.driver.quit();
//    }


