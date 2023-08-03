package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

//    @Before("aop.aspects.MyPointcuts.allAddMethod()")
//    public void beforeGetExceptionHandlingAdvise() {
//        System.out.println("beforeGetExceptionHandlingAdvise : try/catch exception at try get book / magazine");
//        System.out.println("------------------------------------------------------------------------------");
//    }
    @Before("aop.aspects.MyPointcuts.allAddMethod()")
    public void beforeAddExceptionHandlingAdvise() {
        System.out.println("beforeGetExceptionHandlingAdvise : try/catch exception at try get book / magazine");
        System.out.println("------------------------------------------------------------------------------");
    }

}
