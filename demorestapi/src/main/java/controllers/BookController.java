package controllers;


import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.BookService;

import java.util.List;

@RestController
public class BookController {

//    @RequestMapping("/books")//used for common request
//
//   // used for single object ie single book
//    @GetMapping("/books")
//    public Book getBooks(){
//
//        Book book=new Book();
//        book.setId(101);
//        book.setAuthor("Hari");
//        book.setTitle("Haris Story");
//
//         return book;
//    }




//private BookService bookService;
//    ////used for multiple objects
//    @GetMapping("/books")
//    public List<Book> getBooks(){
//        return this.bookService.getAllBooks();
//    }
//


//////used all books
    @Autowired
   private BookService bookService;
//        =new BookService();

    @GetMapping("/getBooks")
    public List<Book> getBooks(){
        return bookService.getAllBooks();
    }


    //////used to get single book
//    private BookService bookService=new BookService();
    @GetMapping("/getBook/{id}")
    public Book getBook(@PathVariable("id")int id){
        return bookService.getBooksById(id);
    }




    ////private BookService bookService=new BookService();
    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
       Book b= bookService.addBook(book);
        return b;
    }


    @DeleteMapping("/deleteBook/{bookid}")
    public Book deleteBook(@PathVariable("bookid") int bookid){
        return bookService.deleteBook(bookid);
    }





    @PutMapping("/updateBook/{bookid}")
    public Book updateBook(@RequestBody Book book,@PathVariable("bookid") int bookid){
        return bookService.updateBook(book,bookid);
    }


}
