package inicializationTests;


import com.microsoft.playwright.Keyboard;
import initBrowser.InitAplication;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Component;
import pageObject.ElementPage;

import java.awt.*;


public class automationTest {
    InitAplication init;
    ElementPage element;
    Component comp;

    @BeforeClass
    public void start() {
        init = new InitAplication();
        element = new ElementPage();
        comp = new Component();
        init.Browser("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void DemoSite() throws InterruptedException {
        comp.Keys("filling in field name", element.name(), true)
                .type("Gabriel");
    }

    @AfterClass
    public void down() {
//        init.quit();
    }
}
