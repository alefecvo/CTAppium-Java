package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.MenuPage;
import br.alefecvo.appium.page.SplashPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SplashTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private SplashPage splashPage = new SplashPage();

    @Test
    public void deveAguardarSplashSumir(){
        //Acessar menu spash
        menuPage.acessarOpacaoMenu("Splash");

        //Verificar que spash esta sendo exibido
        splashPage.isTelaSpashVisivel("Splash!");

        //Aguardar saida do spash
        splashPage.aguardarSplashSumir("Splash!");

        //Verifica que o formulário está aparecendo
        Assertions.assertTrue(menuPage.existeElementoPorText("Formulário"));
    }
}
