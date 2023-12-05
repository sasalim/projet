package stepsdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.AffichagePage;


public class AffichageSteps {

	WebDriver driver = Hooks.driver ;
	AffichagePage Ajout ;
	
	
	@Then("la liste des ressources est affiché")
	public void la_liste_des_ressources_est_affiché() {
	    
	}

}
