package page;

import org.openqa.selenium.By;

import metodos.Metodos;

public class Login {

	By username = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");
	By opcoes = By.id("react-burger-menu-btn");
	By logout = By.xpath("//*[@data-test='logout-sidebar-link']");
	
	
	Metodos metodo = new Metodos();

	public void loginValido(String username, String password) {
		metodo.escrever(this.username, username);
		metodo.escrever(this.password, password);
		metodo.clicar(btnLogin);
	}
	
	public void login() {
		metodo.usuarioValido(username);
		metodo.senhaválida(password);
		metodo.clicar(btnLogin);
	}
	
	public void logout() {
		metodo.clicar(opcoes);
		metodo.clicar(logout);


	}
	
}
