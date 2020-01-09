package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class toolsqa {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayanthan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-form/");
driver.manage().window().maximize();
WebElement drop = driver.findElement(By.id("continents"));
Select s=new Select(drop);
boolean multiple = s.isMultiple();
System.out.println(multiple);
s.selectByVisibleText("Africa");	
List<WebElement> op = s.getOptions();
int size = op.size();
System.out.println(size);
for(int i=0;i<op.size();i++) {
	WebElement t = op.get(i);
	System.out.println(t.getText());
}
	for(WebElement j:op) {
System.out.println(j.getAttribute("value"));	
}
driver.quit();

}
}
