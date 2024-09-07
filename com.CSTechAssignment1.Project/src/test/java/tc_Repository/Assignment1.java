package tc_Repository;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ScreenshotCaptureUtility;
import genericUtilityOrLib.SeleniumUtility;
import objectRepository.HomePage;

/**
 * 
 * @author Karthik BC
 *
 */
public class Assignment1 extends BaseClass {

	@Test
	public void ass1() throws Exception {
		SeleniumUtility SUTIL = new SeleniumUtility();
		HomePage hp = new HomePage(driver);
		hp.getUrl1();
		driver.manage().window().setSize(new Dimension(1920, 1080));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1920_1080_url1");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(1366, 768));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1366_768_url1");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(1536, 864));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1536_864_url1");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(360, 640));
		ScreenshotCaptureUtility.captureScreenshot(driver, "360_640_url1");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(414, 896));
		ScreenshotCaptureUtility.captureScreenshot(driver, "414_896_url1");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(375, 667));
		ScreenshotCaptureUtility.captureScreenshot(driver, "375_667_url1");
		SUTIL.navigateBack(driver);
		hp.getUrl2();
		driver.manage().window().setSize(new Dimension(1920, 1080));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1920_1080_url2");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(1366, 768));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1366_768_url2");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(1536, 864));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1536_864_url2");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(360, 640));
		ScreenshotCaptureUtility.captureScreenshot(driver, "360_640_url2");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(414, 896));
		ScreenshotCaptureUtility.captureScreenshot(driver, "414_896_url2");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(375, 667));
		ScreenshotCaptureUtility.captureScreenshot(driver, "375_667_url2");
		SUTIL.navigateBack(driver);
	/*  hp.getUrl3();
		driver.manage().window().setSize(new Dimension(1920, 1080));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1920_1080_url3");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(1366, 768));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1366_768_url3");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(1536, 864));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1536_864_url3");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(360, 640));
		ScreenshotCaptureUtility.captureScreenshot(driver, "360_640_url3");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(414, 896));
		ScreenshotCaptureUtility.captureScreenshot(driver, "414_896_url3");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(375, 667));
		ScreenshotCaptureUtility.captureScreenshot(driver, "375_667_url3");
		SUTIL.navigateBack(driver);
		hp.getUrl4();
		driver.manage().window().setSize(new Dimension(1920, 1080));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1920_1080_url4");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(1366, 768));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1366_768_url4");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(1536, 864));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1536_864_url4");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(360, 640));
		ScreenshotCaptureUtility.captureScreenshot(driver, "360_640_url4");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(414, 896));
		ScreenshotCaptureUtility.captureScreenshot(driver, "414_896_url4");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(375, 667));
		ScreenshotCaptureUtility.captureScreenshot(driver, "375_667_url4");
		SUTIL.navigateBack(driver);
		hp.getUrl5();
		driver.manage().window().setSize(new Dimension(1920, 1080));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1920_1080_url5");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(1366, 768));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1366_768_url5");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(1536, 864));
		ScreenshotCaptureUtility.captureScreenshot(driver, "1536_864_url5");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(360, 640));
		ScreenshotCaptureUtility.captureScreenshot(driver, "360_640_url5");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(414, 896));
		ScreenshotCaptureUtility.captureScreenshot(driver, "414_896_url5");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(375, 667));
		ScreenshotCaptureUtility.captureScreenshot(driver, "375_667_url5");
		SUTIL.navigateBack(driver);	*/
	}

}
