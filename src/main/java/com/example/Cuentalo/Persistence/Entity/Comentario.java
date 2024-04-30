package com.example.Cuentalo.Persistence.Entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @Column(name = "id_comentario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCometario;
    private String contenido;
    private Integer idHistoria;
}
