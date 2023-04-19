package org.college;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JAva\\GreensTechnology\\CollegeInformation\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.redbus.com/");
		WebElement findElement = d.findElement(By.id("src"));
			findElement.sendKeys("Villupuram");
		WebElement findElement2 = d.findElement(By.id("dest"));
			findElement2.sendKeys("Chennai");
	}

}

