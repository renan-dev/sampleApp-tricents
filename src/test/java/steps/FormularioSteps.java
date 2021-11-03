package steps;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pages.AutomobileInsurancePage;
import support.BasePage;

public class FormularioSteps {

	private WebDriver navegador;
	
	@Before
	public void setUp() {
		navegador = BasePage.abrirNavegadorChrome();
		WebElement clicarMenuAutomobileInsurance = navegador.findElement(By.id("nav_automobile"));
		clicarMenuAutomobileInsurance.click();

	}

	@Dado("que estou no menu Automobile Insurance do site SampleApp")
	public void que_estou_no_menu_automobile_insurance_do_site_sample_app() {
		WebElement menuAutomobileInsurance = navegador.findElement(By.xpath("//span[@id='selectedinsurance']"));
		assertEquals("Automobile Insurance", menuAutomobileInsurance.getText());
	}

	@E("preencho os campos da aba {string} e clico no botao Next")
	public void preencho_os_campos_da_aba(String abaAtual) {		
		if(abaAtual.equals("Enter Vehicle Data")) {	
			new AutomobileInsurancePage(navegador).preencherCamposEnterVehicle();
			
		}
	
		if(abaAtual.equals("Enter Insurant Data")) {		
			new AutomobileInsurancePage(navegador).preencherCamposEnterInsurant();
		}
		
		if(abaAtual.equals("Enter Product Data")) {		
			new AutomobileInsurancePage(navegador).preencherCamposEnterProduct();
		}		
		
		if(abaAtual.equals("Select Price Option")) {		
			new AutomobileInsurancePage(navegador).preencherCamposSelectPrice();
		}		
	
		if(abaAtual.equals("Send Quote")) {		
			new AutomobileInsurancePage(navegador).preencherCamposSendQuote();
		}			
			
	}
		
	@Quando("clico no botao Send")
	public void clico_no_botao_send() {
		new AutomobileInsurancePage(navegador).clicarParaEnviarEmail();
	}
	
	@Entao("devo ver a mensagem {string} na tela")
	public void devo_ver_a_mensagem_na_tela(String mensagem) {
		new AutomobileInsurancePage(navegador).validarMensagemSuccess(mensagem);
	}
	
	@After
	public void tearDown() {
		new AutomobileInsurancePage(navegador).fecharNavegador();
	}
}
