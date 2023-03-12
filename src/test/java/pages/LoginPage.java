package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	private By USERNAME = By.xpath("//input[@id='j_username']");
	private By PASSWORD = By.xpath("//input[@id='j_password']");
	public By LOGIN = By.xpath("//button[normalize-space()='Sign In']");

	public void enterUsername(String username) {
		writeText(USERNAME, username);
	}
	
	public void enterPassword(String password) {
		writeText(PASSWORD, password);
	}

	public void scrollBtn(){
		Scroll(LOGIN);
	}
	public void clickButton() {
		click(LOGIN);
	}
	
	public void doLogIn(String username, String password) {
		writeText(USERNAME, username);
		writeText(PASSWORD, password);
		clickButton();
	}


	
}
