package demo;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Apache {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.amazon.in");
  }
  @BeforeTest
  public void beforeTest() {

		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		  driver =new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.manage().window().maximize();
	  
  }

}
