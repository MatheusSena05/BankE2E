package page;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;

public class HomePage {

	By digiteSeuCpf = By.id("cpf-input");
	By btnContinuarAbrirConta = By.xpath("//button[text()='Continuar']");
	By btnFecharAbrirConta = By.xpath("//button[@class='close-cta-button']");
	By msgError = By.id("error-message");
	String Url = "http://52.2.114.98/";

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	DadosPessoais pessoais = new DadosPessoais();
	DadosProfissionais profissionais = new DadosProfissionais();

	public void abraSuaconta(String cpf) {

		metodo.validarUrl(Url);
		metodo.clicar(elemento.btnAbrirConta);
		metodo.escrever(this.digiteSeuCpf, cpf);
		metodo.clicar(btnContinuarAbrirConta);

	}

	public void abraSuaContaEmBranco(String textoEsperado) {

		metodo.clicar(elemento.btnAbrirConta);
		metodo.clicar(btnContinuarAbrirConta);
		metodo.esperarElemento(msgError);
		metodo.validarTexto(this.msgError, textoEsperado);
	}

	public void abraSuaContaEFechar(String textoEsperado) {
		metodo.validarTexto(elemento.btnAbrirConta, textoEsperado);
		metodo.clicar(elemento.btnAbrirConta);
		metodo.clicar(btnFecharAbrirConta);
	}
	
	public void abraSuaContaCpfInvalido(String textoEsperado, String cpf) {
		metodo.clicar(elemento.btnAbrirConta);
		metodo.escrever(digiteSeuCpf, cpf);
		metodo.clicar(btnContinuarAbrirConta);
		metodo.esperarElemento(msgError);
		metodo.validarTexto(msgError, textoEsperado);
	}

}
