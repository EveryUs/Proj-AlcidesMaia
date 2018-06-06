package tasks;

import org.openqa.selenium.WebDriver;
import appobject.LoginAppObject;

public class LibraryTask {
	
	private LoginAppObject loginAppObject;
	
	 public LibraryTask (WebDriver driver) {
		
		
		this.loginAppObject = new LoginAppObject(driver);
		
	} 

	public void preencherLogin(String login, String senha) {
		
		this.loginAppObject.getLoginTextField().sendKeys(login);
		this.loginAppObject.getSenhaTextField().sendKeys(senha);
		
		
		 
		
	}
	public void enviarLogin() {
		
		this.loginAppObject.getLogarButton().click();
		
		
	}
	
public void bibliotecaButtonAvancar() {
		
		this.loginAppObject.getAvançarButton().click();
		
		
	}


	
	 
	
	
}
