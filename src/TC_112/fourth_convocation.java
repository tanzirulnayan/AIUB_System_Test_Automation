package TC_112;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fourth_convocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tanzirul Haque Nayan\\Desktop\\SQT FT\\AIUB_System_Test_Automotion\\lib\\geckoDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.aiub.edu/convocation");
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[1]/div[1]/div[2]/a[4]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
}