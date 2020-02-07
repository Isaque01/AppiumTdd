package br.com.rsinet.hub.appium.Test;





import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.rsinet.hub_tdd.appium.Manager.FileReaderManager;
import br.com.rsinet.hub_tdd.appium.Manager.PageObjectManager;
import br.com.rsinet.hub_tdd.appium.Manager.WebDriverManager;
import br.com.rsinet.hub_tdd.appium.PageObject.Cadastro_Page;
import br.com.rsinet.hub_tdd.appium.PageObject.Home_Page;
import br.com.rsinet.hub_tdd.appium.Util.ExcelUtils;
import br.com.rsinet.hub_tdd.appium.Util.Generator;
import br.com.rsinet.hub_tdd.appium.Util.Screenshot;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Cadastro {

	private AndroidDriver<MobileElement> driver;
	private TouchAction<?> action;
	private Home_Page home_page;
	private Cadastro_Page cadastro_page;
	
	private PageObjectManager pageObjectManager;
	private WebDriverManager manager;
	
	@Before
	public void entre() throws Exception{
		
		manager = new WebDriverManager();
		driver = manager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		home_page = pageObjectManager.getHome_Page();
		cadastro_page = pageObjectManager.getCadastro_Page();
	}
	
	@Test
	public void Cadastro_Possitivo() throws Exception {

		ExcelUtils.setExcelFile(FileReaderManager.getInstance().getConfigReader().getPathExcel(), "Planilha1");

		home_page.Click_btn_Menu();
		home_page.Click_btn_Login();
		home_page.click_CreateConta();
		
		cadastro_page.txtbox_UserName(ExcelUtils.getCellData(1, 0));
		cadastro_page.txtbox_Email(ExcelUtils.getCellData(1, 1));
	    cadastro_page.txtbox_Password(ExcelUtils.getCellData(1, 2));
	    cadastro_page.txtbox_ConfirmPassword(ExcelUtils.getCellData(1, 3));
	    cadastro_page.txtbox_FirstName(ExcelUtils.getCellData(1, 4));
        cadastro_page.txtbox_LastName(ExcelUtils.getCellData(1, 5));
	    cadastro_page.txtbox_Phone(ExcelUtils.getCellData(1, 6));
		cadastro_page.listbox_Pa�s(ExcelUtils.getCellData(1, 7));
        cadastro_page.txtbox_City(ExcelUtils.getCellData(1, 8));
	    cadastro_page.txtbox_Address(ExcelUtils.getCellData(1, 9));
		cadastro_page.txtbox_State(ExcelUtils.getCellData(1, 10));
		cadastro_page.txtbox_Cep(ExcelUtils.getCellData(1, 11));
		
		cadastro_page.btn_Register();
		home_page.Click_btn_Menu();
      
	}
	@Test
	public void Cadastro_Negativo() throws Exception {

		ExcelUtils.setExcelFile(FileReaderManager.getInstance().getConfigReader().getPathExcel(), "Planilha1");

		home_page.Click_btn_Menu();
		home_page.Click_btn_Login();
		home_page.click_CreateConta();
		
	
		cadastro_page.txtbox_UserName(ExcelUtils.getCellData(3, 0));
		cadastro_page.txtbox_Email(ExcelUtils.getCellData(3, 1));
	    cadastro_page.txtbox_Password(ExcelUtils.getCellData(3, 2));
	    cadastro_page.txtbox_ConfirmPassword(ExcelUtils.getCellData(3, 3));
	    cadastro_page.txtbox_FirstName(ExcelUtils.getCellData(3, 4));
        cadastro_page.txtbox_LastName(ExcelUtils.getCellData(3, 5));
	    cadastro_page.txtbox_Phone(ExcelUtils.getCellData(3, 6));
	    cadastro_page.listbox_Pa�s(ExcelUtils.getCellData(3, 7));
        cadastro_page.txtbox_City(ExcelUtils.getCellData(3, 8));
	    cadastro_page.txtbox_Address(ExcelUtils.getCellData(3, 9));
		cadastro_page.txtbox_State(ExcelUtils.getCellData(3, 10));
		cadastro_page.txtbox_Cep(ExcelUtils.getCellData(3, 11));
		
		cadastro_page.btn_Register();
		home_page.Click_btn_Menu();
		
	   
	
      
	}
	
	 @After
	 public void finaliza_teste() throws Exception{

		 Screenshot.printTela(driver, Generator.dataHorParaArquvio());
		 driver.quit();
}
}