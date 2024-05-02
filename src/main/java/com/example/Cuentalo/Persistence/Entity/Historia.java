package com.example.Cuentalo.Persistence.Entity;

import com.example.Cuentalo.Domain.Dto.Soundtrack;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

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
    private String idAutor;
    private Integer idSound;

    @ManyToOne
    @JoinColumn(name = "id_historiador", insertable = false, updatable = false)
    private Historiador historiador;
    @ManyToOne
    @JoinColumn(name = "id_soundtrack", insertable = false, updatable = false)
    private Sonidofondo soundtrack;

    @OneToMany(mappedBy = "historia")
    private List<HistoriaCategoria> categorias;


    public Integer getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(Integer idHistoria) {
        this.idHistoria = idHistoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public Sonidofondo getSoundtrack() {
        return soundtrack;
    }

    public void setSoundtrack(Sonidofondo soundtrack) {
        this.soundtrack = soundtrack;
    }

    public Integer getIdSound() {
        return idSound;
    }

    public void setIdSound(Integer idSound) {
        this.idSound = idSound;
    }

    public Historiador getHistoriador() {
        return historiador;
    }

    public void setHistoriador(Historiador historiador) {
        this.historiador = historiador;
    }

    public List<HistoriaCategoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<HistoriaCategoria> categorias) {
        this.categorias = categorias;
    }
}
