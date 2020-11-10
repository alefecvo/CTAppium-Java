package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;

public class MenuPage extends BasePage {

    //Acessar opções de menu
    public void acessarOpcaoMenu(String valor){
        clicarPorTexto(valor);
    }
}
