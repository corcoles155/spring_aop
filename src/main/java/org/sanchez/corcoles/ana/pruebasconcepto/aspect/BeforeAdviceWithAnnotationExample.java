package org.sanchez.corcoles.ana.pruebasconcepto.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class BeforeAdviceWithAnnotationExample {

    @Before("@annotation(org.sanchez.corcoles.ana.pruebasconcepto.annotation.AnnotationExample)")
    public void before() {
        log.info("****** Before advice annotation example");
    }
}
