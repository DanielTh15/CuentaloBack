package com.example.Cuentalo.Persistence.Entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historia_categoria")
public class HistoriaCategoria {

 @EmbeddedId
 private HistoriaCategoriaPK id;



}
