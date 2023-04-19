package org.college;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class College {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JAva\\GreensTechnology\\CollegeInformation\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		
		String st=d.getTitle();
		System.out.println(st);
	}

}

