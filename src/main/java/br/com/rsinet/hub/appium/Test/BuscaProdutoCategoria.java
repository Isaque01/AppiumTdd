package br.com.rsinet.hub.appium.Test;

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
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class BuscaProdutoCategoria {

	private AndroidDriver<MobileElement> driver;
	private TouchAction<?> action;
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

	//@Test

	public void CategoriaSucesso() throws Exception {

		ExcelUtils.setExcelFile(FileReaderManager.getInstance().getConfigReader().getPathExcel(), "BuscaProduto");

		produto_page.ProdutoCategoriaSucesso(ExcelUtils.getCellData(1, 1));
		produto_page.Tempo();
		produto_page.Fone(ExcelUtils.getCellData(1, 2));
	}
	@Test

	public void CategoriaErro() throws Exception {

		ExcelUtils.setExcelFile(FileReaderManager.getInstance().getConfigReader().getPathExcel(), "BuscaProduto");

		produto_page.ProdutoCategoriaErro(ExcelUtils.getCellData(6, 0));
		produto_page.espera1();
		produto_page.ProdutoCategoriaErro(ExcelUtils.getCellData(6, 1));

	}

	@After
	public void finaliza_teste() throws Exception {

		Screenshot.printTela(driver, Generator.dataHorParaArquvio());
		driver.quit();
	}
}
