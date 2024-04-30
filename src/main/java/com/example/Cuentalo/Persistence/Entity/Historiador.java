package com.example.Cuentalo.Persistence.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historiador")
public class Historiador {
    @Id
    @Column(name = "id_historiador")
    private String id;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String ciudad;
    private String direccion;


}
