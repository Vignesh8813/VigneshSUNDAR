package hexa.test.first;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class courseDetails {

public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dines\\eclipse-workspace\\hexa.test\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String CurrentUrl = driver.getCurrentUrl();
	System.out.println(CurrentUrl);
	
	WebElement txtUsername = driver.findElement(By.id("email"));
	txtUsername.sendKeys("vigneshsundar");
	
	WebElement txtPassword = driver.findElement(By.id("pass"));
	txtPassword.sendKeys("viki@123");
	
//	WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
//	btnLogin.click();
	
	WebElement textFacebook = driver.findElement(By.xpath("//h2[@class='_8eso']"));
	String data = textFacebook.getText();
	System.out.println(data);
	
//	driver.close();
	
}
}
