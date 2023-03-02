package com.example.obrestDataJpa.Controller;

import com.example.obrestDataJpa.Entities.Book;
import com.example.obrestDataJpa.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

public class BookController {


    //private ApplicationContext contexto;
    BookRepository repositorio;
    public List<Book> findAll(){

    return repositorio.findAll();
    }

}
