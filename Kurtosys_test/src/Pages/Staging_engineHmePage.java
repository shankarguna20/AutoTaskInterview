package Pages;
import java.util.List;

import org.openqa.selenium.*;

public class Staging_engineHmePage {
  WebDriver Driver;
  
  By FileDataExtraction = By.className("k-link k-header k-state-selected k-state-focused");
  By FDESubmenu = By.xpath("//*[@id=\"menu_pb_active\"]/ul");
  
  Staging_engineHmePage(WebDriver driver){
	  this.Driver = driver;
  }
  
		  List<WebElement> a = Driver.findElements(FDESubmenu);
		  
				  
		  
  
  
}
