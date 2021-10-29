package steps;

import org.junit.After;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import support.AbrirNavegador;

public class FormularioSteps extends AbrirNavegador {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = AbrirNavegador.abrirNavegadorChrome();
	}
	
	@Dado("que estou no menu Automobile Insurance do site SampleApp")
	public void que_estou_no_menu_automobile_insurance_do_site_sample_app() {
		
	}

	@E("preencho os campos da aba {string}")
	public void preencho_os_campos_da_aba(String string) {

	}
	
	@Quando("clico no bot�o Send")
	public void clico_no_bot_o_send() {
	
	}
	
	@Entao("devo ver a mensagem {string} na tela")
	public void devo_ver_a_mensagem_na_tela(String string) {
	
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
