package config;

import java.net.URL;

public class WebDriverConfig {


    public Browser getBrowser() {
        return Browser.FIREFOX;
    }

    public String getBaseUrl(){
        return "https://github.com/";
    }

    public boolean isRemote (){
        return false;
    }
    public URL getRemoteUrl (){
        return null;
    }
}
