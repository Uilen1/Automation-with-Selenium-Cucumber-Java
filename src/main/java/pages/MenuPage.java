package pages;

import maps.MenuMap;
import org.openqa.selenium.WebElement;

public class MenuPage {

    /*Esta classe contém de uma forma geral, as ações que são utilizadas em determinada página na web*/


    MenuMap menuMap = new MenuMap();

    public void clicarPeloTexto (String texto){
        WebElement element = menuMap.menu(texto);
        element.click();
    }
}
