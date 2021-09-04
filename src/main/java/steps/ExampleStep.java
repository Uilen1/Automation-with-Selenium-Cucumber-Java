package steps;

import constants.AplicationConstants;
import io.cucumber.java.pt.Dado;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MenuPage;

import static factory.DriverFactory.getDriver;


public class ExampleStep {

    /*Está classe representa os metodos que são incluidos no arquivo ".feature" que está escrito em linguagem natural*/

    MenuPage menuPage =  new MenuPage();

    @Dado("que clico em {string}")
    public void queClicoEm(String texto) throws Exception {
        try {
            menuPage.clicarPeloTexto(texto);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
