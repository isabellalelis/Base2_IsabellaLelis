package funcionalTests;

import java.io.IOException;

import org.junit.Test;

import pageObjects.PaginaBase;
import pageObjects.PaginaCasoDetalhe;
import pageObjects.PaginaInicial;
import pageObjects.PaginaLogin;

public class Teste2 {

	protected PaginaBase paginaBase = new PaginaBase();
	protected PaginaLogin paginaLogin;
	protected PaginaInicial paginaInicial;
	protected PaginaCasoDetalhe paginaCasoDetalhe;
	
	@Test
	public void test() throws IOException {
		fazendoLogin();
		acessaCaso();
		mudaStatus();
		fechaNavegador();
	}
	
	private void fazendoLogin() {
		this.paginaBase.navegateTo("http://mantis-prova.base2.com.br/login_page.php");
		this.paginaLogin = new PaginaLogin(this.paginaBase.getDriver());
		this.paginaInicial = paginaLogin.logar("isabella.lelis","637553");
	}
	
	private void acessaCaso() {
		this.paginaCasoDetalhe = paginaInicial.acessaPaginaCasoDetalhe("0000037");
	}
	
	private void mudaStatus() throws IOException {
		this.paginaInicial = paginaCasoDetalhe.editar("resolved");
	}
	
	private void fechaNavegador() {
		this.paginaBase.closeNavegator();
	}

}
