#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Ingresar a la web Orange con usuario y contrasena
  I want to use this template for my feature file

  @Escenario1
  Scenario: ingresar al sistema orange loguearse
    Given que me encuentro logueado con el usuario admin
    When yo ingreso el usuario y contrasena
      | usuario           | contrasena        |
      | testautomatizador | testautomatizador |
    Then yo ingreso a la web principal