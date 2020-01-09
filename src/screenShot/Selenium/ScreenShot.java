package screenShot.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayanthan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement d = driver.findElement(By.xpath("//a[text()=' Privacy Policy']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", d);
		WebElement u = driver.findElement(By.xpath("//img[@alt='Greens Technologys - Leaders in IT training and Placement']"));
        js.executeScript("arguments[0].scrollIntoView(false)", u);
       WebElement c = driver.findElement(By.xpath("//a[@href='courses.html']"));
        Actions acc=new Actions(driver);
        acc.moveToElement(c).perform();
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);     
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        

	}

}
