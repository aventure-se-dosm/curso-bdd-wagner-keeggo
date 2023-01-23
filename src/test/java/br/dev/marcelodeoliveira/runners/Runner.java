package br.dev.marcelodeoliveira.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		dryRun = false, //apenas valida o mapeamento
		features = {
				"src/test/resources/aprendendo_cucumber.feature",
				"src/test/resources/learning_cucumber.feature",
		},		
		
		glue = "br.dev.marcelodeoliveira",
		monochrome = false, //modo monocromático no console
		plugin = "pretty",
		snippets = SnippetType.CAMELCASE//,
		//strict = false --> parece que foi depreciado!
)	
public class Runner {

}
