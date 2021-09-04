package maps;

import constants.AplicationConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static factory.DriverFactory.getDriver;

public class MenuMap {

    /*Esta classe contém os elementes que iremos interagir na pagina web
    * Os elementos são encontrados na página web por meio do mapeamento chamado "xpath"
    * que leva em consideração a disposição dos elementos no DOM(document object model) html
    * */


    public WebElement menu (String texto){
        WebDriverWait wait = new WebDriverWait(getDriver(), AplicationConstants.TIMEOUT);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'"+texto+"')][@class='dropdown-toggle']")));
    }
}
