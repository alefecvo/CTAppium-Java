package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.AlertaPage;
import br.alefecvo.appium.page.MenuPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AlertaTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private AlertaPage alertaPage = new AlertaPage();

    @Test
    public void deveConfirmarAlerta(){
        //Acessar menu alerta
        menuPage.acessarOpacaoMenu("Alertas");

        //Clicar em alerta confirm
        alertaPage.clicarAlertaConfirm("ALERTA CONFIRM");

        //Verificar os textos
        Assertions.assertEquals("Info", alertaPage.obterTituloAlerta());
        Assertions.assertEquals("Confirma a operação?", alertaPage.obterMensagemAlerta());

        //Confirmar alerta
        alertaPage.clicarBotaoPorTexto("CONFIRMAR");

        //Verificar nova mensagem
        Assertions.assertEquals("Info", alertaPage.obterTituloAlerta());
        Assertions.assertEquals("Confirmado", alertaPage.obterMensagemAlerta());

        //Sair
        alertaPage.clicarBotaoPorTexto("SAIR");
    }
}
