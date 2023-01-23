package br.dev.marcelodeoliveira.steps;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprendendoCucumberSteps {

	private Integer contador = 15;

//	private Date entrega = new Date();
	private LocalDate entrega = null;

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

		// fazer o assert falhar: int1 = 45;
		System.out.printf("\n%s\t%d\n%s\t%d\n\n", "Valor Esperado:", contador, "Valor obtido:", int1);

		// lançar uma exceção pra causar erro:
		// visto como falha:
		// throw new RuntimeException();

//		Calendar calendar = Calendar.getInstance();
//		calendar.set(2018, 4, 5, 0, 0, 0);
		// entrega = calendar.getTime();

		Assert.assertEquals(contador, int1);

	}

	@Dado("que o prazo é dia {int}\\/{int}\\/{int}")
	public void queOPrazoÉDia(Integer dia, Integer mes, Integer ano) {

		entrega = LocalDate.of(2018, 4, 5);
		System.out.println(entrega.toString());
		System.out.println("/n/n" + "Data de entrega inicial: " + entrega.toString() + "/n/n");

	}

	@Quando("a entrega atrasar em {int} {string}")
	public void aEntregaAtrasarEm(int quantidade, String unidadeSemantica) {

		Period tempUnit = null;

		switch (unidadeSemantica.toLowerCase()) {
		case "dia":
		case "dias":
		case "days": {
			tempUnit = Period.ofDays(quantidade);
			break;
		}
		case "mes":
		case "mês":
		case "meses":
		case "month":
		case "months": {
			tempUnit = Period.ofMonths(quantidade);
			break;
		}

		case "ano":
		case "anos":
		case "year":
		case "years": {
			tempUnit = Period.ofYears(quantidade);
			break;
		}

		}

		try {

			entrega = entrega.plus(tempUnit);
			System.out.println(entrega.toString());
		} catch (DateTimeException | ArithmeticException a) {
				System.out.println(a.getLocalizedMessage());;
		}
	}

	// entrega = entrega.plusDays(dias);
	// unidade.
	// TemporalAmount: classe de unidade te tempo

	@Então("a entrega será efetuada em {int}\\/{int}\\/{int}")
	public void aEntregaSeráEfetuadaEm(Integer dia, Integer mes, Integer ano) {

		System.out.println("\n\n" + "Data de entrega final: " + entrega.toString() + "\n\n");
		Assert.assertEquals(entrega, LocalDate.of(ano, mes, dia));
	} 

}
