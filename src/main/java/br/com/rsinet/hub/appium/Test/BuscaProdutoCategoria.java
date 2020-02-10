package br.com.rsinet.hub.appium.Test;

import static org.testng.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_tdd.appium.Manager.FileReaderManager;
import br.com.rsinet.hub_tdd.appium.Manager.PageObjectManager;
import br.com.rsinet.hub_tdd.appium.Manager.WebDriverManager;
import br.com.rsinet.hub_tdd.appium.PageObject.Produto_Page;
import br.com.rsinet.hub_tdd.appium.Util.ExcelUtils;
import br.com.rsinet.hub_tdd.appium.Util.ExtentReport;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BuscaProdutoCategoria {

	private AndroidDriver<MobileElement> driver;
    private Produto_Page produto_page;
	private PageObjectManager pageObjectManager;
	private WebDriverManager manager;
	private static ExtentReports test;
	private ExtentTest report;
	private String teste;
	
	
	@BeforeClass
	public static void test() {
		test = ExtentReport.setExtent("BuscaProdutoCategoria");
	}

	@Before
	public void entre() throws Exception {

		manager = new WebDriverManager();
		driver = manager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		produto_page = pageObjectManager.getProduto_Page();
		ExcelUtils.setExcelFile(FileReaderManager.getInstance().getConfigReader().getPathExcel(), "BuscaProduto");

	}

	@Test

	public void CategoriaSucesso() throws Exception {
		
		report = ExtentReport.createTest("CategoriaSucesso");

		produto_page.ProdutoCategoria(ExcelUtils.getCellData(1, 1));
		produto_page.Tempo();
		produto_page.Fone(ExcelUtils.getCellData(1, 2));
		
		ExtentReport.statusReported(report, driver, teste);
		teste = "CategoriaSucesso";
		
		assertTrue(driver.getPageSource().contains(ExcelUtils.getCellData(1, 2).toUpperCase()));
	}

	@Test
	public void ErroProdutoComValorBaixo() throws Exception {
		
		report = ExtentReport.createTest("ErroProdutoComValorBaixo");
		
		produto_page.ProdutoCategoria(ExcelUtils.getCellData(1, 1));
		produto_page.Tempo();
		produto_page.clicandoNoFiltro();
		produto_page.clicandoNoPreco();
		produto_page.espera1();
		produto_page.clicandoParaDiminuirPreco(1028, 487, 49, 487);
		produto_page.clicandoEmAplicarFiltro();
		
		ExtentReport.statusReported(report, driver, teste);
		teste = "ErroProdutoComValorBaixo";

		assertTrue(driver.getPageSource().contains("- No results -"));
	}

	@After
	public void finaliza_teste() {

		ExtentReport.quitExtent(test);
		WebDriverManager.closeDriver(driver);
	}
}
