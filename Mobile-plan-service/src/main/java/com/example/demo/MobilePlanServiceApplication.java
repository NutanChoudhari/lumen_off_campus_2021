package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.MobilePlan;

/**
 * In Spring by default, beans are eagerly created
 * We can also can make them lazy
 * Beans are singleton by default
 * scope from singleton to prototype is done by using annotation @Scope("prototype")
 */

@SpringBootApplication
public class MobilePlanServiceApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=SpringApplication.run(MobilePlanServiceApplication.class, args);
		MobilePlan plan=ctx.getBean("mobilePlan",MobilePlan.class);
		System.out.println(plan);
		MobilePlan plan2=ctx.getBean("mobilePlan",MobilePlan.class);
		System.out.println(plan2);
		System.out.println("isSingletone: "+ctx.isSingleton("mobilePlan"));
		System.out.println("isPrototype: "+ctx.isPrototype("mobilePlan"));
	}

	@Bean
	public MobilePlan prePaid() {
		return new MobilePlan(200,"plan399",400,28);
	}
	@Bean
	public MobilePlan postPaid() {
		return new MobilePlan(300,"monthly",900,30);
	}
}
