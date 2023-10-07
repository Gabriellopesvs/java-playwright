package pageObject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Before;

import java.io.File;
import java.nio.file.Paths;

import static initBrowser.InitAplication.page;

public class Component {

    public Component(){
        deleteFolder(new File("src/test/java/screenshots"));
    }

    public Locator Keys(String action ,String element, boolean screenshots) throws InterruptedException {
        if (screenshots){
            this.screenshots(action);
        }
        return page.locator(element);
    }

    public void deleteFolder(File folder){
        if (folder.exists()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteFolder(file);
                    } else {
                        file.delete();
                    }
                }
            }
            folder.delete();
        }
    }

    public void screenshots(String name){

        new File("src/test/java/screenshots/").mkdirs();

        String filePath = "src/test/java/screenshots/" + name + ".png" ;

        Page.ScreenshotOptions screenshotOptions = new Page.ScreenshotOptions()
                .setPath(Paths.get(filePath))
                .setFullPage(true);

        page.screenshot(screenshotOptions);

    }

}
