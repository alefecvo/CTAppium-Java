package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;

public class AccordionPage extends BasePage {

    public void clicarBotaoPorTexto(String valor){
        clicarPorTexto(valor);
    }

    public boolean obterTextoOpcao(String valor){
        return existeElementoPorText(valor);
    }

}
