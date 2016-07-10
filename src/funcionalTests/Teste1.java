package funcionalTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



//import com.sun.jna.platform.FileUtils;


import pageObjects.*;

public class Teste1 {

	protected PaginaBase paginaBase = new PaginaBase();
	protected PaginaLogin paginaLogin;
	protected PaginaInicial paginaInicial;
	protected PaginaCaso PaginaCaso;

	@Test
	public void test() throws Exception {
		fazendoLogin();
		acessaMenuReportIssue();
		confirmaEntaoParametros();
		fechaNavegador();
	}
	
	//passando valor usuario errado
	@Test
	public void test2() throws Exception {
		fazendoLogin2();
		acessaMenuReportIssue();
		confirmaEntaoParametros();
		fechaNavegador();
	}

	private void fazendoLogin() {
		this.paginaBase.navegateTo("http://mantis-prova.base2.com.br/login_page.php");
		this.paginaLogin = new PaginaLogin(this.paginaBase.getDriver());
		this.paginaInicial = paginaLogin.logar("isabella.lelis","637553");
	}
	
	private void acessaMenuReportIssue() {
		this.PaginaCaso = paginaInicial.acessaPaginaDeCasos();
	}
	
	private void confirmaEntaoParametros() throws IOException {
		this.paginaInicial = PaginaCaso.preencher("[All Projects] General", "always", "Escreve algo a mais", "Escreve mais alguma coisa");
		File scrFile = ((TakesScreenshot)this.paginaBase.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
	}
	
	private void fechaNavegador() {
		this.paginaBase.closeNavegator();
	}
	
	private void fazendoLogin2() {
		this.paginaBase.navegateTo("http://mantis-prova.base2.com.br/login_page.php");
		this.paginaLogin = new PaginaLogin(this.paginaBase.getDriver());
		this.paginaInicial = paginaLogin.logar("isabellalelis","637553");
	}
	
}
