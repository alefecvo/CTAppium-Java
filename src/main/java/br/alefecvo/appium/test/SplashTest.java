package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.MenuPage;
import br.alefecvo.appium.page.SplashPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SplashTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private SplashPage splashPage = new SplashPage();

    @Before
    public void acessarTela(){
        //Acessar menu Splash
        menuPage.acessarOpcaoMenu("Splash");
    }

    @Test
    public void deveAguardarSplashSumir(){
        //Verificar que spash esta sendo exibido
        splashPage.existeSplashVisivel("Splash!");

        //Aguardar saida do spash
        splashPage.aguardarSplashSumir("Splash!");

        //Verifica que o formulário está aparecendo
        Assertions.assertTrue(menuPage.existeElementoPorTexto("Formulário"));
    }
}
