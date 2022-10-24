package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		//uma variável para uma ação na internet
		WebElement menuServicos = driver.findElement(By.xpath("/html/body/app-root/app-home/header/div/nav/div/a"));
		WebElement campoEmail = driver.findElement(By.id("email"));
		
		try {
		driver.get("https://localhost:4200/");
		Thread.sleep(3000);
		menuServicos.click();
		Thread.sleep(2000);
		campoEmail.clear();
		Thread.sleep(2000);
		campoEmail.sendKeys("giovana@email.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("teste123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-container\"]/form/input[3]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	//finalização
	//@After
	public void Fim () {
		driver.quit();
	}
}

