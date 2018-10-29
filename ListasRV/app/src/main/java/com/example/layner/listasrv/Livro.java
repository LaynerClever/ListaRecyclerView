package com.example.layner.listasrv;

/**
 * Created by Layner on 10/3/2018.
 */

public class Livro {
    private String titulo;
    private String resumo;

    public Livro(String titulo, String resumo) {
        this.titulo = titulo;
        this.resumo = resumo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
