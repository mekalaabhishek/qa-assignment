import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_New_Repository {
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
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
WebElement create= driver.findElement(By.xpath("//a[@class='btn btn-sm btn-primary']"));
create.click();
WebElement rn = driver.findElement(By.id("repository_name"));
rn.sendKeys("qa-assignment");
WebElement radio1 = driver.findElement(By.xpath("(//input[@class='mt-2 js-privacy-toggle'])[1]"));
radio1.click();
WebElement gitignoretemplate = driver.findElement(By.xpath("(//summary[@class='btn btn-sm select-menu-button'])[1]"));
gitignoretemplate.click();
WebElement node=driver.findElement(By.xpath("//label[@class='SelectMenu-item text-normal'][72]"));
node.click();
WebElement cr = driver.findElement(By.xpath("//button[@class='btn-primary btn']"));
cr.submit();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement repo= driver.findElement(By.xpath("//a[contains(text(),'qa-assignment')]"));
repo.getText();
System.out.println(repo.getText());
if (driver.getPageSource().contains("qa-assignment"))
	System.out.println("name of the repo is present");

else

	System.out.println("name of the repo is not present");
WebElement gitignoretemplatefile= driver.findElement(By.xpath("//span[@class='css-truncate css-truncate-target d-block width-fit']"));
gitignoretemplatefile.isDisplayed();
if(gitignoretemplatefile.isDisplayed())
	System.out.println(".gitfiletemplate file is displayed");
else
	System.out.println(".gitfiletemplate file is not displayed");

WebElement sdd =driver.findElement(By.xpath("//img[@class='avatar avatar-small circle']"));
sdd.click();
WebElement signout = driver.findElement(By.xpath("//button[@class='dropdown-item dropdown-signout']"));
signout.submit();

	}
	}
