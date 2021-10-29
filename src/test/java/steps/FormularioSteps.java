package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import support.AbrirNavegador;

public class FormularioSteps extends AbrirNavegador {
	@Dado("que estou no menu Automobile Insurance do site SampleApp")
	public void que_estou_no_menu_automobile_insurance_do_site_sample_app() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@E("preencho os campos da aba {string}")
	public void preencho_os_campos_da_aba(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
