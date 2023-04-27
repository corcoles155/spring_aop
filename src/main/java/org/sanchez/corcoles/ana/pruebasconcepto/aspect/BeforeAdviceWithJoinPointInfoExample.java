package org.sanchez.corcoles.ana.pruebasconcepto.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

@Slf4j
@Aspect
@Component
public class BeforeAdviceWithJoinPointInfoExample {

    @Before("execution(* org.sanchez.corcoles.ana.pruebasconcepto.targeobject.*.*(..))")
    public void before(JoinPoint joinPoint) {
        final Signature signature = joinPoint.getSignature();
        log.info("****** Before advice with join point info - Is public: {}", Modifier.isPublic(signature.getModifiers()));
        log.info("****** Before advice with join point info - Name: {}", signature.getName());
        log.info("****** Before advice with join point info - Return type: {}", signature.getDeclaringTypeName());
        log.info("****** Before advice with join point info - Args: {}", joinPoint.getArgs());
    }
}
