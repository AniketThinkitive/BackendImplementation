package service;

import entity.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Component
public class BookService {
    private static List<Book> list=new ArrayList<>();

    static{
        list.add(new Book(101,"Hari","Haris Story"));
        list.add(new Book(102,"Om","Oms Story"));
        list.add(new Book(103,"Om","Oms Story"));
        list.add(new Book(104,"Om","Oms Story"));
        list.add(new Book(105,"Om","Oms Story"));
    }

    ////get ALL books

    public List<Book> getAllBooks(){

        return list;
    }



    ////get single books
//    public Book getBooksById(int id){
//        //simple use for /if
//        Book book=list.stream().filter(e->e.getId()==id).findFirst().get();
//    return book;
//    }


    public Book getBooksById(int id) {
        //simple use for /if
        for (Book book : list) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    //////adding the book
    //////noraml
//    public void addBook(Book b){
//        list.add(b);
//    }


////////return TYPR
    public Book addBook(Book b){
        list.add(b);
        return b;
    }


    public Book deleteBook(int bookid){
        for (Book book : list) {
            if (book.getId() == bookid) {
                list.remove(book);
                return book;
            }
        }
        return null;
    }


    public Book updateBook(Book book,int bookid){
        for (Book bk : list) {
            if (bk.getId() == bookid) {
                 bk.setTitle(book.getTitle());
                 bk.setAuthor(book.getAuthor());
                return bk;
            }
        }
        return null;
    }



}
