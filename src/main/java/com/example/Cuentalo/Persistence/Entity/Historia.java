package com.example.Cuentalo.Persistence.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "historia")
public class Historia {
    @Id
    @Column(name = "id_historia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHistoria;
    private String titulo;
    private String contenido;
    private LocalDateTime fecha;
    private String idHistoriador;
    private Integer idSoundtrack;


}
