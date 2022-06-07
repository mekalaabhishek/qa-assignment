import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_username {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		//identifies the username and sends the data
WebElement username = driver.findElement(By.id("login_field"));
username.sendKeys("mercinemas7@gmail.com");
//identifies the password and send the data
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("Abhishek@mercinemas");
//identifies the loginbutton and click
WebElement loginButton = driver.findElement(By.xpath("//input[@name='commit']"));
loginButton.click();
WebElement signed = driver.findElement(By.xpath("//img[@class='avatar avatar-small circle']"));
signed.click();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement  sn = driver.findElement(By.xpath("//strong[contains(text(),'mekalaabhishek')]"));
sn.getText();
System.out.println(sn.getText());
if (driver.getPageSource().contains("mekalaabhishek"))
	System.out.println("Right username is displayed on the text 'Signed in as username'");

else

	System.out.println("Wrong username is displayed on the text 'Signed in as username'");

WebElement signout = driver.findElement(By.xpath("//button[@class='dropdown-item dropdown-signout']"));
signout.click();
	}
	}
