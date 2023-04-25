package jenkinssam;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Broserlaunch extends BaseClass
{
@Test	
public void browsertest()
{
	WebDriver driver;
	
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
}
}
