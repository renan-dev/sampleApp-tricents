package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AutomobileInsurancePage {

	private WebDriver navegador;

	public AutomobileInsurancePage(WebDriver navegador) {
		this.navegador = navegador;
	}

	public AutomobileInsurancePage preencherCamposEnterVehicle() {
		WebElement campoMake = navegador.findElement(By.id("make"));
		WebElement campoEnginePerformance = navegador.findElement(By.id("engineperformance"));
		WebElement campoDateOfManufacture = navegador.findElement(By.id("dateofmanufacture"));
		WebElement campoNumberSeats = navegador.findElement(By.id("numberofseats"));
		WebElement comboFuel = navegador.findElement(By.id("fuel"));
		WebElement campoListPrice = navegador.findElement(By.id("listprice"));
		WebElement campoLicensePlateNumber = navegador.findElement(By.id("licenseplatenumber"));
		WebElement campoAnnualMileage = navegador.findElement(By.id("annualmileage"));
		WebElement botaoNextInsuranceData = navegador.findElement(By.id("nextenterinsurantdata"));

		new Select(campoMake).selectByVisibleText("BMW");
		campoEnginePerformance.sendKeys("7");
		campoDateOfManufacture.sendKeys("01/11/2021");
		new Select(campoNumberSeats).selectByVisibleText("6");
		new Select(comboFuel).selectByVisibleText("Diesel");
		campoListPrice.sendKeys("500");
		campoLicensePlateNumber.sendKeys("456");
		campoAnnualMileage.sendKeys("2020");
		botaoNextInsuranceData.click();
		return this;
	}

	public AutomobileInsurancePage preencherCamposEnterInsurant() {
		WebElement campoFirstName = navegador.findElement(By.id("firstname"));
		WebElement campoLastName = navegador.findElement(By.id("lastname"));
		WebElement campoDateOfBirth = navegador.findElement(By.id("birthdate"));
		WebElement campoGender = navegador.findElement(
				By.cssSelector(".group:nth-child(2) > .ideal-radiocheck-label:nth-child(1) " + "> .ideal-radio"));
		WebElement campoStreetAddress = navegador.findElement(By.id("streetaddress"));
		WebElement campoCountry = navegador.findElement(By.id("country"));
		WebElement campoZipCode = navegador.findElement(By.id("zipcode"));
		WebElement campoCity = navegador.findElement(By.id("city"));
		WebElement campoOccupation = navegador.findElement(By.id("occupation"));
		WebElement campoHobbies = navegador
				.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(5) > .ideal-check"));
		WebElement campoWebsite = navegador.findElement(By.id("website"));
		WebElement campoPicture = navegador.findElement(By.id("picturecontainer"));
		WebElement botaoNextProductData = navegador.findElement(By.id("nextenterproductdata"));

		campoFirstName.sendKeys("Renan");
		campoLastName.sendKeys("Rocha");
		campoDateOfBirth.sendKeys("10/27/1993");
		campoGender.click();
		campoStreetAddress.sendKeys("Rua João Mirassol");
		new Select(campoCountry).selectByVisibleText("Brazil");
		campoZipCode.sendKeys("06122170");
		campoCity.sendKeys("Osasco");
		new Select(campoOccupation).selectByVisibleText("Unemployed");
		campoHobbies.click();
		campoWebsite.sendKeys("https://portfolio-renan-rocha.netlify.app/");
		campoPicture.sendKeys("C:\\Users\\renan\\OneDrive\\Documentos\\Photo\\renan.jpg");
		botaoNextProductData.click();
		return this;
	}

	public AutomobileInsurancePage preencherCamposEnterProduct() {
		WebElement campoStartDate = navegador.findElement(By.id("startdate"));
		WebElement campoInsuranceSum = navegador.findElement(By.id("insurancesum"));
		WebElement campoMeritRating = navegador.findElement(By.id("meritrating"));
		WebElement campoDamageInsurance = navegador.findElement(By.id("damageinsurance"));
		WebElement campoOptionalProducts = navegador
				.findElement(By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(1) > .ideal-check"));
		WebElement campoCourtesyCar = navegador.findElement(By.id("courtesycar"));
		WebElement botaoNextSelectPriceOption = navegador.findElement(By.id("nextselectpriceoption"));

		campoStartDate.sendKeys("01/11/2025");
		new Select(campoInsuranceSum).selectByVisibleText("5.000.000,00");
		new Select(campoMeritRating).selectByVisibleText("Malus 10");
		new Select(campoDamageInsurance).selectByVisibleText("Full Coverage");
		campoOptionalProducts.click();
		new Select(campoCourtesyCar).selectByVisibleText("No");
		botaoNextSelectPriceOption.click();
		return this;
	}

	public AutomobileInsurancePage preencherCamposSelectPrice() {
		WebElement campoSelectOption = navegador
				.findElement(By.cssSelector(".idealforms-field-radio .choosePrice:nth-child(2)"));
		WebElement botaoNext = navegador.findElement(By.id("nextsendquote"));

		campoSelectOption.click();
		botaoNext.click();
		return this;
	}

	public AutomobileInsurancePage preencherCamposSendQuote() {
		WebElement campoEmail = navegador.findElement(By.id("email"));
		WebElement campoPhone = navegador.findElement(By.id("phone"));
		WebElement campoUsername = navegador.findElement(By.id("username"));
		WebElement campoPassword = navegador.findElement(By.id("password"));
		WebElement campoConfirmPassword = navegador.findElement(By.id("confirmpassword"));
		WebElement campoComents = navegador.findElement(By.id("Comments"));

		campoEmail.sendKeys("renanprch@gmail.com");
		campoPhone.sendKeys("5511949564795");
		campoUsername.sendKeys("Renanprch");
		campoPassword.sendKeys("Re147258");
		campoConfirmPassword.sendKeys("Re147258");
		campoComents.sendKeys("Automobile Insurance Test Automation");
		return this;
	}

	public AutomobileInsurancePage clicarParaEnviarEmail() {
		WebElement clicarBotaoSend = navegador.findElement(By.id("sendemail"));
		
		clicarBotaoSend.click();
		return this;
	}

	public AutomobileInsurancePage validarMensagemSuccess(String mensagem) {		
		String obterTexto = navegador.findElement(By.cssSelector(".sweet-alert h2")).getText();

		assertEquals(mensagem, obterTexto);
		return this;
	}

	public void fecharNavegador() {
		navegador.quit();
	}

}
