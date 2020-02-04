package br.com.rsinet.hub_tdd.appium.PageObject;

import org.openqa.selenium.support.ui.Select;

import br.com.rsinet.hub_tdd.appium.Util.Scroll;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MobileSelector;
import io.appium.java_client.android.AndroidDriver;

public class Cadastro_Page {

	
	public static MobileElement txtbox_UserName(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText\r\n" + 
				"");
	}
	
	public static MobileElement txtbox_Email(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText\r\n" + 
				"");
	}
	
	public static MobileElement txtbox_Password(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText\r\n" + 
				"");
	}
	
	public static MobileElement txtbox_ConfirmPassword(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText\r\n" + 
				"");
	}
	
	public static MobileElement txtbox_FirstName(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText\r\n" + 
				"");
	}
	public static MobileElement txtbox_LastName(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText\r\n" + 
				"");
	}
	public static MobileElement txtbox_Phone(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\r\n" + 
				"");
	}
	
	public static void listbox_País(AndroidDriver<?> driver, String pais) {
		driver.findElementById("com.Advantage.aShopping:id/textViewCountries").click();
		Scroll.scrollAndClick(driver, pais);
		
	}
	
	
	public static MobileElement txtbox_State(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText\r\n" + 
				"");
	}
	
	public static MobileElement txtbox_Address(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\r\n" + 
				"");
	}
	
	public static MobileElement txtbox_City(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText\r\n" + 
				"");
	}
	
	public static MobileElement txtbox_Cep(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText\r\n" + 
				"");
	}
}
