package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class LoginPage {
   WebDriver driver;
   
   By StageUName = By.name("username");
   By StagePwd = By.name("password");
   By StageloginBtn = By.name("btn btn-success");
 
   LoginPage(WebDriver driver) {
	   this.driver = driver;
   }
   
   public void setUserName(String strUserName) {
	   WebElement e=driver.findElement(StageUName);
	   e.sendKeys(strUserName);	   
   }
   
   public void setPwd(String strPwd) {
	   WebElement e = driver.findElement(StagePwd);
	   e.sendKeys(strPwd);	  
   }
   
   public void loginbtn() {
	   driver.findElement(StageloginBtn).click();	  
   }
   
   public void kurtos_loginpage(String strUserName,String strPwd) {
	   this.setUserName(strUserName);
	   this.setPwd(strPwd);
	   this.loginbtn();
	   
   }
   
}
