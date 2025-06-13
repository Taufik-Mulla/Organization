package com.kiranacedmy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
	driver.findElement(By.xpath("//*[@id=\"item_0_img_link\"]/img")).click();
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg/path")).click();
	driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
	driver.findElement(By.className("class=\"inventory_item_img\""));
	
	}

}
