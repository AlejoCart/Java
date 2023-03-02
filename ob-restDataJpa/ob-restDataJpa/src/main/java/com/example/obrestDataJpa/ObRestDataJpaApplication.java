package com.example.obrestDataJpa;

import com.example.obrestDataJpa.Controller.BookController;
import com.example.obrestDataJpa.Controller.HelloWorldController;
import com.example.obrestDataJpa.Entities.Book;
import com.example.obrestDataJpa.Repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloWorldController.class)
public class ObRestDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext contexto=SpringApplication.run(ObRestDataJpaApplication.class, args);

		BookRepository bookRepository= contexto.getBean(BookRepository.class);

		//CRUD (Service en la siguiente sesion)
		//Create
		Book libroAux= new Book(null,"El mejor libro del mundo","Paulo Coelo",554,69.99,true,100, LocalDate.of(2025,12,24));
		//Update
		bookRepository.save(libroAux);
		//Read
		//System.out.println(bookRepository.findAll());
		//Delete
		//bookRepository.deleteAll();
		//System.out.println("Libros: "+bookRepository.findAll());

		//BookController controlador= new BookController();
		//controlador.findAll();


	}

}
