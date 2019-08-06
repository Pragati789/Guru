package tc_Guru1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day5 
{
	WebDriver driver;
	String baseurl;

@BeforeTest
public void beforeTest()
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 driver=new ChromeDriver();
	 baseurl = "http://live.guru99.com/";
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@Test
public void testday3testcase3()
{
	driver.get(baseurl);
	//click on mobile 
	driver.findElement(By.xpath("(//span[text()='Account'])[1]")).click();
	driver.findElement(By.xpath("(//a[@title='My Account'])[1]")).click();
	driver.findElement(By.xpath("//span[text()='Create an Account']")).click();
	driver.findElement(By.id("firstname")).sendKeys("pragati");
	driver.findElement(By.id("middlename")).sendKeys("nat");
	driver.findElement(By.id("lastname")).sendKeys("sham");
	driver.findElement(By.id("email_address")).sendKeys("pragati.shamkuwar@gmail.com");
	driver.findElement(By.id("password")).sendKeys("pragati12");
	driver.findElement(By.id("confirmation")).sendKeys("pragati12");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//span[text()='Register']")).click();
	String expected_title="Thank you for registering with Main Website Store.";
	String actual_title=driver.getTitle();
	assertEquals(actual_title, expected_title);
	{
		System.out.println("title verify");
	}
			driver.findElement(By.xpath("//a[text()='TV']")).click();
			driver.findElement(By.xpath("(//a[@class='link-wishlist'])[1]]")).click();
			driver.findElement(By.xpath("//span[text()='Share Wishlist']")).click();
			driver.findElement(By.name("emails")).sendKeys("pragati.shamkuwar@gmail.com, hi,,want to purchase");
			driver.findElement(By.name("message")).sendKeys("hi...hehfhuilfhlvbldv");

}

}