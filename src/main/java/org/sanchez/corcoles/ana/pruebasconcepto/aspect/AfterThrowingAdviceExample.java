package org.sanchez.corcoles.ana.pruebasconcepto.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AfterThrowingAdviceExample {

    @AfterThrowing("execution(* org.sanchez.corcoles.ana.pruebasconcepto.targeobject.*.*(..))")
    public void afterThrowing() {
        log.info("****** after throwing advice");
    }
}
