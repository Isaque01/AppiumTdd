package br.com.rsinet.hub.appium.Test;

import static org.testng.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.rsinet.hub_tdd.appium.Manager.FileReaderManager;
import br.com.rsinet.hub_tdd.appium.Manager.PageObjectManager;
import br.com.rsinet.hub_tdd.appium.Manager.WebDriverManager;
import br.com.rsinet.hub_tdd.appium.PageObject.Produto_Page;
import br.com.rsinet.hub_tdd.appium.Util.ExcelUtils;
import br.com.rsinet.hub_tdd.appium.Util.Generator;
import br.com.rsinet.hub_tdd.appium.Util.Screenshot;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BuscaProdutoLupa {
	private AndroidDriver<MobileElement> driver;
	
	private Produto_Page produto_page;
	private PageObjectManager pageObjectManager;
	private WebDriverManager manager;

	@Before
	public void entre() throws Exception {

		manager = new WebDriverManager();
		driver = manager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		produto_page = pageObjectManager.getProduto_Page();
	}

	@Test
	public void BuscaProdutoSucesso() throws Exception {

		ExcelUtils.setExcelFile(FileReaderManager.getInstance().getConfigReader().getPathExcel(), "BuscaProduto");

		produto_page.EntreComProduto(ExcelUtils.getCellData(1, 0));

		//produto_page.espera();
		produto_page.EscolherProduto(ExcelUtils.getCellData(2, 0));
		
		assertTrue(driver.getPageSource().contains(ExcelUtils.getCellData(1, 0).toUpperCase()));

	}

	@Test

	public void BuscaProdutoErro() throws Exception {

		ExcelUtils.setExcelFile(FileReaderManager.getInstance().getConfigReader().getPathExcel(), "BuscaProduto");

		produto_page.EntreProdutoErro(ExcelUtils.getCellData(4, 0));
		//produto_page.espera();
		
		assertTrue(driver.getPageSource().contains("- No results for \""+ ExcelUtils.getCellData(4, 0)+"\" -"));
	}


	@After
	public void finaliza_teste() throws Exception {

		Screenshot.printTela(driver, Generator.dataHorParaArquvio());
		driver.quit();
	}

}
