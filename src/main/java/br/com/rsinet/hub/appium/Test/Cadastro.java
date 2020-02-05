package br.com.rsinet.hub.appium.Test;

import org.junit.Before;
import org.junit.Test;

import br.com.rsinet.hub_tdd.appium.Manager.PageObjectManager;
import br.com.rsinet.hub_tdd.appium.PageObject.Cadastro_Page;
import br.com.rsinet.hub_tdd.appium.PageObject.DriverFactory;
import br.com.rsinet.hub_tdd.appium.PageObject.Home_Page;
import br.com.rsinet.hub_tdd.appium.Util.Constant;
import br.com.rsinet.hub_tdd.appium.Util.ExcelUtils;
import br.com.rsinet.hub_tdd.appium.Util.Scroll;
import dataProvider.ConfigFileReader;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Cadastro {

	private static AndroidDriver<MobileElement> driver;
	private TouchAction<?> action;
	private Home_Page home_page;
	private Cadastro_Page cadastro_page;
	private ConfigFileReader configFileReader;
	private PageObjectManager pageObjectManager;
	
	
//	@Before
//	public void entre() throws Exception{
//		PageObjectManager pageObject = new PageObjectManager(driver);
//		home_page = pageObject.getHome_Page();
//	}
	
	
	

	@Test
	public void Cadastro_Possitivo() throws Exception {

		driver = DriverFactory.CreateDriver();

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");

		home_page = new Home_Page(driver);
	    home_page.Click_btn_Menu();
		home_page.Click_btn_Login();
		home_page.click_CreateConta();
		
		cadastro_page = new Cadastro_Page(driver);
		
		cadastro_page.txtbox_UserName(ExcelUtils.getCellData(1, 0));
		cadastro_page.txtbox_Email(ExcelUtils.getCellData(1, 1));
	    cadastro_page.txtbox_Password(ExcelUtils.getCellData(1, 2));
	    cadastro_page.txtbox_ConfirmPassword(ExcelUtils.getCellData(1, 3));
	    cadastro_page.txtbox_FirstName(ExcelUtils.getCellData(1, 4));
        cadastro_page.txtbox_LastName(ExcelUtils.getCellData(1, 5));
	    cadastro_page.txtbox_Phone(ExcelUtils.getCellData(1, 6));
		cadastro_page.listbox_País(ExcelUtils.getCellData(1, 7));
        cadastro_page.txtbox_City(ExcelUtils.getCellData(1, 8));
	    cadastro_page.txtbox_Address(ExcelUtils.getCellData(1, 9));
		cadastro_page.txtbox_State(ExcelUtils.getCellData(1, 10));
		cadastro_page.txtbox_Cep(ExcelUtils.getCellData(1, 11));
		
		cadastro_page.btn_Register();
		home_page.Click_btn_Menu();
      
	}

	
}