package structural.proxy;

public class Browser {
    public static void main(String[] args)  {
        WebPageProxy webPageProxy = new WebPageProxy();
        try {
            webPageProxy.renderPage("wwe");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

interface WebPage {
    public void renderPage(String url) throws Exception;

}

class WebPageImpl implements WebPage {

    @Override
    public void renderPage(String url) throws Exception{

        System.out.println(url + " rendered successfully ");

    }


}

class WebPageProxy implements WebPage {

    private WebPage webPage;

    public WebPageProxy() {
        webPage = new WebPageImpl();
    }

    @Override
    public void renderPage(String url) throws Exception {
        if (url.equals("youtube")) {
            throw new Exception( url + "is blcoked!");
        }else {

            webPage.renderPage(url);
        }
    }
}
