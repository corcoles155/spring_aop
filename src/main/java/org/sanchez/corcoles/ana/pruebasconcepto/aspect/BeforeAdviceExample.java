package org.sanchez.corcoles.ana.pruebasconcepto.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class BeforeAdviceExample {

    @Before("org.sanchez.corcoles.ana.pruebasconcepto.pointcut.PointcutExample.servicePointcut()")
    public void before() {
        log.info("****** Before advice");
    }
}
