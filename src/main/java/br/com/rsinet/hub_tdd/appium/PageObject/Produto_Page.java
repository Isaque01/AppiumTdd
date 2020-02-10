package br.com.rsinet.hub_tdd.appium.PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.appium.Util.AcoesTouchActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Produto_Page {

	private AndroidDriver<MobileElement> driver;
	private WebDriverWait wait;
	private WebElement element;
	private AcoesTouchActions acoes;

	public Produto_Page(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		acoes = new AcoesTouchActions(this.driver);
	}

	public void ClicarLupa() throws InterruptedException {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
		element.click();
	}

	public void EntreComProduto(String Texto) throws InterruptedException {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));
		element.sendKeys(Texto);
		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
		element.click();

	}

	public void EscolherProduto(String Produto) throws InterruptedException {
		element = driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[4]/android.widget.TextView[1]"));
		element.click();
	}

	public void EntreProdutoErro(String Texto) throws InterruptedException {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));
		element.sendKeys(Texto);
		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));
		element.click();

	}

	// Pesquisa Produto Por Categoria Sucesso
	
	public void ProdutoCategoria(String Texto) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ Texto + "\").instance(0))")
				.click();
	}

	
	public void Fone(String Texto) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ Texto + "\").instance(0))")
		.click();
		
		
	}
	
	//Produto Categoria Erro
	
	public void ProdutoCategoriaErro(String Texto) throws Exception {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ Texto + "\").instance(0))")
				.click();
	}
	

	public void clicandoNoFiltro() throws InterruptedException {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewFilter"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	public void clicandoNoPreco() {
		wait.pollingEvery(Duration.ofSeconds(10));
		element = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	public void clicandoParaDiminuirPreco(int xPress, int yPress, int xMove, int yMove) {
		acoes.scroll(xPress, yPress, xMove, yMove);
	}
	public void clicandoEmAplicarFiltro() {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewApply"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	public void Tempo() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/textViewProductPrice")));
		
       
	}

//	public void espera() {
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.ImageView")));
//	}

	public void espera1() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/textViewFilter")));
		
	}
}
