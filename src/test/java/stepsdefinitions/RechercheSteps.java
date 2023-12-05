package stepsdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.RecherchePage;

public class RechercheSteps {

	WebDriver driver = Hooks.driver ;
	RecherchePage Recherche ;
	

	@When("l'apprenti clique sur mes ressources")
	public void l_apprenti_clique_sur_mes_ressources() {
		Recherche = new RecherchePage(driver);
		Recherche.clickRessources();
	    
	}

	@When("l'apprenti saisit outils de test")
	public void l_apprenti_saisit_outils_de_test() {
		 Recherche.saisiRecherche("outils de test" );
	    
	}

	@Then("le résultat de la recherche est affiché")
	public void le_résultat_de_la_recherche_est_affiché() {
		Recherche.verificationRecherche();
	}



}
