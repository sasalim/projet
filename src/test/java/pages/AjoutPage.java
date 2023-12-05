package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class AjoutPage {

	WebDriver driver;
	By curcus = By.xpath ("/html/body/app-root/app-admin/p-menubar/div/p-menubarsub/ul/li[2]/a/span[1]");
	By edite  = By.xpath("//tbody/tr[1]/td[6]/em[1]");
	By edite1 = By.xpath("//*[@id=\"pr_id_12-table\"]/tbody/tr/td[4]/em");
	By fleche = By.xpath("//*[@id=\"pr_id_8-table\"]/tbody/tr/td[1]/button/span");
	By activite = By.xpath("//*[@id=\"p-tabpanel-2-label\"]/span[1]");
	By ajouter = By.xpath("//p-tabpanel[@header='Activités']//button[@label='Ajouter']/span[2]");
			//("//*[@id=\"p-tabpanel-2\"]/div/button[1]/span[1]");
	By titre_t = By.xpath("//input[@id='title']");
	By contenu_t =By.xpath("//span[contains(text(),'Proposer le contenu de')]/parent::div/div");
	By ajouter2 =By.xpath("/html/body/app-root/app-admin/app-lesson-admin/p-dialog[1]/div/div/div[4]/button[2]/span[2]");
	By text_mess = By.xpath("/p-toastitem/div/div/button/span");
	By activite_ajoute=By.xpath("//*[@id=\"p-accordiontab-0\"]/span[3]");
			
			public  AjoutPage(WebDriver driver) {
			this.driver = driver;
		}
	
	 public void clickCurcus() {
			driver.findElement(curcus).click();
			
        }
	 
	 public void clickEdite() {
			driver.findElement(edite).click();
     }
	 public void clickfleche() {
			driver.findElement(fleche).click();
     }
	 

	 public void clickEdite1() {
			driver.findElement(edite1).click();
     }
	 public void clickActivite() {
			driver.findElement(activite).click();
     }
	  
	 public void clickAjouter() {
	
			driver.findElement(ajouter).click();
     }
	 public void saisiTitre(String titre , String contenu) {
		   
			driver.findElement(titre_t).sendKeys(titre);
			driver.findElement(contenu_t).sendKeys(contenu);
     }
	 public void clickAjouter2() {
			driver.findElement(ajouter2).click();
			
     } 
	 public void verificationAjoutAct() {
			driver.findElement(activite_ajoute).isDisplayed();
			
  } 
}
