package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaLogin extends PaginaBase {
	
	public PaginaLogin(WebDriver driver) {
		super(driver);
	}
	
	public PaginaInicial logar(String username, String password) {
		realizaLogin(username, password);
		return new PaginaInicial(getDriver());
	}
	
	private void realizaLogin(String username, String password) {
		getDriver().findElement(By.name("username")).sendKeys(username);
		getDriver().findElement(By.name("password")).sendKeys(password);
		getDriver().findElement(By.className("button")).submit();
	}
}
