package org.sanchez.corcoles.ana.pruebasconcepto.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AfterFinallyAdviceExample {

    @After("execution(* org.sanchez.corcoles.ana.pruebasconcepto.targeobject.*.*(..))")
    public void afterFinally() {
        log.info("****** after finally advice");
    }
}
