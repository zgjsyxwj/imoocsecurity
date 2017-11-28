package com.imooc.web.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class TimeAspect {
//    @Around("execution(* com.imooc.web.controller.UserController.*(..))")
//    public Object handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("time aspect start");
//        long start = new Date().getTime();
//        System.out.printf("args:"+pjp.getArgs());
//        Object object = pjp.proceed();
//        System.out.println("time aspect 耗时:" + (new Date().getTime() - start));
//        System.out.println("time aspect end");

//        return object;
//    }
}
