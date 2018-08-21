package com.bancolombia.certificacion.orange.testrunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) 
@CucumberOptions(features = "src/test/resources/features", glue="com.bancolombia.certificacion.orange.definitions")//,tags= "@Escenario1")
public class RunnerTestSite {

}
