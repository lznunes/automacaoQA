package base;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.Pessoa;
import page.GoogleInstance;

public class BaseTeste {
	private static WebDriver driver;
	protected Pessoa pessoa;
	protected GoogleInstance contaGoogle;

	@Before
	public void Inicializar()
	{
		System.setProperty("webdriver.chrome.driver","C:WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	public void carregaPessoa()
	{
		driver.get("https://www.fakenamegenerator.com/advanced.php?t=country&n%5B%5D=br&c%5B%5D=br&gen=50&age-min=21&age-max=93");
	    pessoa = new Pessoa(driver);
	}
	
	public void CriaContaGoogle(String nome, String sobrenome, String telefone) throws InterruptedException
	{
	
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount%3Fnc%3D1&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		contaGoogle = new GoogleInstance(driver, nome, sobrenome, telefone);
	    
	}
	
	@After
	public void finalizar() 
	{
		driver.quit();
		
	}

}
