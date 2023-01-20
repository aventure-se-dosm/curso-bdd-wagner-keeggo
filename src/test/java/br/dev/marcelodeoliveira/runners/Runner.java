package br.dev.marcelodeoliveira.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/aprendendo_cucumber.feature",
		glue = "br.dev.marcelodeoliveira"
)	
public class Runner {

}
