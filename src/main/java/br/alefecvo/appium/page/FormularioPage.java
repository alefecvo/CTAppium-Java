package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;
import br.alefecvo.appium.core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormularioPage extends BasePage {

    public void escreverNome(String valor){
        escreverTexto(By.className("android.widget.EditText"),valor);
    }

    public void selecionarCombo(String valor){
        selecionarCombo(By.className("android.widget.Spinner"),valor);
    }

    public void selecionarCheckBox(){
        clicarCheckBox(By.className("android.widget.CheckBox"));
    }

    public void selecionarSwitch(){
        clicarSwitch(By.className("android.widget.Switch"));
    }

    public void clicarDataPicker(String valor){
        clicar(valor);
    }

    public void clicarSeekBar(double posicao){
        clicaPosicao(posicao);
    }

    public void clicarBotaoPorTexto(String valor){
        clicarPorTexto(valor);
    }

    public String obterNome(String valor){
        return obterTexto(By.xpath("//android.widget.TextView[@text='"+valor+"']"));
    }

    public String obterConsole(String valor){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'"+valor+"')]"));
    }

    public boolean obterValorCheckBox(String valor){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]")).endsWith(valor);
    }

    public boolean obterValorSwitch(String valor){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]")).endsWith(valor);
    }

    public void aguardarElementoTela(String valor) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='"+valor+"']")));
    }
}
