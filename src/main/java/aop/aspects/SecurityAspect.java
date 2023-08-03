package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

//    @Before("aop.aspects.MyPointcuts.allAddMethod()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice : Verification of rights to receive a book or journal.");
//        System.out.println("------------------------------------------------------------------------------");
//    }

    @Before("aop.aspects.MyPointcuts.allAddMethod()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice : Verification of rights to receive a book or journal.");
        System.out.println("------------------------------------------------------------------------------");
    }
}
