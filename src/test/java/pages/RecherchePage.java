package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecherchePage {

	WebDriver driver;
	 By ressources = By.xpath("/html/body/app-root/app-apprenti/p-menubar/div/div[2]/span/span");
	 By recherche = By.xpath("//*[@id=\"pr_id_2\"]/div[1]/div/span/input");
     By resultrecherche = By .xpath("//*[@id=\"pr_id_2-table\"]/tbody/tr/td[2]");
	    public  RecherchePage(WebDriver driver) {
			this.driver = driver;
			}
			public void clickRessources() {
				driver.findElement(ressources).click();
		     }
			public void saisiRecherche(String motclef ) {
				driver.findElement(recherche).sendKeys(motclef );
		     }
			public void verificationRecherche() {
				driver.findElement(resultrecherche).click();
		     }
			
			
			
	    }
