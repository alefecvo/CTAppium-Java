package br.alefecvo.appium.test;

import br.alefecvo.appium.core.BaseTest;
import br.alefecvo.appium.page.FormularioPage;
import br.alefecvo.appium.page.MenuPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FormularioTest extends BaseTest{

    //Declarando classe de menu page
    private MenuPage menuPage = new MenuPage();
    private FormularioPage formularioPage = new FormularioPage();

    @Before
    public void acessarTela(){
        //Acessar menu Formulário
        menuPage.acessarOpcaoMenu("Formulário");
    }

    @Test
    public void deveRealizarCadastro() {
        //Preencher campos do formulário
        formularioPage.escreverNome("Alefe");
        formularioPage.selecionarCombo("Nintendo Switch");
        formularioPage.selecionarCheckBox();
        formularioPage.selecionarSwitch();

        //Acionar botão salvar
        formularioPage.clicarBotaoPorTexto("SALVAR");

        //Verificações
        Assertions.assertEquals("Nome: Alefe", formularioPage.obterNome("Nome: Alefe"));
        Assertions.assertEquals("Console: switch", formularioPage.obterConsole("Console:"));
        Assertions.assertTrue(formularioPage.obterValorCheckBox("Marcado"));
        Assertions.assertTrue(formularioPage.obterValorSwitch("Off"));
    }

    @Test
    public void deveRealizarCadastroDemorado() {
        //Preencher campos do formulário
        formularioPage.escreverNome("Alefe");

        //Acionar botão salvar demorado
        formularioPage.clicarBotaoPorTexto("SALVAR DEMORADO");

        //Espera para identificar se elemento está na tela
        formularioPage.aguardarElementoTela("Nome: Alefe");

        //Verificações
        Assertions.assertEquals("Nome: Alefe", formularioPage.obterNome("Nome: Alefe"));
    }

    @Test
    public void deveAlterarData()
    {
        //Preencher campos
        formularioPage.clicarBotaoPorTexto("01/01/2000");
        formularioPage.clicarPorTexto("20");
        formularioPage.clicarPorTexto("OK");

        Assertions.assertTrue(formularioPage.existeElementoPorTexto("20/2/2000"));
    }

    @Test
    public void deveAlterarHora(){
        //Preencher campos
        formularioPage.clicarBotaoPorTexto("06:00");
        formularioPage.clicarDataPicker("10");
        formularioPage.clicarDataPicker("40");
        formularioPage.clicarPorTexto("OK");

        Assertions.assertTrue(formularioPage.existeElementoPorTexto("10:40"));

    }

    @Test
    public void deveInteragirComSeekBar(){
        //Clicar no seekbar
        formularioPage.clicarSeekBar(0.75);

        //Salvar
        formularioPage.clicarBotaoPorTexto("SALVAR");
    }
}
