package factory;

import constants.DriverConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Properties;

public class DriverFactory {

    public static WebDriver driver;


    public DriverFactory() {

    }

    public static WebDriver getDriver() {

        /*Verifica se há uma instância do driver, caso sim, ele simplesmente retorna a instância
        * isso evita ficar abrindo várias instâncias do driver*/
        if (driver == null) {
            switch (DriverConstants.brownser) {
                case FIREFOX:
                    driver = new FirefoxDriver();
                    break;

                case CHROME:
                    driver = new ChromeDriver();
                    break;
            }
        }
        return driver;
    }

    public static void killDriver() {
        /*Verifica se existe uma instância, caso sim ele a fecha e atribui null a variável driver*/
        if (driver != null) {
            driver.close();
            driver = null;
        }

    }

}
