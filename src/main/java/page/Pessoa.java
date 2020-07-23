package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Pessoa {
	private WebDriver driver;
	
	private By nomeCompleto = By.cssSelector("h3:nth-child(1)");
	private By fone = By.cssSelector(".dl-horizontal:nth-child(5) > dd");

	
    public Pessoa(WebDriver driver)
	{
		this.driver = driver;
	}
    
    public String nome() {
    	String[] fnome = driver.findElement(nomeCompleto).getText().split(" ");
    	return fnome[0];
    }
    
    public String sobrenome() {
    	String[] snome = driver.findElement(nomeCompleto).getText().split(" ");
    	return snome[snome.length -1];
    }
    
    public String telefone() {
    	String phone = driver.findElement(fone).getText();
    	return phone;
    }

}
