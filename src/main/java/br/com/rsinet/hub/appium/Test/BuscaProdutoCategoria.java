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

public class BuscaProdutoCategoria {

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

	public void CategoriaSucesso() throws Exception {

		ExcelUtils.setExcelFile(FileReaderManager.getInstance().getConfigReader().getPathExcel(), "BuscaProduto");

		produto_page.ProdutoCategoria(ExcelUtils.getCellData(1, 1));
		produto_page.Tempo();
		produto_page.Fone(ExcelUtils.getCellData(1, 2));
		
		assertTrue(driver.getPageSource().contains(ExcelUtils.getCellData(1, 2).toUpperCase()));
	}

	@Test
	public void ErroProdutoComValorBaixo() throws Exception {
		
		ExcelUtils.setExcelFile(FileReaderManager.getInstance().getConfigReader().getPathExcel(), "BuscaProduto");

		produto_page.ProdutoCategoria(ExcelUtils.getCellData(1, 1));
		produto_page.Tempo();
		produto_page.clicandoNoFiltro();
		produto_page.clicandoNoPreco();
		produto_page.espera1();
		produto_page.clicandoParaDiminuirPreco(1028, 487, 49, 487);
		produto_page.clicandoEmAplicarFiltro();

		assertTrue(driver.getPageSource().contains("- No results -"));
	}

	@After
	public void finaliza_teste() throws Exception {

		Screenshot.printTela(driver, Generator.dataHorParaArquvio());
		driver.quit();
	}
}
