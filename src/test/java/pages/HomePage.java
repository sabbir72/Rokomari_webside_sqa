package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{
	private By SignUpButton = By.xpath("//a[@class='logged-out-user-menu-btn btn btn-secondary']");
	public By HomeMainPage = By.xpath("//img[@alt='Rokomari.com']");


	
	public void clickLoginButton() {
		click(SignUpButton);
	}

	public void  HomeBtn(){
		click(HomeMainPage);
	}

}
