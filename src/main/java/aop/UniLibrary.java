package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println(" I get book in UniLibrary ");
        System.out.println("----------------------------------");
    }

    public void returnBook() {
        System.out.println("I return book in UniLibrary");
        System.out.println("----------------------------------");
    }
    public void getMagazine() {
        System.out.println(" I get magazine in UniLibrary");
        System.out.println("----------------------------------");
    }

    public void returnMagazine() {
        System.out.println(" I return magazine in UniLibrary");
        System.out.println("----------------------------------");
    }

    public void addBook(String name, Book book) {
        System.out.println(" I add book in UniLibrary");
        System.out.println("----------------------------------");
    }

    public void addMagazine() {
        System.out.println(" I add magazine in UniLibrary");
        System.out.println("----------------------------------");
    }
}
