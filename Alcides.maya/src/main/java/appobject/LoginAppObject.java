package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {
	private WebDriver driver;

	public LoginAppObject(WebDriver driver) {
		 this.driver = driver;
	}
	
	
	
	public WebElement getLoginTextField() {
			
			 return this.driver.findElement(By.id("txtUser"));	 
		 	}
		 
	public WebElement getSenhaTextField() {
				
			return this.driver.findElement(By.id("txtPass"));
			}

	
	public WebElement getLogarButton() {
		return this.driver.findElement(By.id("btnLogin"));
		//return this.driver.findElement(By.className("bt-Login"));
		//return this.driver.findElement(By.cssSelector("#cadastrar > fieldset > div:nth-child(8) > div > input"));
		//return this.driver.findElement(By.xpath("//*[@id=\"cadastrar\"]/fieldset/div[8]/div/input"));
	}
	
	public WebElement getAvançarButton() {
		return this.driver.findElement(By.id("ctbAvancar_tbimage"));
		
		
		
	}
	
		
	}
	 
	
	
	
	
	

