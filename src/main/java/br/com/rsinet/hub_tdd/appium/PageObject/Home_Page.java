package br.com.rsinet.hub_tdd.appium.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Home_Page {

	private AndroidDriver<MobileElement> driver;
	private WebElement element;
	private WebDriverWait wait;

	public Home_Page(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 10);

	}

	public String getUserLogado() {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
		return element.getText();
	}

	public void Click_btn_Menu() throws InterruptedException {

		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		//Thread.sleep(2000);
		element.click();
	}

	public void Click_btn_Login() {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
		// wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void click_CreateConta() {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewSingUpToday"));
		// wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void click_Lupa(AndroidDriver<?> driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void Pesquisa_Produto(AndroidDriver<?> driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
