package tc_Guru1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
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
	String main_title=driver.findElement(By.xpath("(//a[@title='Sony Xperia'])[1]")).getText();
	driver.findElement(By.xpath("(//a[@class='link-compare'])[1]")).click();
	
	String main_title2=driver.findElement(By.xpath("(//h2[@class='product-name'])[2]")).getText();
	
	driver.findElement(By.xpath("(//a[@class='link-compare'])[2]")).click();
	driver.findElement(By.xpath("//span[text()='Compare']")).click();
	for(String anotherWindow : driver.getWindowHandles())
	{
		driver.switchTo().window(anotherWindow);
	}
	String Product_title1=driver.findElement(By.xpath("(//h2[@class='product-name'])[1]")).getText();
	String Product_title2=driver.findElement(By.xpath("(//h2[@class='product-name'])[2]")).getText();
	assertEquals(main_title, Product_title1);
	assertEquals(main_title2, Product_title2);
	driver.findElement(By.xpath("//button[@class='button']")).click();
}
}