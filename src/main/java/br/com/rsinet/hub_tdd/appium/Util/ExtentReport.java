package br.com.rsinet.hub_tdd.appium.Util;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ExtentReport {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static ExtentReports setExtent(String nomeReport) {
		String dateName = new SimpleDateFormat("dd_MM_yyyy HH.mm.ss").format(Calendar.getInstance().getTime());
		htmlReporter = new ExtentHtmlReporter("./target/" + nomeReport + "  " + dateName + ".html");

		htmlReporter.config().setDocumentTitle("Report");
		htmlReporter.config().setReportName("Report Tdd");
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("HostName", "Rsi Hub");
		extent.setSystemInfo("OS", "Windows 10 ");
		extent.setSystemInfo("Teste", "Isaque Antunes");
		extent.setSystemInfo("Browser", "App");
		return extent;
	}

	public static ExtentTest createTest(String testName) {
		test = extent.createTest(testName);
		return test;
	}

	public static void statusReported

	(ExtentTest test, WebDriver driver, String testName) throws IOException {

		String caminhoScreen = Screenshot.getScreenshot(driver, testName);

		test.addScreenCaptureFromPath(caminhoScreen);
	}

	public static void quitExtent(ExtentReports extent) {
		extent.flush();

	}
}