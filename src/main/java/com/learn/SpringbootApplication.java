package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
@EnableCaching
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =  SpringApplication.run(SpringbootApplication.class, args);
        //context.getBean(WebConfig.class).show();
        //context.getBean(DataSourceProperties.class).show();
        //context.getBean(JavaMailComponent.class).sendMail("649480725@qq.com");
    }
}
