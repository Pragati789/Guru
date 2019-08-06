package tc_Guru1;


import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grur99 
{
	WebDriver driver;
	String baseurl;

	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		 baseurl = "http://live.guru99.com/";
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
  public void verifytitle() throws IOException 
  {
	  driver.get(baseurl);
	  //verify title
	  WebElement site=driver.findElement(By.tagName("h2"));
	  site.getText();
	  System.out.println(site);
	
	//click on meneu
	WebElement ele=driver.findElement(By.linkText("Mobile"));
	ele.click();
	new Select (driver.findElement(By.xpath("//select[@title='Sort By'][1]"))).selectByVisibleText("Name");
	
	
	//verification all ptoduct sorted
	File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String png=("DemGuru//src//test//java//Util//day"+".png");
	FileUtils.copyFile(scr, new File(png));
	
	
  }
}
