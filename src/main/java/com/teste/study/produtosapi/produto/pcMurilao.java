package com.teste.study.produtosapi.produto;

public class pcMurilao extends Produto{


    public pcMurilao(PecaPc peca) {
        super(peca);
        setNome("PC Gamer");
        setConteudo("PC Gamer potente para jogos! ");
        setTipoProduto(tipoProduto.GAMER);
        setMarcaProd(Marca.PICHAU);

    }
}
