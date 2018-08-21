package com.bancolombia.certificacion.orange.steps;

import java.util.List;

import com.bancolombia.certificacion.orange.pages.CrearUsuarioPage;
import com.bancolombia.certificacion.orange.pages.InicioSesionPage;
import com.bancolombia.certificacion.orange.pages.WelcomePage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class CrearUsuarioSteps extends PageObject {

	InicioSesionPage inicioSesionPage;
	WelcomePage welcomePage;
	CrearUsuarioPage crearUsuarioPage;
	
	@Step
	public void AbrirAplicacion(){
	inicioSesionPage.open();
	}
	
	@Step
	public void ingresarUsuario(List<String>Lista) {
		inicioSesionPage.ingresarUsuario(Lista);
		inicioSesionPage.ingresarclave(Lista);
		inicioSesionPage.clickLoguin();
				
	}
	@Step
	public void SeleccionarBotones() {
		welcomePage.SeleccionarAdmin();
		welcomePage.SeleccionarAdd();
	}
	@Step
	public void CrearUsuarioNuevo(List<String>Map) {
		crearUsuarioPage.AsignarRol(Map);
		crearUsuarioPage.IngresarNombreEmpleado(Map);
		crearUsuarioPage.IngresarUserName(Map);
	}
	@Step
	public void MensajeAlerta() {
		
	}
	
}




