package com.aditya.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger( LoggingAspect.class );

    @Before( "execution(*  com.aditya.spring_boot_rest.service.JobService.getJob(..)) || execution(*  com.aditya.spring_boot_rest.service.JobService.updateJob(..))" )
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info( "Method called " + jp.getSignature().getName() );
    }

    @After( "execution(*  com.aditya.spring_boot_rest.service.JobService.getJob(..)) || execution(*  com.aditya.spring_boot_rest.service.JobService.updateJob(..))" )
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info( "Method executed " + jp.getSignature().getName() );
    }

    @AfterThrowing( "execution(*  com.aditya.spring_boot_rest.service.JobService.getJob(..)) || execution(*  com.aditya.spring_boot_rest.service.JobService.updateJob(..))" )
    public void logMethodCrashed(JoinPoint jp) {
        LOGGER.info( "Method has some issues " + jp.getSignature().getName() );
    }

    @AfterReturning( "execution(*  com.aditya.spring_boot_rest.service.JobService.getJob(..)) || execution(*  com.aditya.spring_boot_rest.service.JobService.updateJob(..))" )
    public void logMethodReturning(JoinPoint jp) {
        LOGGER.info( "Method Executed successfully " + jp.getSignature().getName() );
    }



}
