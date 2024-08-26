package steps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import page.DadosPessoais;
import page.DadosProfissionais;
import page.HomePage;
import runner.Executa;

public class AbrirConta {

	HomePage home = new HomePage();
	DadosPessoais pessoais = new DadosPessoais();
	DadosProfissionais profissionais = new DadosProfissionais();

	@BeforeEach
	public void abrirNavegador() {
		Executa.abrirNavegador();
	}

	@Test
	public void abraSuaConta() {
		home.abraSuaconta("028.919.919-80");
		pessoais.dadosPessoais("teste", "teste", "teste@teste.com", "11111111", "111111111", "11 111111111", "teste",
				"11111111", "11", "teste", "te", "teste");
		profissionais.dadosProfissionais("teste", "teste", "teste", "11111", "teste@e2etreinamentos.com.br");
	}

	@Test
	public void abraSuaContaEmBranco() {
		home.abraSuaContaEmBranco("Erro na verificação do CPF");
	}
	
	@Test
	public void abraSuaContaEFechar() {
		home.abraSuaContaEFechar("Abrir conta");
	}
	
	@Test
	public void abraSuaContaSemDados() {
		home.abraSuaconta("028.919.919-80");
		pessoais.dadosPessoais("", "", "", "", "", "", "", "", "", "", "", "");
		
	}
	
	@Test
	public void abraSuaContaDadosIncompletos() {
		home.abraSuaconta("028.919.919-80");
		pessoais.dadosPessoais("teste", "teste", "teste@teste.com", "11111111", "111111111", "11 111111111", "teste",
				"11111111", "11", "teste", "te", "teste");
		profissionais.dadosProfissionais("", "", "", "", "");

	}
	
	@Test
	public void abraSuaContaCpfInvalido() {
		home.abraSuaContaCpfInvalido("O CPF fornecido não é de um funcionário.", "50624706842");
	}

	@AfterEach
	public void fecharNavegador() {
		Executa.fecharNavegador();
	}

}
