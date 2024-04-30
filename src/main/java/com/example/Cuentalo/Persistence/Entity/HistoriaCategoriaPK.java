package com.example.Cuentalo.Persistence.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class HistoriaCategoriaPK implements Serializable {

    @Column(name = "id_historia")
    private Integer idHistoria;
    @Column(name = "id_categoria")
    private Integer idCategoria;


    public Integer getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(Integer idHistoria) {
        this.idHistoria = idHistoria;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}
