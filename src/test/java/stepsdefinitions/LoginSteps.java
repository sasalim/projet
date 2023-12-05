package stepsdefinitions;



import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	WebDriver driver = Hooks.driver ;
	LoginPage login ;
	
	@Given("lapprenti est sur la page d accueil")
	public void lapprenti_est_sur_la_page_d_accueil() {
		driver.get("http://10.4.1.137/frontend/");
	}

	@When("lapprenti clique sur connexion")
	public void lapprenti_clique_sur_connexion() {
		login = new LoginPage(driver);
		login.clickConnexion();
	}

	@When("^lapprenti entre (.*) and (.*)$")
	public void lapprenti_entre_email_and_password(String email,String password) {
		login.credentials(email, password);
	}

	@When("lapprenti clique sur le bouton Sidentifier")	
	public void lapprenti_clique_sur_le_bouton_sidentifier() {
		login.clickSubmit();
	}

	@Then("lapprenti est sur la page du tableau de bord")
	public void lapprenti_est_sur_la_page_du_tableau_de_bord() {
		login.checkInfo2Displayed();
	}

}
