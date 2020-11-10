package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;
import org.openqa.selenium.By;

public class AlertaPage  extends BasePage {

    public void clicarAlertaConfirm(String valor){
        clicarPorTexto(valor);
    }

    public void clicarAlertaSimples(String valor){
        clicarPorTexto(valor);
    }

    public void clicarBotaoPorTexto(String valor){
        clicarPorTexto(valor);
    }

    public void clicarForaAlerta(int x, int y){
        esperar(1000);
        tap(x,y);
    }

    public String obterTituloAlerta(){
        return obterTexto(By.id("android:id/alertTitle"));
    }

    public String obterMensagemAlerta(){
        return obterTexto(By.id("android:id/message"));
    }
}
