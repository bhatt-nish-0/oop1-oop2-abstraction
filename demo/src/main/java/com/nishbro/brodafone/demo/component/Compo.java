package com.nishbro.brodafone.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Compo {

    @Autowired
    @Qualifier("nishib2")
    private Integer xyz;

    @Value("${xxx.yyy.zzz}")
    private String xxx;

    @Autowired
    private String y;

    @Autowired
    @Qualifier(value= "wanufaida")
    private Byte byte2;

    public Integer getInt() {
        System.out.println(xxx);
        return this.xyz ;
    }
}
