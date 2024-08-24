package com.nishbro.brodafone.demo.component;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class EssentialComponent {
    public EssentialComponent() {
        System.out.println("creatig essential eagerly");
    }
}
