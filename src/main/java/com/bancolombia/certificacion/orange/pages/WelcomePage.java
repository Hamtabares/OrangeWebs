package com.bancolombia.certificacion.orange.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WelcomePage extends PageObject{
	
	@FindBy (id="menu_admin_viewAdminModule")
	private WebElementFacade btnAdmin;
	
	@FindBy (id="btnAdd")
	private WebElementFacade btnAdd;
	
	public void SeleccionarAdmin() {
	btnAdmin.click();
	}
	
	public void SeleccionarAdd() {
	btnAdd.click();
	}
	
}
