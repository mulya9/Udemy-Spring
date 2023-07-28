package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println(" I get book in UniLibrary ");
    }

    public void returnBook() {
        System.out.println("I return book in UniLibrary");

    }
    public void getMagazine() {
        System.out.println(" I get magazine in UniLibrary");
    }

    public void returnMagazine() {
        System.out.println(" I return magazine in UniLibrary");
    }

    public void addBook() {
        System.out.println(" I add book in UniLibrary");
    }

    public void addMagazine() {
        System.out.println(" I add magazine in UniLibrary");
    }
}
