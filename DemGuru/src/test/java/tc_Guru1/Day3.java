package tc_Guru1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 
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
		driver.findElement(By.xpath("//li[@class='level0 nav-1 first']")).click();
		driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]")).click();
	driver.findElement(By.xpath("//input[@class='input-text qty']")).clear();
		driver.findElement(By.xpath("//input[@class='input-text qty']")).sendKeys("1000");
		driver.findElement(By.xpath("//span[text()='Update']")).click();
		String Actual_message=driver.findElement(By.xpath("//p[@class='item-msg error']")).getText();
		String Error_Message="* The maximum quantity allowed for purchase is 500.";
		try{
		assertEquals(Actual_message, Error_Message);
		}
		catch (Exception e) {
			e.printStackTrace();
	
		}
		driver.findElement(By.xpath("//span[text()='Empty Cart']")).click();
		String Actual_Shopping_cart_msg=driver.findElement(By.xpath("//div[@class='page-title']")).getText();
		String Epected_Shopping_cart_msg="SHOPPING CART IS EMPTY";
		try{
			assertEquals(Actual_Shopping_cart_msg, Epected_Shopping_cart_msg);
			}
			catch (Exception e) {
				e.printStackTrace();
		
			}
		
		
		
}
}