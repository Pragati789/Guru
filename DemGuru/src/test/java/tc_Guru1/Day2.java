package tc_Guru1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 
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
	public void testday2testcase2()
	{
		driver.get(baseurl);
		//click on mobile 
		driver.findElement(By.xpath("//li[@class='level0 nav-1 first']")).click();
		
		String Price_sony_Xperia=driver.findElement(By.id("product-price-1")).getText();
		driver.findElement(By.id("product-collection-image-1")).click();
		String Sony_detailPage_price=driver.findElement(By.xpath("//div[@class='price-box']")).getText();
	if(Price_sony_Xperia.equals(Sony_detailPage_price))
	{
		System.out.println("price match");
	}
		
	else
	{
		System.out.println("price not match");
	}
		
		
}}
