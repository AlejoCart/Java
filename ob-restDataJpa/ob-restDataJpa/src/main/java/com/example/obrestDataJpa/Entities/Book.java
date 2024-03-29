package com.example.obrestDataJpa.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String autor;
    private Integer pagesNum;
    private double price;
    private boolean available;
    private Integer stock;
    private LocalDate releaseDate;

}
