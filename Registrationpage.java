package com.appvwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registrationpage {
   @Test
	public void login_test() {
		
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("jadhavdi849@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("Scarlet@1234");

		driver.findElement(By.id("js-login-btn")).click();

	}

}
