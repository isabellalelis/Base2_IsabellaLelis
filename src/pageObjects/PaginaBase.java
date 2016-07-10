package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginaBase {
	
	WebDriver driver;
	
	public PaginaBase(WebDriver driver) {
		this.driver = driver;
	}
	
	public PaginaBase() {
		System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	
	public void navegateTo(String url) {
		driver.navigate().to(url);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void closeNavegator() {
		getDriver().close();
	}
}



















//package pacote;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class Classe  {
//  public static void main(String[] args) {
//
//  	System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
//  	WebDriver driver = new ChromeDriver();
//
////		driver.get("http://www.bombeiros.mg.gov.br/");
//		driver.get("http://mantis-prova.base2.com.br/bug_report_page.php");
////		driver.get("http://mantis-prova.base2.com.br/login_page.php");
//
//      
//		
////		WebElement escreve = driver.findElement(By.id("summary"));
////		escreve.sendKeys("Escreve algo");
//		
////		driver.findElement(By.name("username")).sendKeys("isabella.lelis");
////		driver.findElement(By.name("password")).sendKeys("637553");
////		driver.findElement(By.className("button")).submit();
//		
//		driver.findElement(By.name("summary")).sendKeys("Escreve algo");
//		
////		driver.findElement(By.name("searchword")).sendKeys("Concurso");
////		driver.findElement(By.className("button")).submit();
//		
//
//  }
//}