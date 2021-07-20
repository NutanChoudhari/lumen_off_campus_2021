package com.example.demo;

import org.module.first.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerService;
import com.example.demo.model.Invoice;
import com.example.demo.model.InvoiceWithSetterDI;
import com.example.demo.model.Product;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.demo","org.module.first"})
public class SpringQuickstartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringQuickstartApplication.class, args);
//		Product product1=ctx.getBean("tv", Product.class);
//		System.out.println(product1);
//		Product product2=ctx.getBean("fridge", Product.class);
//		System.out.println(product2);
//		
//		Invoice inv=ctx.getBean(Invoice.class);
//		System.out.println(inv);
//		
//		InvoiceWithSetterDI inv2=ctx.getBean(InvoiceWithSetterDI.class);
//		System.out.println(inv2);
		CustomerService service=ctx.getBean(CustomerService.class);
		service.getCustList().forEach(System.out::println);
		
		System.out.println(ctx.getBean(Student.class));
		ctx.close();
	}

	@Bean
	@Primary
	public Product tv() {
		return new Product(101,"tv",34000);
		
	}
	
	@Bean
	public Product fridge() {
		return new Product(102,"fridge",24000);
		
	}
	
	@Bean
	@Primary
	public Customer ram() {
		return new Customer(102,"fani",988233);
	}
	@Bean
	public Customer suresh() {
		return new Customer(103,"suresh",9888233);
	}
	@Bean
	public Customer mangesh() {
		return new Customer(104,"mangesh",9988233);
	}
	
}
