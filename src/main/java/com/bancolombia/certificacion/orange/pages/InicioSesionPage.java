package com.bancolombia.certificacion.orange.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://opensource.demo.orangehrmlive.com/index.php/auth/login")
public class InicioSesionPage extends PageObject{

	@FindBy(xpath="//input[@id=\'txtUsername\']")
	private WebElementFacade txtUsuario;
	
	@FindBy(xpath="//input[@id=\'txtPassword\']")
	private WebElementFacade txtPassword;
	
	@FindBy(id="btnLogin")
	private WebElementFacade btnLogin;
	
	public void ingresarUsuario(List<String>Lista) {
		txtUsuario.type(Lista.get(2));
	}
	public void ingresarclave(List<String>Lista) {
		txtPassword.type(Lista.get(3));
	}
	public void clickLoguin() {
		btnLogin.click();
	}

}	

