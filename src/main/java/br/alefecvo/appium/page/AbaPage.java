package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;

public class AbaPage extends BasePage {

    public void clicarAbaPorTexto(String valor){
        clicarPorTexto(valor);
    }

    public boolean obterMensagemAba(String valor){
        return existeElementoPorTexto(valor);
    }
}
