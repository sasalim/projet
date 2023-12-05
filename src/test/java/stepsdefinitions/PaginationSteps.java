package stepsdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AjoutPage;
import pages.PaginationPage;

public class PaginationSteps {
	WebDriver driver = Hooks.driver ;
	PaginationPage Pagination;
	
	@When("lapprenti clique sur mes ressources")
	public void lapprenti_clique_sur_mes_ressources() {
		Pagination = new PaginationPage(driver); 
		Pagination.clickRessources();
	}

	@When("lapprenti clique sur la page suivante")
	public void lapprenti_clique_sur_la_page_suivante() {
		Pagination.clickPageSuivante();
	}

	@When("lapprenti clique sur la page precedente")
	public void lapprenti_clique_sur_la_page_precedente() {
	    Pagination.clickPagePrecedente();
	}

	@Then("la page precedente s'affiche")
	public void la_page_precedente_s_affiche() {
		Pagination.verificationPagePrecedente();
	}

	
	
	
}
