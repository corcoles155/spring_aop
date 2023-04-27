package org.sanchez.corcoles.ana.pruebasconcepto.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutExample {

    @Pointcut("execution(* org.sanchez.corcoles.ana.pruebasconcepto.targeobject.*.*(..))")
    public void servicePointcut() {
    }

}
