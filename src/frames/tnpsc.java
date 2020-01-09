package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tnpsc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayanthan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tnpsc.gov.in");
		driver.findElement(By.xpath("//a[@title='Annual Reports']")).click();
		driver.findElement(By.xpath("//a[@href=\"annualreport/ANNUAL_REPORT_2018_2019.pdf\"]")).click();
		driver.manage().window().maximize();
	}

}
