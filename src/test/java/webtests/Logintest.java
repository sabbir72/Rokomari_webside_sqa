package webtests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.DriverSetup;

public class Logintest extends DriverSetup{
	HomePage WebHomePage = new HomePage();
	LoginPage WebLoginPage = new LoginPage();
	ProductPage WebProductPage= new ProductPage();



	@Test
	public void loginTest() throws InterruptedException {
		getDriver().get("https://www.rokomari.com/book");
//		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		WebHomePage.clickLoginButton();
//		js.executeScript("window.scrollBy(0,300)");// used scroll method
		WebLoginPage.scrollBtn();
		WebLoginPage.doLogIn("practiclearn@gmail.com","Learn123");
	    WebHomePage.HomeBtn();
	    WebProductPage.writer();
		WebProductPage.SelecetWriter();
		WebProductPage.testScroll();
//		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);


		WebProductPage.BookHover();
		WebProductPage.View();
//		js.executeScript("window.scrollBy(0,300)");
		WebProductPage.scrolladdCard();
        WebProductPage.addCard();
		WebProductPage.CLICKCARD();
		WebProductPage.PLACEORDER();
		WebProductPage.ClearName();
		WebProductPage.fulltname("Sabbir Ahamed");
		WebProductPage.ClearNumber();
		WebProductPage.Phone("01900-000000");
		Thread.sleep(3000);
//		WebElement A=getDriver().findElement(By.xpath("//div[@class='card']//div[1]//fieldset[1]//p[1]"));
//		System.out.println(A.getText());

		assertEquals(WebProductPage.getText(WebProductPage.Text),"Only numbers are allowed.");
//		assertTrue(A.getText().contains("Only numbers are allowed"));
		WebProductPage.CountryDropDown();
		WebProductPage.CityDropDown();
		Thread.sleep(3000);
		WebProductPage.AreaDropDown();
		Thread.sleep(3000);
		WebProductPage.ZoneDropDown();
		WebProductPage.scrollAddress();
		WebProductPage.UserAddress(" Tongi , Gazipur 1710");
//			WebProductPage.postcode("1710");
//		js.executeScript("window.scrollBy(0,200)");
//		   WebProductPage.TERMS();
//		   WebProductPage.ORDER();

	}

}
