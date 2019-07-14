package com.vega.springit;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class SpringItProperties {

    private String welcomeMsg= "Hello World I am a Welcome Message";


    /*
     *
     * This is our welcome Message
     * */
    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
}


