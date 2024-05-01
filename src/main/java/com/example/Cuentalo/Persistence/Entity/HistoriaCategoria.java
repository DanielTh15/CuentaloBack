package com.example.Cuentalo.Persistence.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "historia_categoria")
public class HistoriaCategoria {

 @EmbeddedId
 private HistoriaCategoriaPK id;
 @ManyToOne
 @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
 private Categoria categoria;
 @ManyToOne
 @JoinColumn(name = "id_historia", insertable = false, updatable = false)
 private Historia historia;


 public HistoriaCategoriaPK getId() {
  return id;
 }

 public void setId(HistoriaCategoriaPK id) {
  this.id = id;
 }

 public Categoria getCategoria() {
  return categoria;
 }

 public void setCategoria(Categoria categoria) {
  this.categoria = categoria;
 }

 public Historia getHistoria() {
  return historia;
 }

 public void setHistoria(Historia historia) {
  this.historia = historia;
 }
}
