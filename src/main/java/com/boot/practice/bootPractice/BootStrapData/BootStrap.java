package com.boot.practice.bootPractice.BootStrapData;

import com.boot.practice.bootPractice.Repository.AuthorRepository;
import com.boot.practice.bootPractice.Repository.BookRepository;
import com.boot.practice.bootPractice.domain.Author;
import com.boot.practice.bootPractice.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public BootStrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author at = new Author("abhishek","srivastava");
        Book book =new Book("harryPotter","yes");
        at.getBook().add(book);
        book.getAuthors().add(at);
        authorRepository.save(at);
        bookRepository.save(book);

        System.out.println("no.of books"+bookRepository.count());


    }
}
