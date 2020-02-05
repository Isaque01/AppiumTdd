package br.com.rsinet.hub_tdd.appium.PageObject;

import java.awt.Dimension;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.appium.Util.Scroll;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Cadastro_Page {

	private AndroidDriver<MobileElement> driver;
	private WebDriverWait wait;
	private WebElement element;

	public Cadastro_Page(AndroidDriver<MobileElement> driver2) {
		this.driver = driver2;
		wait = new WebDriverWait(this.driver, 10);
	}

	public void txtbox_UserName(String Name) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText\r\n"
						+ ""));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		element.sendKeys(Name);

	}

	public void txtbox_Email(String Email) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText\r\n"
						+ ""));
		element.click();
		element.sendKeys(Email);
		driver.hideKeyboard();

	}

	public void txtbox_Password(String Senha) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText\r\n"
						+ ""));
		element.click();
		element.sendKeys(Senha);
		driver.hideKeyboard();
	}

	public void txtbox_ConfirmPassword(String ConfSenha) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText\r\n"
						+ ""));
		element.click();
		element.sendKeys(ConfSenha);
		driver.hideKeyboard();
//		
//		TouchAction<?> touchAction = new TouchAction(driver);
//		touchAction.press(PointOption.point(1047, 1713)).moveTo(PointOption.point(1045, 286)).perform();
	}

	public void txtbox_FirstName(String PrimeiroNome) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText\r\n"
						+ ""));
		element.click();
		element.sendKeys(PrimeiroNome);

		driver.hideKeyboard();
	}

	public void txtbox_LastName(String UltimoNome) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText\r\n"
						+ ""));
		element.click();
		element.sendKeys(UltimoNome);
		driver.hideKeyboard();
		TouchAction<?> touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(1053, 1743)).moveTo(PointOption.point(1050, 322)).perform();

	}

	public void txtbox_Phone(String Fone) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\r\n"
						+ ""));
		element.click();
		element.sendKeys(Fone);
		driver.hideKeyboard();
	}

	public void listbox_País(String pais) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutCountry"));
		element.click();
		Scroll.scrollAndClick(driver, pais);

	}

	public void txtbox_State(String Estado) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText\r\n"
						+ ""));
		element.click();
		element.sendKeys(Estado);
		driver.hideKeyboard();
	}

	public void txtbox_Address(String End) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\r\n"
						+ ""));
		element.click();
		element.sendKeys(End);
		driver.hideKeyboard();
	}

	public void txtbox_City(String Cidade) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText\r\n"
						+ ""));
		element.click();
		element.sendKeys(Cidade);
		driver.hideKeyboard();
	}

	public void txtbox_Cep(String Cep) {
		element = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText\r\n"
						+ ""));
		element.click();
		element.sendKeys(Cep);
		driver.hideKeyboard();

		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		int x = size.width / 2;

		int end_y = (int) (size.height * 0.2);
		int start_y = (int) (size.height * 0.9);

		TouchAction<?> touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(x, start_y)).waitAction((WaitOptions.waitOptions(Duration.ofMillis(500))))//
				.moveTo(PointOption.point(x, end_y))//
				.release().perform();

	}

	public void btn_Register() {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));
		element.click();

	}
}
