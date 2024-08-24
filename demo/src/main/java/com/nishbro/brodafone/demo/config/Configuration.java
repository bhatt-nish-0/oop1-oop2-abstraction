package com.nishbro.brodafone.demo.config;

import com.nishbro.brodafone.demo.component.NewComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean(name = "nishib")
    public String getBean() {
        return "nish!";
    }

    @Bean(name = "nishib2")
    public Integer getBean2() {
        return 234;
    }

    @Bean
    public Byte getByte() {
        return 22;
    }

    @Bean(name="wanufaida")

    public Byte getByte2() {
        return 28;
    }

    @Bean
    public NewComponent newComponent() {
        NewComponent newComponent = new NewComponent();
        newComponent.setTest("aloha");
        return newComponent;
    }

    @Bean
    public Long getLong() {
        Long tt = 298L;
        return tt;
    }

}
