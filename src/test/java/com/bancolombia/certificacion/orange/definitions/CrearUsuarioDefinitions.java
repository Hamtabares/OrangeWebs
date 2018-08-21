package com.bancolombia.certificacion.orange.definitions;

import java.util.List;

import com.bancolombia.certificacion.orange.steps.CrearUsuarioSteps;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CrearUsuarioDefinitions {
	
	@Steps
	CrearUsuarioSteps crearUsuarioSteps;
	

	@Given("^que me encuentro logueado con el usuario admin$")
	public void que_me_encuentro_logueado_con_el_usuario_admin()  {
			crearUsuarioSteps.AbrirAplicacion();
		
	}

	@When("^yo ingreso el usuario y contrasena$")
	public void yo_ingreso_el_usuario_y_contrasena(List<String>Lista)  {
			crearUsuarioSteps.ingresarUsuario(Lista);

	}

	@Then("^yo ingreso a la web principal$")
	public void yo_ingreso_a_la_web_principal()  {
		crearUsuarioSteps.SeleccionarBotones();

	}
	
	//Escenario 2

	@Given("^que estoy en la pagina para crear usuario$")
	public void que_estoy_en_la_pagina_para_crear_usuario(List<String>Lista)  {
		crearUsuarioSteps.AbrirAplicacion();
		crearUsuarioSteps.ingresarUsuario(Lista);
		crearUsuarioSteps.SeleccionarBotones();
		

	}

	@When("^yo ingreso el usuario repetido$")
	public void yo_ingreso_el_usuario_repetido(List<String>Map)  {
		crearUsuarioSteps.CrearUsuarioNuevo(Map);
	}

	@Then("^el sistema arroja alerta \"([^\"]*)\"$")
	public void el_sistema_arroja_alerta(String arg1)  {
		crearUsuarioSteps.MensajeAlerta();
	}

}
