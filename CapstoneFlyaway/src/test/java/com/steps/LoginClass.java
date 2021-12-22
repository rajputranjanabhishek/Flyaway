package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {
	public static WebDriver driver;

	public static void main(String[] args) {
		LoginClass fly = new LoginClass();
		// fly.Home();
		// fly.MEMBER_LOGIN();
		// fly.Login();
		// fly.Nav_Home();
		// fly.Register();
		// fly.See_Bookings();

	}

	public static void Home() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/FlyAway/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	}

	public static void MEMBER_LOGIN() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Login/Signup']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email_id")).sendKeys("user@user.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("user");
	}

	public static void Login() throws InterruptedException {
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
	}
	public static void Nav_Home() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	}
	public static void Register() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='source']")).sendKeys("B");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='destination']")).sendKeys("H");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Book Flight']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Click to complete booking']")).click();
	}
	public static void See_Bookings() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='See Your Bookings']")).click();
	}


}