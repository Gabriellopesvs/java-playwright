package initBrowser;

import com.microsoft.playwright.*;

import java.util.Arrays;

public class InitAplication {
    Playwright playwright;
    public static Page page;

    public void Browser(String url) {
        playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome").setArgs(Arrays.asList("--start-fullscreen")));
        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
        page = context.newPage();
        page.navigate(url, new Page.NavigateOptions().setTimeout(60000));
        page.waitForSelector("input[id='userName']", new Page.WaitForSelectorOptions().setTimeout(60000));
        System.out.println(page.title());
    }

    public void quit() {
        playwright.close();
    }
}
