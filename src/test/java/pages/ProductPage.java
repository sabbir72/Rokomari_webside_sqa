package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static utilities.DriverSetup.getDriver;

public class ProductPage extends BasePage{
    public  By Author = By.xpath("//a[@id='js--authors']");
    public By SelecetAuthor=By.xpath("//a[contains(text(),'জহির রায়হান')]");
//    public By Book = By.xpath("//p[contains(text(),'বরফ গলা নদী')]");
    public By Book = By.xpath("//div[@title='বরফ গলা নদী জহির রায়হান']//div[contains(@class,'book-list-wrapper')]");

//    public By testbook=By.xpath("//div[@title='আর কতদিন জহির রায়হান']//div[contains(@class,'book-list-wrapper')]");
   public By BookView = By.xpath("(//a[@class='btn home-details-btn btn-block'][normalize-space()='View Details'])[2]");
    public By AddToCard = By.xpath("//div[@id='js--details-btn-area']//span[@id='js--add-to-cart-button']");
    public By clickCard=By.xpath("//div[@class='cart-menu-wrapper']");

    public By OrderPlace=By.xpath("//a[@id='js-continue-to-shipping']");
    public By FullName=By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
    public By PhoneNumber=By.xpath("//fieldset[@class='group']//input[@id='phone']");
    public By Country =By.xpath("//select[@id='js--country']");
    public By City =By.xpath("//select[@id='js--city']");
    public By Area=By.xpath("//select[@class='custom-select']");
    public By PostZone=By.xpath("//select[@name='zoneId']");
    public By Address=By.xpath("//textarea[@data-validation-type='address']");

    public By trem=By.xpath("//input[@id='terms']");
    public By placeOrder=By.xpath("//input[@name='woocommerce_checkout_place_order']");

   public  By Text = By.xpath("//div[@class='card']//div[1]//fieldset[1]//p[1]");



    public void writer() {
        HoverA(Author);
    }
    public void SelecetWriter(){
        click(SelecetAuthor);
    }

    public void testScroll(){
        Scroll(Book);
    }
    public void  BookHover(){
        HoverA(Book);
    }
    public void View(){
        click(BookView);
    }
    public void scrolladdCard(){
        Scroll(AddToCard);
    }
    public void addCard(){
        click(AddToCard);
    }
    public void CLICKCARD(){
        click(clickCard);
    }
    public void PLACEORDER(){
        click(OrderPlace);
}

public void ClearName(){
        clear(FullName);
}
    public void fulltname(String username) {
        writeText(FullName, username);
    }
    public void ClearNumber(){
        clear(PhoneNumber);
    }
    public  void Phone(String number) {writeText(PhoneNumber,number);}
     public void CountryDropDown(){
      Dropdown(Country, "Bangladesh");
     }
     public void CityDropDown(){Dropdown(City, "গাজীপুর");}
     public void AreaDropDown(){Dropdown(Area, "টঙ্গী ");}
     public void ZoneDropDown(){Dropdown(PostZone,"টঙ্গী পৌরসভা");}
    public void scrollAddress(){
        Scroll(Address);
    }
     public void UserAddress(String address){
        writeText(Address, address);
    }

    public void TERMS(){

       try {
           click(trem);
       }catch (StaleElementReferenceException e){
           By trem=By.xpath("//input[@id='terms']");
           click(trem);
       }
    }
    public void ORDER(){
        try {
            click(placeOrder);
        }catch (StaleElementReferenceException e){
            By placeOrder=By.xpath("//input[@name='woocommerce_checkout_place_order']");
            click(placeOrder);
        }
    }



}
