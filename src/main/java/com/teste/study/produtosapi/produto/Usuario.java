package com.teste.study.produtosapi.produto;

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
}
