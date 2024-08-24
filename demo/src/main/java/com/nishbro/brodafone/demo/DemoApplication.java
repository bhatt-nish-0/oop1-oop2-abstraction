package com.nishbro.brodafone.demo;

import com.nishbro.brodafone.demo.component.Compo;
import com.nishbro.brodafone.demo.component.EssentialComponent;
import com.nishbro.brodafone.demo.component.FinalComponent;
import com.nishbro.brodafone.demo.component.NewComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
		Amory amory = run.getBean(Amory.class);
		amory.doing();
	}

	@Bean
	public Amory getAmoty() {
		return new Amory();
	}

}

class Amory {
	public void doing() {
		System.out.println("heybrothernish");
	}
}
