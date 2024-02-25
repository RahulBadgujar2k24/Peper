package com.mystore.TestScript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mysore.utilities.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclassTC {
	Readconfig4 read = new Readconfig4();
	public String browser = read.getbrowser();
	public String url = read.getApplicationurl();

	// create webdriver setup
	public static WebDriver driver;
	public static Logger logger;

	// provide annotaion
	@BeforeClass
	public void setup() {
		// with the help of switch case switch the driver
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			ChromeDriver opt = new ChromeDriver();

			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			driver = null;
			break;

		}

		// for logging
		logger = LogManager.getLogger("Pepercloud");
		// implicit wait of 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// open url
		driver.get(url);
		logger.info("url opened");
	}

	@AfterClass
	public void tearup() {
//		driver.close();
//		driver.quit();
	}

	//user method to capture screen shot
		public void captureScreenShot(WebDriver driver,String testName) throws IOException
		{
			//step1: convert webdriver object to TakesScreenshot interface
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			
			//step2: call getScreenshotAs method to create image file
			
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			
			File dest = new File(System.getProperty("user.dir") + "//ScreenShots//" + testName + ".png");
		
			//step3: copy image file to destination
			FileUtils.copyFile(src, dest);
		}

}
