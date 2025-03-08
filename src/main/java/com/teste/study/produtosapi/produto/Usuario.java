package com.teste.study.produtosapi.produto;

import java.util.Objects;

public class Usuario  {
    private String nome;
    private Marca marca;

    public Usuario() {

    }

    public Usuario(String nome, Marca marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && marca == usuario.marca;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, marca);
    }
}
