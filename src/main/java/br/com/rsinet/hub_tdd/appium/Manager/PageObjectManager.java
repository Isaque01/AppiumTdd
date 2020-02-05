package br.com.rsinet.hub_tdd.appium.Manager;

import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_tdd.appium.PageObject.Cadastro_Page;
import br.com.rsinet.hub_tdd.appium.PageObject.Home_Page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageObjectManager {
	
	private AndroidDriver<MobileElement> driver;
	
	private Home_Page home_page;
	
	private Cadastro_Page cadastro_page;
	
	public PageObjectManager(AndroidDriver<MobileElement> driver) {
		
		this.driver = driver;
	}
	
	public Home_Page getHome_Page() {
		
		return (home_page == null) ? home_page = new Home_Page(driver) : home_page;
	}
	
	public Cadastro_Page getcadastro_page() {
		
		return (cadastro_page == null) ? cadastro_page = new Cadastro_Page(driver): cadastro_page;
	}

}
