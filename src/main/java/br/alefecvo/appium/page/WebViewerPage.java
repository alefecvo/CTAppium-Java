package br.alefecvo.appium.page;

import br.alefecvo.appium.core.BasePage;
import br.alefecvo.appium.core.DriverFactory;
import org.openqa.selenium.By;

import java.util.Set;

public class WebViewerPage extends BasePage {

    public void entrarContextoWeb(){
        Set<String> contextHandles = DriverFactory.getDriver().getContextHandles();
        DriverFactory.getDriver().context((String) contextHandles.toArray()[1]);
    }

    public void sairContextoWeb(){
        DriverFactory.getDriver().context((String) DriverFactory.getDriver().getContextHandles().toArray()[0]);
    }

    public void setEmail(String valor){
        DriverFactory.getDriver().findElement(By.id("email")).sendKeys(valor);
    }
}
