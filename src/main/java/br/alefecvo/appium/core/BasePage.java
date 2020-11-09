package br.alefecvo.appium.core;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.util.List;

import static br.alefecvo.appium.core.DriverFactory.getDriver;

public class BasePage {

    public void escrever(By by, String valor){
        //Preencher campos do formulário
        getDriver().findElement(by).sendKeys(valor);
    }

    public void clicarPorTexto(String valor){
        getDriver().findElement(By.xpath("//*[@text='"+valor+"']")).click();
    }

    public void selecionarCombo(By by, String valor){
        //Preencher campos do formulário
        getDriver().findElement(by).click();
        clicarPorTexto(valor);
    }

    public void clicarCheckBox(By by){
        getDriver().findElement(by).click();
    }

    public void clicarSwitch(By by){
        getDriver().findElement(by).click();
    }

    public String obterTexto(By by){
        return getDriver().findElement(by).getText();
    }

    public boolean existeElementoPorText(String valor){
        List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='"+valor+"']"));
        return  elementos.size() > 0;
    }

    public void clicar(String valor){
        getDriver().findElement(MobileBy.AccessibilityId(valor)).click();
    }

    public void tap(int x,int y){
        AndroidTouchAction touch = new AndroidTouchAction (getDriver());
        touch.press(PointOption.point(x,y))
        .perform ();
    }

    public void esperar(long tempo){
        try {
            Thread.sleep(tempo);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void clicaPosicao(double posicao){
        MobileElement seek = getDriver().findElement(MobileBy.AccessibilityId("slid"));
        int x = (int) (seek.getLocation().x + (seek.getSize().width * posicao));
        int y = seek.getLocation().y + (seek.getSize().height / 2);
        tap(x,y);
    }
}
