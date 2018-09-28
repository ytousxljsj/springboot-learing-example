package com.gj;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Spring1BootQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring1BootQuickstartApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("来看看springboot在启动的时候为我们注入了哪些bean");
            String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanDefinitionNames);
            for (String beanDefinitionName : beanDefinitionNames) {
                System.out.println(beanDefinitionName);
            }
        };
    }
}
