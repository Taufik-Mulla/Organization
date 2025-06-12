package com.accedmy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.className("btn_primary")).click();
		//driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg/path")).click();
		//driver.findElement(By.className("btn_action")).click();
		//driver.findElement(By.id("first-name")).sendKeys("Swapnil");
		//driver.findElement(By.id("last-name")).sendKeys("Patil");
		//driver.findElement(By.id("postal-code")).sendKeys("123456");
		
		Thread.sleep(3000);
		
		
		
		driver.quit();
		
	}

}