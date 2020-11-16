package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.MenuPage;
import br.alefecvo.appium.page.WebViewerPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WebViewerTest  extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private WebViewerPage webViewerPage = new WebViewerPage();

    @Before
    public void acessarTela(){
        //Acessar menu Seu Barriga Híbrido
        menuPage.acessarOpcaoMenu("SeuBarriga Híbrido");
    }

    @Test
    public void deveFazerLogin(){
        //Preencher e-mail
        menuPage.esperar(3000);
        webViewerPage.entrarContextoWeb();
        webViewerPage.setEmail("alefe@alefe");
    }

    @After
    public void sair(){
        webViewerPage.sairContextoWeb();
    }
}
