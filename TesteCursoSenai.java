package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteCursoSenai {
	
	private WebDriver driver;
	
	//inicio
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.quit();
	}
	
	
	//teste
	@Test
	public void TesteNavegabilidade () {
		driver.get("https://informatica.sp.senai.br/");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		//driver.findElement(By.id("Busca1_btnBusca")).click();
		driver.findElement(By.id("Busca1_btnBusca")).sendKeys(Keys.ENTER);
	}
	
	
	//finalização
	//@After
	
	
	

}
