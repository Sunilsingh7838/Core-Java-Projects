/*
        A Library Management System capable of issuing books to the Students.
        Features of library System:-
        Book Name
        Book Author
        Issued to
        Issued on
        Students able to add Books, return issued Books,issue Books.
        Assumed that students are registered with their names in database.
         */
package com.company;
import java.util.ArrayList;

class Book {
    public String name, author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class myLibrary {
    public ArrayList<Book> books;
    public myLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book) {
        System.out.println("The Book has been added to Library.");
        this.books.add(book);
    }
    public void issueBook(Book book, String issue_to) {
        System.out.println("The Book had been issued from Library.");
        this.books.remove(book);
    }
    public void returnBook(Book b) {
        System.out.println("This Book had been returned.");
        this.books.add(b);
    }
}

public class Project_Library_Management_System {
    public static void main(String[] args) {
        ArrayList<Book> lib = new ArrayList<>();

        Book Textbook_1 = new Book("Head First Java", "Kathy Sierra");
        lib.add(Textbook_1);

        Book Textbook_2 = new Book("Core Java(TM)", "Cay S. Horstman");
        lib.add(Textbook_2);

        Book Textbook_3 = new Book("Head First Design Patterns", "Kathy Sierra");
        lib.add(Textbook_3);

        Book Textbook_4 = new Book("Effective Java", "Joshua Bloch");
        lib.add(Textbook_4);

        Book Textbook_5 = new Book("Java Concurrency in Practice", "Brian Goetz");
        lib.add(Textbook_5);

        myLibrary l = new myLibrary(lib);
        l.addBook(new Book("Head First Java_2", "Kathy Sierra"));
        System.out.println(l.books);

        l.issueBook(Textbook_2, "Sunil");
        System.out.println(l.books);

        l.issueBook(Textbook_3, "Sunil");
        System.out.println(l.books);

        l.issueBook(Textbook_5, "Sunil");
        System.out.println(l.books);

        l.returnBook(Textbook_2);
        System.out.println(l.books);

        l.returnBook(Textbook_2);
        System.out.println(l.books);

    }
}
