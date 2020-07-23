package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GoogleInstance {
	
	private WebDriver driver;
	private By textogoogle =  By.xpath("//h1[contains(@class,'ahT6S')]//span");


    public GoogleInstance(WebDriver driver, String nome, String sobrenome, String telefone) throws InterruptedException
	{
			
    	this.driver = driver;
    	
		driver.findElement(By.id("firstName")).sendKeys(nome);
		driver.findElement(By.id("lastName")).sendKeys(sobrenome);
		driver.findElement(By.id("username")).sendKeys(sobrenome + "testeprocondut");
	    driver.findElement(By.name("Passwd")).sendKeys("@Testprocondutor2020");
	    driver.findElement(By.name("ConfirmPasswd")).sendKeys("@Testprocondutor2020");
	    driver.findElement(By.cssSelector(".RveJvd")).click();
	    Thread.sleep(10000);
		driver.findElement(By.id("phoneNumberId")).sendKeys(telefone);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	    Thread.sleep(20000);
	}
    
    public String mensagem() {
    	String saida = driver.findElement(textogoogle).getText();
    	return saida;
    }
    
    public boolean erroTelefone() {
    	return driver.getPageSource().contains("Verifique o país e o número.");
    }
    
    public boolean pedeCodigoVerificador() {
    	return driver.getPageSource().contains("G-");
    }
    
 
   
    
  
}
