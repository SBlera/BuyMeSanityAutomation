//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.Markup;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.WebElement;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//
//import java.util.concurrent.TimeUnit;
//
//public class Report extends BasePage {
//    private static ExtentReports extent;
//    private static ExtentTest test;
//
//    //create extent report
//    @BeforeClass
//    public static void beforeClass() {
//        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("C:\\Users\\Lera\\Desktop\\BuyMeExtent.html");
//        extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//        test = extent.createTest("BuyMeSanity", "Run_02");
//
//    }
//
//
//    @Test
//    public void TestAssertUrl()  {
//        try {
//            StartAndNavigate.RunStartAndNavigate();
//            String myURL = SingeltonDriver.getDriverInstance().getCurrentUrl();
//            System.out.println(myURL);
//            //compare url received from xml file and the one that actually opened
//            Assert.assertEquals(myURL, ProjectPropertiesReader.GetInstance().GetProjectUrl());
//            SingeltonDriver.getDriverInstance().close();
//            //log statuses to report
//            test.log(Status.PASS, "TestAssertUrl passed");
//        } catch (WebDriverException n) {
//            test.log(Status.FAIL, "TestAssertUrl failed " + n.getMessage());
//            System.out.println("TestAssertUrl failed");
//
//        }
//    }
//
//    @Test
//    public void TestAssertName()  {
//        try {
//            //flow gets to insert name field on registration screen
//            StartAndNavigate.RunStartAndNavigate();
//            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember714\"]/div/ul[1]/li[3]/a/span[2]");
//            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember688\"]/div/div[1]/div/div/div[3]/p/span");
//            SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//            //insert name
//            InsertIDAndKeysToSendScreenShotOnFail("ember1219", "Lera");
//            //read name
//            WebElement SentName = SingeltonDriver.getDriverInstance().findElement(By.id("ember1219"));
//            String GetName = SentName.getAttribute("value");
//            //compare values
//            Assert.assertEquals("Lera", GetName);
//            SingeltonDriver.getDriverInstance().close();
//            //log statuses to report
//            test.log(Status.PASS, "TestAssertName passed");
//        } catch (Exception e) {
//            test.log(Status.FAIL, "TestAssertName failed " + e.getMessage());
//            System.out.println("TestAssertName failed" + e.getMessage());
//        }
//    }
//
//    @Test
//    public void TestAssertEmail()  {
//        try {
//            //flow gets to insert email field on registration screen
//            StartAndNavigate.RunStartAndNavigate();
//            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember714\"]/div/ul[1]/li[3]/a/span[2]");
//            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember688\"]/div/div[1]/div/div/div[3]/p/span");
//            SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//            InsertIDAndKeysToSendScreenShotOnFail("ember1221", "lera.segal2+se39@gmail.com");
//            //read values
//            WebElement SentEmail = SingeltonDriver.getDriverInstance().findElement(By.id("ember1221"));
//            String GetEmail = SentEmail.getAttribute("value");
//            //compare values
//            Assert.assertEquals("lera.segal2+se39@gmail.com", GetEmail);
//            SingeltonDriver.getDriverInstance().close();
//            //log statuses to report
//            test.log(Status.PASS, "TestAssertEmail passed");
//        } catch (Exception e) {
//            test.log(Status.FAIL, "TestAssertEmail failed " + e.getMessage());
//            System.out.println("TestAssertEmail failed" + e.getMessage());
//        }
//    }
//
//    @Test
//    public void TestAssertPass()  {
//        try {
//            //flow gets to insert password field on registration screen
//            StartAndNavigate.RunStartAndNavigate();
//            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember714\"]/div/ul[1]/li[3]/a/span[2]");
//            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember688\"]/div/div[1]/div/div/div[3]/p/span");
//            SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//            InsertIDAndKeysToSendScreenShotOnFail("valPass", "Qwer1234");
//            //read values
//            WebElement SentPass = SingeltonDriver.getDriverInstance().findElement(By.id("valPass"));
//            String GetPass = SentPass.getAttribute("value");
//            //compare values
//            Assert.assertEquals("Qwer1234", GetPass);
//            SingeltonDriver.getDriverInstance().close();
//            //log statuses to report
//            test.log(Status.PASS, "TestAssertPass passed");
//        } catch (Exception e) {
//            test.log(Status.FAIL, "TestAssertPass failed " + e.getMessage());
//            System.out.println("TestAssertPass failed" + e.getMessage());
//        }
//    }
//
//    @Test
//    public void TestAssertConfPass()  {
//        try {
//            //flow gets to insert password conf. field on registration screen
//            StartAndNavigate.RunStartAndNavigate();
//            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember714\"]/div/ul[1]/li[3]/a/span[2]");
//            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember688\"]/div/div[1]/div/div/div[3]/p/span");
//            SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//            InsertIDAndKeysToSendScreenShotOnFail("ember1225", "Qwer1234");
//            //read values
//            WebElement SentPassConf = SingeltonDriver.getDriverInstance().findElement(By.id("ember1225"));
//            String GetPassConf = SentPassConf.getAttribute("value");
//            //compare values
//            Assert.assertEquals("Qwer1234", GetPassConf);
//            SingeltonDriver.getDriverInstance().close();
//            //log statuses to report
//            test.log(Status.PASS, "TestAssertConfPass passed");
//        } catch (Exception e) {
//            test.log(Status.FAIL, "TestAssertConfPass failed " + e.getMessage());
//            System.out.println("TestAssertConfPass failed" + e.getMessage());
//        }
//    }
//
//    @Test
//    public void TestReceiverName()  {
//        try {
//            //flow gets to insert Receivername field on registration screen
//            StartAndNavigate.RunStartAndNavigate();
//            Login.RunLoginOldUser();
//            GiftProperties.SetGiftProperties();
//            PickBusiness.SetGiftAndPrice();
//            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1642\"]/label[1]/span[2]");
//            InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1648\"]", "Big Sister");
//            //read values
//            WebElement SentReceiverName = SingeltonDriver.getDriverInstance().findElement(By.xpath("//*[@id=\"ember1648\"]"));
//            String GetReceiverName = SentReceiverName.getAttribute("value");
//            //compare values
//            Assert.assertEquals("Big Sister", GetReceiverName);
//            SingeltonDriver.getDriverInstance().close();
//            //log statuses to report
//            test.log(Status.PASS, "TestReceiverName passed");
//        } catch (Exception e) {
//            test.log(Status.FAIL, "TestReceiverName failed " + e.getMessage());
//            System.out.println("TestReceiverName failed" + e.getMessage());
//        }
//    }
//
//
//    @Test
//    public void TestSenderName() {
//        try {
//            //flow gets to insert Sendername field on registration screen
//            StartAndNavigate.RunStartAndNavigate();
//            Login.RunLoginOldUser();
//            GiftProperties.SetGiftProperties();
//            PickBusiness.SetGiftAndPrice();
//            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1642\"]/label[1]/span[2]");
//            SingeltonDriver.getDriverInstance().findElement(By.id("ember1650")).clear();
//            InsertXpathAndKeysToSendScreenShotOnFail("//*[@id=\"ember1650\"]", "Lil Sister");
//            //compare values
//            WebElement SentSenderName = SingeltonDriver.getDriverInstance().findElement(By.xpath("//*[@id=\"ember1650\"]"));
//            String GetSenderName = SentSenderName.getAttribute("value");
//            //compare values
//            Assert.assertEquals("Lil Sister", GetSenderName);
//            SingeltonDriver.getDriverInstance().close();
//            //log statuses to report
//            test.log(Status.PASS, "TestSenderName passed");
//        } catch (Exception e) {
//            test.log(Status.FAIL, "TestSenderName failed" + e.getMessage());
//            System.out.println("TestSenderName failed" + e.getMessage());
//        }
//    }
//    @AfterMethod
//    //take screenshot upon failure
//    public void getResult(ITestResult result) throws Exception {
//        if (result.getStatus() == ITestResult.FAILURE) {
//            String screenShotPath = TakeScrShot("image");
//            test.log(Status.FAIL, result.getThrowable());
//            test.log(Status.FAIL, (Markup) test.addScreenCaptureFromPath(screenShotPath));
//
//        }
//    }
//
//        @AfterClass
//        public static void afterClass(){
//            extent.flush();
//        }
//    }
//
//
//
//
//
////    private static ChromeDriver driver;
////    private static ExtentReports extent ;
////    private static ExtentTest test ;
////
////    private static ExtentReports extent = new ExtentReports();
////    private static ExtentTest test = extent.createTest("BuymeSanity", "Run_01");
////
////    @BeforeClass
////    public static void beforeClass() {
////        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("C:\\Users\\Lera\\Desktop\\extent.html");
////        ExtentReports extent = new ExtentReports();
////        extent.attachReporter(htmlReporter);
////        test = extent.createTest("BuyMeSanity01", "Basic Sanity Test");
////        extent.setSystemInfo("Environment", "Production");
////        extent.setSystemInfo("Tester", "Lera");
////        test.log(com.aventstack.extentreports.Status.INFO, "Before class");
////    }
////
////
////    @Test
////    public void TestAssertUrl() throws Exception {
////        try {
////            StartAndNavigate.RunStartAndNavigate();
////            String myURL = SingeltonDriver.getDriverInstance().getCurrentUrl();
////            System.out.println(myURL);
////            Assert.assertEquals(myURL, ProjectPropertiesReader.GetInstance().GetProjectUrl());
////            SingeltonDriver.getDriverInstance().close();
////        } catch (WebDriverException n) {
////            TakeScrShot("C:\\Users\\Lera\\Desktop\\תלושים\\TestAssertUrl.jpg");
////            test.log(Status.FAIL, "TestAssertUrl failed " + n.getMessage());
////        }
////    }
////
////
////
////
////
////
////    @AfterClass
////    public static void afterClass(){
////        extent.flush();
////    }
////}
//
