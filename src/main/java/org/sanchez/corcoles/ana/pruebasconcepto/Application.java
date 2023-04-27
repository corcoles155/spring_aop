package org.sanchez.corcoles.ana.pruebasconcepto;

import lombok.extern.slf4j.Slf4j;
import org.sanchez.corcoles.ana.pruebasconcepto.targeobject.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Application.class, args);
        final HelloWorld service = (HelloWorld) configurableApplicationContext.getBean("helloWorld");
        final String message = "¡¡¡Hello world!!!";
        //final String message = null;
        try {
            service.print(message);
            service.sum(3, 5);
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }
}
