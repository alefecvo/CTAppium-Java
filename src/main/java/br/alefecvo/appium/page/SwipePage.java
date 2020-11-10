package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;

public class SwipePage extends BasePage {

    public void fazerEsquerda(){
        swipeLeft();
    }

    public void fazerDireita(){
        swipeRight();
    }

    public boolean obterTextoSwipe(String valor){
        return existeElementoPorTexto(valor);
    }
}
