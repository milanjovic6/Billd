import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        Registration regi = new Registration(driver);
        Enrollment enroll = new Enrollment(driver);
        Thread.sleep(5000);
        driver.manage().window().maximize();


        driver.get("https://app-dev.billd.com/register-process");
        String urlstringBase = "https://app-dev.billd.com/register-process";
        Thread.sleep(7000);
        driver.getCurrentUrl();
        String urlstring = driver.getCurrentUrl();

        if (urlstring==urlstringBase){
            System.out.println("RADI");
        }else{
            driver.get("https://app-dev.billd.com/register-process");
            System.out.println("Ne Radi");
        }

        System.out.println(urlstring);
        regi.InputFirstName("Zarko33");
        regi.InputLastName("Test");
        regi.InputLegBusName("Zarko3 Test LCC");
        regi.InputPhone("7894561321");
        regi.InputEmail("zarko338test@email.com");
        regi.InputPassword("password");
        Thread.sleep(1000);
        regi.ClickRegister();
        Thread.sleep(6000);

        enroll.InputCity("Mega City1");
        enroll.InputStreet("Megalo Street");
        enroll.GetState("South Carolina");
        enroll.InputZip("123456");
        enroll.InputWebsite("");
        enroll.GetAnnualRevenue("$1M");
        Thread.sleep(1000);
        enroll.InputOwnerFirstName("Raka");
        enroll.InputOwnerLastName("Test");
        enroll.GetDateOfBirth_Month();
        Thread.sleep(500);
        enroll.InputOwnerStreet("druga ulica");
        enroll.InputOwnerCity("Kejp");
        enroll.GetOwnerState("Colorado");
        enroll.InputOwnerZip("54546");
        Thread.sleep(1000);
        enroll.ClickNext();




    }
}
