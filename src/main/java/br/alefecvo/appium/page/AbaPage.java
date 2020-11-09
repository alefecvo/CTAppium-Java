package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;

public class AbaPage extends BasePage {

    public boolean obterMensagemAba(String valor){
        return existeElementoPorText(valor);
    }

    public void clicarAbaPorTexto(String valor){
        clicarPorTexto(valor);
    }
}
