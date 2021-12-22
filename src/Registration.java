import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Registration {

    private static WebDriver driver;

    public Registration(WebDriver mainDriver) {
        driver=mainDriver;
    }


    private static WebElement FirstName(){
        return driver.findElement(By.cssSelector("#firstName"));
    }
    private static WebElement LastName(){
        return driver.findElement(By.cssSelector("#lastName"));
    }
    private static WebElement LegalBussinesName(){
        return driver.findElement(By.cssSelector("#legBusName"));
    }
    private static WebElement Phone(){
        return driver.findElement(By.cssSelector("#phone"));
    }
    private static WebElement Email(){
        return driver.findElement(By.cssSelector("#email"));
    }
    private static WebElement Password(){
        return driver.findElement(By.cssSelector("#password"));
    }
    private static WebElement Registerbtn(){
        return driver.findElement(By.xpath("/html/body/app-root/body/div/register/div[2]/div[1]/div/button"));
    }

    public void InputFirstName(String s){
        FirstName().sendKeys(s);
    }
    public void InputLastName(String s){
        LastName().sendKeys(s);
    }
    public void InputLegBusName(String s){
        LegalBussinesName().sendKeys(s);
    }
    public void InputPhone(String s){
        Phone().sendKeys(s);
    }
    public void InputEmail(String s){
        Email().sendKeys(s);
    }
    public void InputPassword(String s){
        Password().sendKeys(s);
    }
    public void ClickRegister(){
        Registerbtn().click();
    }

}
