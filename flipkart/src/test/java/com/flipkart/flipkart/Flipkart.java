package com.flipkart.flipkart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart 
{
	
	@Test
	public void flipkart() 

	{
       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		String title_expected="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
    	String title_actual= driver.getTitle();
    	Assert.assertEquals(title_expected,title_actual);
    	Reporter.log("title is as expected", true);
    	
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("TV");
    	driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
    	
    	List<WebElement> element=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
    	 List<WebElement> tv_price=driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
    	int Product_price;
 	
 		 String all_tv_Prices;
 	
 		HashMap<String, Integer> map_all_products = new HashMap<String, Integer>();
    	
 		
    	 for (int i=0; i<element.size(); i++) 
    	    {
    		  String tv_product = element.get(i).getText();
    	       // System.out.println(tv_product);
    
    	        
    	   
    	
    	 

    	// for (int i=1; i<tv_price.size(); i++) 
    	 //{
    	all_tv_Prices = tv_price.get(i).getText().replaceAll("[^0-9]", "");
    	Product_price=Integer.parseInt(all_tv_Prices);
    	
    
    	 //System.out.println(Product_price);
    	 
    		
    	 
    
    	 
    	
	
    	    }
    	 
		
		System.out.println(map_all_products);
    	 
		 
	//HashMap<String, Integer> map_final_products;
		//HashMap<String, Integer> map_all_products;
		
	Collection<Integer> allkeys = map_all_products.values();
		
	ArrayList<Integer> Array_all_tv_Prices1 = new ArrayList<Integer>(allkeys);
	Collections.sort(Array_all_tv_Prices1);

	
	
		int high_price = Array_all_tv_Prices1.get(Array_all_tv_Prices1.lastIndexOf(Array_all_tv_Prices1));
		int low_price = Array_all_tv_Prices1.get(0);
		Reporter.log("High Product Price is: " + high_price + " Product name is: " + Array_all_tv_Prices1);
		Reporter.log("Low Product Price is: " + low_price + " Product name is: " + map_all_products.get(low_price),true);
		
    	
	
}
}



	