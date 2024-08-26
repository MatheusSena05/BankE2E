package page;

import org.openqa.selenium.By;

import metodos.Metodos;

public class DadosProfissionais {

	By grupoAtual = By.xpath("//input[@name='actualGroup']");
	By primeiroGrupo = By.xpath("//input[@name='firstGroup']");
	By cargo = By.xpath("//input[@name='job']");
	By salario = By.xpath("//input[@placeholder='Salário']");
	By email = By.xpath("//input[@name='professionalEmail']");
	By btnAvanca = By.id("btnEnviar");
	By btnVoltar = By.id("btnVoltar");

	Metodos metodo = new Metodos();

	public void dadosProfissionais(String grupoAtual, String primeiroGrupo, String cargo, String salario,
			String emailProfissional) {

		metodo.esperarElemento(this.grupoAtual);
		metodo.escrever(this.grupoAtual, grupoAtual);
		metodo.escrever(this.primeiroGrupo, primeiroGrupo);
		metodo.escrever(this.cargo, cargo);
		metodo.escrever(this.email, emailProfissional);
		metodo.clicar(btnAvanca);
	}

}
