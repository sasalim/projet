package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginationPage {
WebDriver driver;
    By ressources = By.xpath("/html/body/app-root/app-apprenti/p-menubar/div/div[2]/span/span");
	By Btn_pageS = By.xpath("//body/app-root[1]/app-apprenti[1]/app-ressource[1]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span[2]/button[3]");
	By Btn_pageP =By.xpath("//body/app-root[1]/app-apprenti[1]/app-ressource[1]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span[2]/button[2]");
	By page2 =By.xpath("//body/app-root[1]/app-apprenti[1]/app-ressource[1]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span[2]/button[2]");
	By page3 =By.xpath("//body/app-root[1]/app-apprenti[1]/app-ressource[1]/div[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span[2]/button[3]");
	
	 public  PaginationPage(WebDriver driver) {
			this.driver = driver;
			}
	 public void clickPageSuivante() {
			driver.findElement(Btn_pageS).click();
			
     }
	
	 public void clickPagePrecedente() {
			driver.findElement(Btn_pageP).click();
			
	 }
	 
	 public void verificationPageSuivante() {
			driver.findElement(page3).isDisplayed();
			
  }
	 public void verificationPagePrecedente() {
			driver.findElement(page2).isDisplayed();
			
  }
	 public void clickRessources() {
			driver.findElement(ressources).click();
	     }
	 
	

}
