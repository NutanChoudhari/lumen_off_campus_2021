package com.example.demo;

 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

 

import reactor.core.publisher.Flux;

 

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServiceClientApplication {

 

    WebClient client;
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceClientApplication.class, args);
        
        //ConfigurableApplicationContext ctx=SpringApplication.run(PaymentServiceClientApplication.class, args);
        
        //Flux<String> flux=Flux.just("Nishan","Shivendra","Naveen","Krishna");
        //flux.subscribe(System.out::println);
        //System.out.println("Done");
        
        //WebClient client=ctx.getBean(WebClient.class);
        
        //Flux<String> payments=client.get().uri("http://localhost:6060/payments").retrieve().bodyToFlux(String.class);
     
        //Line 27 and 24 always go together
        //payments.subscribe(System.out::println);
        
        //payments.log().subscribe(
              //  System.out::println, //onNext
             //   Throwable::printStackTrace, //onError
             //   ()-> System.out.println("completed"));  //onComplete
    }
    
    @Bean
    @LoadBalanced //Makes the client use service id instead of absolute URL
    public WebClient.Builder builder(){
        return WebClient.builder();
    }
    @Bean
    public WebClient client (WebClient.Builder builder){
        return builder.build();
    }

 

}