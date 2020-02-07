package br.com.rsinet.hub_tdd.appium.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Produto_Page {

	
	private AndroidDriver<MobileElement> driver;
	private WebDriverWait wait;
	private WebElement element;

	public Produto_Page(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public void ClicarLupa() throws InterruptedException {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
		element.click();
	}

	public void EntreComProduto(String Texto) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));
		element.sendKeys(Texto);
	    element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
		element.click();
		
	}
	
	public void EscolherProduto(String Produto) {
		element = driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[4]/android.widget.TextView[1]"));
		element.click();
	}
	
	public void EntreProdutoErro(String Texto) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));
		element.sendKeys(Texto);
		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
	    element.click();
	}
	

}
