package stepsdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AjoutPage;


public class AjoutActiviteSteps {

	WebDriver driver = Hooks.driver ;
	AjoutPage Ajout ;
	
	@When("ladministrateur clique sur cursus")
	public void ladministrateur_clique_sur_cursus() {
		Ajout = new AjoutPage(driver); 
		Ajout.clickCurcus();
	    
	}

	@When("ladministrateur clique sur editeCurcus")
	public void ladministrateur_clique_sur_editeCurcus() {
	 Ajout.clickEdite();
	}

	@When("ladministrateur clique sur listeLecon")
	public void ladministrateur_clique_sur_listeLecon() {
	    Ajout.clickfleche();
	}

	@When("ladministrateur clique sur editeLecon")
	public void ladministrateur_clique_sur_editeLecon() {
		Ajout.clickEdite1();
	    
	}

	@When("ladministrateur clique sur activite")
	public void ladministrateur_clique_sur_activite() {
		Ajout.clickActivite();
	    
	}

	@When("ladministrateur clique sur ajouter")
	public void ladministrateur_clique_sur_ajouter() {
	   Ajout.clickAjouter(); 
	}

	@When("^ladministrateur saisi  (.*) and (.*)$")
	public void ladministrateur_saisi_titre_and_contenu(String titre, String contenu) {
		Ajout.saisiTitre(titre , contenu);
	    
	}

	@When("ladministrateur clique sur ajouterActivite")
	public void ladministrateur_clique_sur_ajouterActivite() {
		Ajout.clickAjouter2();
	    
	}

	@Then("message de sucée d'ajout affiché")
	public void message_de_sucée_d_ajout_affiché() {
	
		Ajout.verificationAjoutAct();
	}
	

	@Then("message echec d'ajout affiché")
	public void message_echec_d_ajout_affiché() {
	    System.out.println("échec d'ajout d'activite");
	}
}
