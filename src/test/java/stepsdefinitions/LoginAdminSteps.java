package stepsdefinitions;



	import org.openqa.selenium.WebDriver;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import pages.LoginPage;

	public class LoginAdminSteps {
		WebDriver driver = Hooks.driver ;
		LoginPage login2 ;
		
	@Given("ladministrateur est sur la page d accueil")
	public void ladministrateur_est_sur_la_page_d_accueil() {
		driver.get("http://10.4.1.137/frontend/");
	
	}

	@When("ladministrateur clique sur connexion")
	public void ladministrateur_clique_sur_connexion() {
		login2 = new LoginPage(driver);
		login2.clickConnexion();
	   
	}

	@When("^ladministrateur entre (.*) and (.*)$")
	public void ladministrateur_entre_email_and_password(String email,String password) {
	login2.credentials(email, password);
	  
	}

	@When("ladministrateur clique sur le bouton Sidentifier")
	public void ladministrateur_clique_sur_le_bouton_sidentifier() {
		login2.clickSubmit();
	   
	}

	@Then("ladministrateur est sur la page du tableau de bord")
	public void ladministrateur_est_sur_la_page_du_tableau_de_bord() {
		login2.checkInfoDisplayed();
	   
	}


	
	
	
	
	
	
	
	
	
	
	
}
