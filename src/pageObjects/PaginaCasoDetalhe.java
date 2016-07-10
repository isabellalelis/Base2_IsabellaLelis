package pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PaginaCasoDetalhe extends PaginaBase {

	public PaginaCasoDetalhe(WebDriver driver) {
		super(driver);
	}
	
	public PaginaInicial editar(String status) throws IOException {
		editCaso(status);
		return new PaginaInicial(getDriver());
	}
	
	public void editCaso(String status) throws IOException {
	
		getDriver().findElement(By.cssSelector("input[value='Edit']")).click(); //clicar em Edit
		getDriver().findElement(By.name("status")).sendKeys(status); //mudar status Resolved
		getDriver().findElement(By.cssSelector("input[value='Update Information']")).click(); //clicar Update Information
		File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
	}
}
