package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaCaso extends PaginaBase {

	public PaginaCaso(WebDriver driver) {
		super(driver);
	}
	
//	public String obterValorParametro(String id) {
//		return getDriver().findElement(By.id(id)).getAttribute("value");
//	}
	

	public PaginaInicial preencher(String category_id, String reproducibility, String summary, String description) {
		preencheCaso(category_id, reproducibility, summary, description);
		return new PaginaInicial(getDriver());
	}
	
	//preenche um caso de uso
	public void preencheCaso(String category_id, String reproducibility, String summary, String description) {
		getDriver().findElement(By.name("category_id")).sendKeys(category_id);
		getDriver().findElement(By.name("reproducibility")).sendKeys(reproducibility);
		getDriver().findElement(By.name("summary")).sendKeys(summary);
		getDriver().findElement(By.name("description")).sendKeys(description);
		getDriver().findElement(By.className("button")).submit();
	}
}
