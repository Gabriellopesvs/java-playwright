package inicializationTests;

import initBrowser.InitAplication;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.Component;
import pageObject.ElementPage;

public class automationTest {
    InitAplication init;
    ElementPage element;
    Component comp;

    @BeforeClass
    public void start() {
        init = new InitAplication();
        element = new ElementPage();
        comp = new Component();
        init.Browser("https://demoqa.com/text-box");
    }

    @Test
    public void DemoSite() throws InterruptedException {
        comp.Keys("filling in field full name", element.name(), false)
                .type("Gabriel Lopes Almeida");

        comp.Keys("filling in field email", element.email(), false)
                .type("test@gmail.com");

        comp.Keys("filling in field address", element.addressCurrent(), false)
                .type("address test");

        comp.Keys("filling in field address", element.addressPermanent(), false)
                .type("address test");

        comp.Keys("clicking on the button", element.submit(), true)
                .click();
    }

    @AfterClass
    public void down() {
        init.quit();
    }
}
