package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AffichagePage {
	
WebDriver driver;
	
	By lienR = By.xpath("//*[@id=\"pr_id_18-table\"]/thead/tr/th[1]");
	By leconR =By.xpath("//*[@id=\"pr_id_18-table\"]/thead/tr/th[3]");
	By moduleR =By.xpath("//*[@id=\"pr_id_18-table\"]/thead/tr/th[4]");
	By TitreR =By.xpath("//*[@id=\"pr_id_18-table\"]/thead/tr/th[2]");
	
	 public  AffichagePage(WebDriver driver) {
			this.driver = driver;
			
			}
	
	 public void verificationAffichage() {
			
		 driver.findElement(lienR).isDisplayed();
			driver.findElement(leconR).isDisplayed();
			driver.findElement(moduleR).isDisplayed();
			driver.findElement(TitreR).isDisplayed();
	     }

}
	
	
	
	
	
	


