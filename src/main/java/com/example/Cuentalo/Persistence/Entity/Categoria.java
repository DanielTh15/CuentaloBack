package com.example.Cuentalo.Persistence.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "")
public class Categoria {
    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;
    private String nombre;
    private String descripcion;

}
