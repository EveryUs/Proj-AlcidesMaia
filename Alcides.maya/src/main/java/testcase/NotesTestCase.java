package testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.LibraryTask;

public class NotesTestCase {
	
	private WebDriver driver;
	
	private LibraryTask login;
	
@Before
	
	public void setUp() {
		WebDriverManager.edgedriver().setup();
		this.driver = new EdgeDriver();
		
		this.driver.get("http://educa.alcidesmaya.com.br/Corpore.Net/Main.aspx?ActionID=EduQuadroAvisoActionWeb&SelectedMenuIDKey=mnQuadroAviso");
		this.driver.manage().window().maximize();
		this.login = new LibraryTask(driver); 
		
		
	 
	}
	  
	@Test
	public void testMain() throws InterruptedException, IOException{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
		Thread.sleep(2000);
		
		this.login.preencherLogin("045813.2-15", "senha2016");
		this.login.enviarLogin();
		
		
		Thread.sleep(5000); 
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile1, new File("c:\\tmp\\screenshot2.png"));
		
		this.driver.switchTo().frame("ctl23_ctl02_xpcContexto_CIF-1");
		
		
		Thread.sleep(3000);
		
		
		this.driver.findElement(By.xpath("//*[@id=\"rdContexto\"]")).click();
		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile3, new File("c:\\tmp\\screenshot3.png"));
		 
		Thread.sleep(5000);
		File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile4, new File("c:\\tmp\\screenshot4.png"));
		
		By css = By.cssSelector("#ctl08_ctl00_tvAccordionContents_ctl00_ctl03__CaptionCell > a");
		WebElement element = driver.findElement(css);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element);
		
		Thread.sleep(5000);
		File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile5, new File("c:\\tmp\\screenshot5.png"));
		
		
		  
		 
		} 
		 
	
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);	
    this.driver.quit();	

		
	}
	
	

}
