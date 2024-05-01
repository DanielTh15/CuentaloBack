package com.example.Cuentalo.Persistence.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "historiador")
public class Historiador {
    @Id
    @Column(name = "id_historiador")
    private String idHistoriador;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String ciudad;
    private String direccion;


    public String getIdHistoriador() {
        return idHistoriador;
    }

    public void setIdHistoriador(String idHistoriador) {
        this.idHistoriador = idHistoriador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
