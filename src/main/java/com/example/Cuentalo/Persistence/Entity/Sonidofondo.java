package com.example.Cuentalo.Persistence.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "soundtrack")
public class Sonidofondo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_soundtrack")
    private Integer idSountrack;
    private String autor;
    private String direccion;

}

