package com.bancolombia.certificacion.orange.pages;

import java.util.List;

import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CrearUsuarioPage extends PageObject {

//	@FindBy (xpath="//select[@id=\'systemUser_userType\']")
//	private WebElementFacade ListaRoles;
	
	@FindBy (id="systemUser_userType")
	private WebElementFacade ListRoles;
	
	@FindBy (id="systemUser_employeeName_empName")
	private WebElementFacade TxtNombreEmpleado;
	
	@FindBy (id="systemUser_userName")
	private WebElementFacade TxtUsuarioNuevo;
	

	public void AsignarRol(List<String>Map) {
		Select s =new Select(ListRoles);
		s.selectByVisibleText(Map.get(0));
	}
	public void IngresarNombreEmpleado(List<String>Map) {
		TxtNombreEmpleado.sendKeys(Map.get(1));
	}
	public void IngresarUserName(List<String>Map) {
		TxtUsuarioNuevo.sendKeys(Map.get(2));
	}


	
}

