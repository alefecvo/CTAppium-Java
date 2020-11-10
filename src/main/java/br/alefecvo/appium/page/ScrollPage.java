package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;
import org.openqa.selenium.By;

public class ScrollPage extends BasePage {

    public String obterTituloAlerta(){
        return obterTexto(By.id("android:id/alertTitle"));
    }

    public String obterMensagemAlerta(){
        return obterTexto(By.id("android:id/message"));
    }

    public boolean existeMensagem(String valor){
        return existeElementoPorTexto(valor);
    }
}
