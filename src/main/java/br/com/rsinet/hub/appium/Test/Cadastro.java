package br.com.rsinet.hub.appium.Test;

import org.junit.Test;

import br.com.rsinet.hub_tdd.appium.PageObject.Cadastro_Page;
import br.com.rsinet.hub_tdd.appium.PageObject.DriverFactory;
import br.com.rsinet.hub_tdd.appium.PageObject.Home_Page;
import br.com.rsinet.hub_tdd.appium.Util.Constant;
import br.com.rsinet.hub_tdd.appium.Util.ExcelUtils;
import br.com.rsinet.hub_tdd.appium.Util.Scroll;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Cadastro {

	private static AndroidDriver<MobileElement> driver;
	private TouchAction<?> action;

	@Test
	public void Cadastro_Possitivo() throws Exception {

		driver = DriverFactory.CreateDriver();

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");

		Home_Page.btn_Menu(driver).click();
		Home_Page.btn_Login(driver).click();
		Home_Page.click_CreateConta(driver).click();
		Cadastro_Page.txtbox_UserName(driver).sendKeys(ExcelUtils.getCellData(1, 0));
		Cadastro_Page.txtbox_Email(driver).sendKeys(ExcelUtils.getCellData(1, 1));
		Cadastro_Page.txtbox_Password(driver).sendKeys(ExcelUtils.getCellData(1, 2));
		Cadastro_Page.txtbox_ConfirmPassword(driver).sendKeys(ExcelUtils.getCellData(1, 3));
        Cadastro_Page.txtbox_FirstName(driver).sendKeys(ExcelUtils.getCellData(1, 4));
		Cadastro_Page.txtbox_LastName(driver).sendKeys(ExcelUtils.getCellData(1, 5));
		Cadastro_Page.txtbox_Phone(driver).sendKeys(ExcelUtils.getCellData(1, 6));
		Scroll.scrollAndClick(driver);
		Scroll.swipe(603, 1479, 599, 292, driver);
		Cadastro_Page.listbox_País(driver, ExcelUtils.getCellData(1, 7));
		Cadastro_Page.txtbox_City(driver).sendKeys(ExcelUtils.getCellData(1, 8));
		Cadastro_Page.txtbox_Address(driver).sendKeys(ExcelUtils.getCellData(1, 9));
		Cadastro_Page.txtbox_State(driver).sendKeys(ExcelUtils.getCellData(1, 10));
		Cadastro_Page.txtbox_Cep(driver).sendKeys(ExcelUtils.getCellData(1, 11));

	}
}