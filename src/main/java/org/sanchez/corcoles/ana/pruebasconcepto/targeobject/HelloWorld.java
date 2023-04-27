package org.sanchez.corcoles.ana.pruebasconcepto.targeobject;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.sanchez.corcoles.ana.pruebasconcepto.annotation.AnnotationExample;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloWorld {

    public void print(final String message) {
        if (Strings.isEmpty(message)) {
            throw new IllegalArgumentException("Message can't be empty");
        }
        log.info(message);
    }

    @AnnotationExample
    public void sum(final int a, final int b) {
        log.info("Sum result is {}", a+b);
    }
}
