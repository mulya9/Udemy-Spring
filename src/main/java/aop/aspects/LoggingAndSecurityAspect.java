package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {


    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {}

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {}

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary() {
        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibrary : writing # 10 ");
    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodFromUniLibrary() {}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodFromUniLibrary() {}
//
//    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
//    private void allGetAndReturnMethodFromUniLibrary() {
//
//    }
//
//
//    @Before("allGetMethodFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice : writing Log #1 ");
//    }
//
//    @Before("allReturnMethodFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice : writing Log #2 ");
//    }
//
//    @Before("allGetAndReturnMethodFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice : writing Log #3");
//    }








//    @Before("execution(public void aop.UniLibrary.getBook())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice : I'm trying to get the book.");
//    }
//    @Pointcut("execution(* get*())")
//    private void allGetMethod() {}
//
//    @Before("allGetMethod()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice : I'm trying to get the book / magazine");
//    }
//
//    @Before("allGetMethod()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice : Verification of rights to receive a book or journal.");
//    }

//    @Before("execution(public void *(*))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice : I'm trying to get the book.");
//}

//    @Before("execution(public void *(..))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice : I'm trying to get the book.");
//    }

//    @Before("execution( * returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice : I'm trying to return the book.");
//
//    }
}
