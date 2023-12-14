package com.ibm.controllers;

import com.ibm.enity.Book;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping(consumes = {"application/json"}, produces = {"application/json"})
    public Book createBook(@RequestBody Book book) {
        System.out.println(book.getBookName() + book.getAuthorName() + book.getISBNNumber());
        return book;
    }
}
