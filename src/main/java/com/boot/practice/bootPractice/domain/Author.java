package com.boot.practice.bootPractice.domain;

import java.util.Set;

public class Author {
    private String firstName;
    private String lastname;
    private Set<Book> book;

    public Author(String firstName, String lastname, Set<Book> book) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.book = book;
    }
    public Author()
    {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}
