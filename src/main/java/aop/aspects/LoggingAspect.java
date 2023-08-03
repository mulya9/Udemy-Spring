package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {


//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibrary : writing # 10 ");
//    }

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


//    @Before("aop.aspects.MyPointcuts.allAddMethod()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice : I'm logging trying to get the book / magazine");
//        System.out.println("------------------------------------------------------------------------------");
//    }
    @Before("aop.aspects.MyPointcuts.allAddMethod()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Information about book : title - " + myBook.getName() +" , " +
                            " author - " + myBook.getAuthor() + " ageOfPublication - " + myBook.getYearOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("Book adding in library - " + obj);
                }
            }
        }
        System.out.println("beforeGetBookAdvice : I'm logging trying to get the book / magazine");
        System.out.println("------------------------------------------------------------------------------");
    }




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
