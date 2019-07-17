package com.vega.springit;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
@Data
public class SpringItProperties {


    private String welcomeMsg= "Hello World I am a Welcome Message";


    /*
     *
     * This is our welcome Message
     * */

}


