package org.sanchez.corcoles.ana.pruebasconcepto.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AfterReturningAdviceExample {

    @AfterReturning("execution(* org.sanchez.corcoles.ana.pruebasconcepto.targeobject.*.*(..))")
    public void afterReturning() {
        log.info("****** after returning advice");
    }
}
