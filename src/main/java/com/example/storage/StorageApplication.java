package com.example.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StorageApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StorageApplication.class, args);
        BookRepository bookRepository = context.getBean(BookRepository.class);
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", "Greg", 2002, 312);
        bookRepository.save(book1);
        Book book2 = new Book("Wilk z Wallstreet", "Jordan Belfort", "Świat Książki", 2014, 512);
        bookRepository.save(book2);

        System.out.println(book1.getAuthor());
    }

}