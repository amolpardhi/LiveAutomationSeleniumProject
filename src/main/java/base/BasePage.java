package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BasePage {
    public static WebDriver driver;
    public static Properties prop;

    public BasePage() {
        try{
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
            prop.load(fis);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void initialization(){
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")){
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ZERO);
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }
}
