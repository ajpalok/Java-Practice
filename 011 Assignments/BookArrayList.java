// You are given an ArrayList of Book objects. Each Book has attributes title, author, and pages. 
// Write a program that sorts the ArrayList of books in descending order of the number of pages. If two 
// books have the same number of pages, they should be sorted in ascending order of their authors' 
// names. 

import java.util.*;

class Book{
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}

public class BookArrayList{
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 180));
        bookList.add(new Book("The Catcher in the Rye", "J. D. Salinger", 230));
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 300));
        bookList.add(new Book("The Grapes of Wrath", "John Steinbeck", 450));
        bookList.add(new Book("The Adventures of Huckleberry Finn", "Mark Twain", 300));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 180));
        

        Comparator<Book> compare = new Comparator<>(){
            @Override
            public int compare(Book b1, Book b2){
                if(b1.pages == b2.pages){
                    return b1.author.compareTo(b2.author);
                }
                return Integer.compare(b2.pages, b1.pages);
            }
        };

        Collections.sort(bookList, compare);

        System.out.println(bookList);
    }
}