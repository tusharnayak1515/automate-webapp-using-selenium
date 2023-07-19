package com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\tusha\\OneDrive\\Desktop\\java-fsd\\Phase-5\\Cycle-1\\Practice Project(code)\\register.html");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Tushar Ranjan Nayak");
		File sourceFile1 = driver.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./Screenshots/ss1.jpg");
		FileUtils.copyFile(sourceFile1, destFile1);
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("tushar@gmail.com");
		File sourceFile2 = driver.getScreenshotAs(OutputType.FILE);
		File destFile2 = new File("./Screenshots/ss2.jpg");
		FileUtils.copyFile(sourceFile2, destFile2);
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.cssSelector("input[type=password]"));
		password.sendKeys("Test123@");
		File sourceFile3 = driver.getScreenshotAs(OutputType.FILE);
		File destFile3 = new File("./Screenshots/ss3.jpg");
		FileUtils.copyFile(sourceFile3, destFile3);
		Thread.sleep(2000);
		WebElement submitBtn = driver.findElement(By.tagName("button"));
		submitBtn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		File sourceFile4 = driver.getScreenshotAs(OutputType.FILE);
		File destFile4 = new File("./Screenshots/ss4.jpg");
		FileUtils.copyFile(sourceFile4, destFile4);
		Thread.sleep(2000);
		driver.quit();
	}

}
