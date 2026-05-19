package ExtenReporting;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners implements ITestListener{
	
		WebDriver driver;
		ExtentSparkReporter htmlReporter; 
		ExtentReports reports;
		ExtentTest test;

		public void configureReport() {
			htmlReporter = new ExtentSparkReporter("ExtentListenerReportDemo//karrar111.html");
			
			reports= new ExtentReports();
			reports.attachReporter(htmlReporter);
			
			//add system information/environment info to reports
			reports.setSystemInfo("Machine:", "HP_i5");
			reports.setSystemInfo("RAM:", "16GB");
			reports.setSystemInfo("OS", "windows 11");
			reports.setSystemInfo("browser:", "chrome123");
			reports.setSystemInfo("user name:", "karrar");
			reports.setSystemInfo("Host:", "QA");
			
			//configuration to change look and feel of report
			htmlReporter.config().setDocumentTitle( "ExtentListenerReportDemo//Pravin111.html");
			htmlReporter.config().setReportName("This is my First Report");
			htmlReporter.config().setTheme(Theme.STANDARD);
		}
		@Override

		public void onStart(ITestContext context) {
			configureReport();
			System.out.println("This is test scenerio: 22222onTestSkipped"+context.getName());

		} 

		@Override

		public void onFinish(ITestContext context) {
			System.out.println("This is test scenerio: onTestSkipped"+context.getName());
			reports.flush();
			
		}
		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("This is test scenerio: onTestSuccess"+result.getName());
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("This is test scenerio:onTestSuccess"+result.getName());
			test = reports.createTest(result.getName());
			test.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test case is:   " +result.getName(), ExtentColor.GREEN));
		}

		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("This is test scenerio: onTestFailure"+result.getName());
			test = reports.createTest(result.getName());
			test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is:   " +result.getName(), ExtentColor.RED));
		}
		@Override
		public void onTestSkipped (ITestResult result) {
			System.out.println("This is test scenerio: onTestSkipped"+result.getName());
			test = reports.createTest(result.getName());
			test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip test case is:   " +result.getName(), ExtentColor.LIME));
		}
//			//add screenshot for failed test.
	//
//			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
//			Date date = new Date(0);
//			
	//
//			String actualDate = format.format(date);
	//
//			String screenshotPath = System.getProperty("user.dir")+
//			"/Reports/Screenshots/"+actualDate+".jpeg";
//			File dest = new File(screenshotPath);
	//
	//	
//			try {
//				FileUtils.copyFile(src, dest);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	//
//			
//		}

		

		

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("This is test scenerio: onTestFailedButwithinSuccessPercentage"+result.getName());

		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("This is test scenerio: onTestFailedwithTimeout"+result.getName());
		}

		
	}

	//
	/*
	<groupId>com.aventstack</groupId>
	<artifactId>extentreports</artifactId>
	<version>5.0.9</version>
	</dependency>
	*/

