package com.example.Cuentalo.Persistence.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "soundtrack")
public class Sonidofondo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_soundtrack")
    private Integer idSoundtrack;
    private String autor;
    private String direccion;

    public Integer getIdSoundtrack() {
        return idSoundtrack;
    }

    public void setIdSoundtrack(Integer idSoundtrack) {
        this.idSoundtrack = idSoundtrack;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

