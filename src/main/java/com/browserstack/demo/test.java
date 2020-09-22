//package com.browserstack.demo;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class test {
//    static ExtentTest test;
//    static ExtentReports report;
//    @BeforeClass
//    public static void startTest()
//    {
//        report = new ExtentReports();
//        test = report.createTest("ExtentDemo");
//    }
//    @Test
//    public void extentReportsDemo()
//    {
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lera\\Desktop\\תלושים\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.buyme.co.il/");
//        if(driver.getTitle().equals("buyme"))
//        {
//            test.log(LogStatus.PASS, "Navigate success");
//        }
//        else
//        {
//            test.log(LogStatus.FAIL, "Test Failed");
//        }
//    }
//    @AfterClass
//    public static void endTest()
//    {
//        report.endTest(test);
//        report.flush();
//    }
//}