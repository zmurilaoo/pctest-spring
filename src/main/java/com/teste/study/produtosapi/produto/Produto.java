package com.teste.study.produtosapi.produto;

import javax.sound.sampled.Port;

public class Produto {
    private String nome;
    private String conteudo;
    private Marca marcaProd;
    private tipoProduto tipoProduto;
    private PecaPc peca;
    private Double preco;

    public Produto(String nome, String conteudo, Marca marcaProd, com.teste.study.produtosapi.produto.tipoProduto tipoProduto, Double preco) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.marcaProd = marcaProd;
        this.tipoProduto = tipoProduto;
        this.preco = preco;
    }

    public Produto(PecaPc peca) {
        this.peca = peca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Marca getMarcaProd() {
        return marcaProd;
    }

    public void setMarcaProd(Marca marcaProd) {
        this.marcaProd = marcaProd;
    }

    public com.teste.study.produtosapi.produto.tipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(com.teste.study.produtosapi.produto.tipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ConferirPC conferir(Usuario usuario) {
        if (usuario.getMarca() != getMarcaProd()) {
            return new ConferirPC("Opps! Parece que esse produto não é seu! Sinto muito.");
        }
        return new ConferirPC("Produto vendido com sucesso");
    }
}
