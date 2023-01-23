package br.dev.marcelodeoliveira.steps;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprendendoCucumberSteps {
	
	private int contador = 15;
	
	
	
	@Given("que criei o arquivo")
	public void que_criei_o_arquivo() {
		System.out.println("Arquivo criado com sucesso!");
	}

	@When("executa-lo")
	public void executa_lo() {
		System.out.println("... Executando a Aplicação ...");
		// throw new io.cucumber.java.PendingException();
	}

	@Then("a especificacao deve garantir que a execucao seja bem sucedida")
	public void a_especificacao_deve_garantir_que_a_execucao_seja_bem_sucedida() {
		System.out.println("Finalizado com Sucesso!");
		// throw new io.cucumber.java.PendingException();
	}

	@Given("I have already created the file")
	public void iHaveAlreadyCreatedTheFile() {

		System.out.println("File has been created with success!");

	}

	@When("executing it")
	public void executingIt() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("...Running the application ...");

	}

	@Then("the sprecification must ensure that the execution must finish successfully.")
	public void theSprecificationMustEnsureThatTheExecutionMustFinishSuccessfully() {
//		// Write code here that turns the phrase above into concrete actions
//		// throw new io.cucumber.java.PendingException();
		System.out.println("Execution finished successfully.");

	}
	
	@Dado("que o valor do contador é {int}")
	public void queOValorDoContadorÉ(Integer int1) {
	    
	contador = int1;
		
		// Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Quando("eu incrementá-lo em {int}")
	public void euIncrementáLoEm(Integer int1) {
		
		contador += int1;
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Então("o seu valor será {int}")
	public void oSeuValorSerá(Integer int1) {
		
		//fazer o assert falhar: int1 = 45;
		System.out.printf("\n%s\t%d\n%s\t%d\n\n", "Valor Esperado:", contador, "Valor obtido:", int1);
		
		// lançar uma exceção pra causar erro:
		// visto como falha:
		// throw new RuntimeException();
		assertEquals(contador, int1);
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
}
