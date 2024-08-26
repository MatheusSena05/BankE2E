package page;

import org.openqa.selenium.By;

import metodos.Metodos;

public class DadosPessoais {

	By name = By.xpath("//input[@name='firstName']");
	By lastName = By.xpath("//input[@name='lastName']");
	By email = By.xpath("//input[@name='email']");
	By dataNascimento = By.xpath("//input[@name='dataBirthday']");
	By rg = By.xpath("//input[@name='rg']");
	By telefone = By.xpath("//input[@name='phoneNumber']");
	By endereco = By.xpath("//input[@name='address']");
	By cep = By.xpath("//input[@name='cep']");
	By numero = By.xpath("//input[@name='number']");
	By complemento = By.xpath("//input[@name='complement']");
	By estado = By.xpath("//input[@name='state']");
	By cidade = By.xpath("//input[@name='city']");
	By btnAvanca = By.xpath("//button[@class='form-button']");
	By btnFechar = By.xpath("//button[@class='close-button']");

	Metodos metodo = new Metodos();

	public void dadosPessoais(String name, String lastName, String email, String dataNascimento, String rg,
			String telefone, String endereco, String cep, String numero, String complemento, String estado,
			String cidade) {
		metodo.esperarElemento(this.name);
		metodo.escrever(this.name, name);
		metodo.escrever(this.lastName, lastName);
		metodo.escrever(this.email, email);
		metodo.escrever(this.dataNascimento, dataNascimento);
		metodo.escrever(this.rg, rg);
		metodo.escrever(this.telefone, telefone);
		metodo.escrever(this.endereco, endereco);
		metodo.escrever(this.cep, cep);
		metodo.escrever(this.numero, numero);
		metodo.escrever(this.complemento, complemento);
		metodo.escrever(this.estado, estado);
		metodo.escrever(this.cidade, cidade);
		metodo.clicar(btnAvanca);

	}

}
