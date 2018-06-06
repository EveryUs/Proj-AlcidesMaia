package testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.LibraryTask;


public class LibralyTestCase {
	
	private WebDriver driver;
	private LibraryTask login;
	
	@Before
	
	public void setUp() {
		WebDriverManager.edgedriver().setup();
		this.driver = new EdgeDriver();
		
		
		this.driver.get("http://educa.alcidesmaya.com.br/Corpore.Net/Main.aspx?ActionID=BibConsultaInternaActionWeb&SelectedMenuIDKey=ItemPesquisarReservar");
		this.driver.manage().window().maximize();
		this.login = new LibraryTask(driver);
		
		
		
	 
	}
	  
	@Test
	public void testMain() throws InterruptedException, IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\tmp2\\screenshot.png"));
		this.login.preencherLogin("045813.2-15", "senha2016");
		this.login.enviarLogin();
		
		//ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		//driver.switchTo().window(tabs.get(0));
		
		Thread.sleep(4000); 
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile1, new File("c:\\tmp2\\screenshot2.png"));
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
			  driver.switchTo().window(winHandle);
			}
		
		 Thread.sleep(2000); 
		 File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile2, new File("c:\\tmp2\\screenshot3.png"));
			this.login.bibliotecaButtonAvancar();
			
			Thread.sleep(2000);
			File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("c:\\tmp2\\screenshot4.png"));
			
			driver.close();
			
			driver.switchTo().window(winHandleBefore);
			Thread.sleep(2000);
			File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("c:\\tmp2\\screenshot5.png"));
			
			
		} 
		
	 
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
    this.driver.quit();	

		
	}

} 
