package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaInicial extends PaginaBase {
	
	public PaginaInicial(WebDriver driver) {
		super(driver);
	}
	
	//acessa "Report Issue"
	public PaginaCaso acessaPaginaDeCasos() {
		getDriver().findElement(By.linkText("Report Issue")).click();
		return new PaginaCaso(getDriver());
	}
	
	//acessa página de caso listado em Unassigned
	public PaginaCasoDetalhe acessaPaginaCasoDetalhe(String id) {
		getDriver().findElement(By.linkText(id)).click();
		return new PaginaCasoDetalhe(getDriver());
	}
}
 