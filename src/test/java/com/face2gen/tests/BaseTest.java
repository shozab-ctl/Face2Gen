package com.face2gen.tests;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	public final static int TIMEOUT = 10;

	@BeforeEach
	public void setup() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://app.face2gene.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));

	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}
}
