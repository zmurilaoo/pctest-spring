package com.teste.study.produtosapi.api;


import com.teste.study.produtosapi.produto.ConferirPC;
import com.teste.study.produtosapi.produto.PecaPc;
import com.teste.study.produtosapi.produto.Produto;
import com.teste.study.produtosapi.produto.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")


public class ProdutoController {

    @Autowired
    private PecaPc peca;

    @PostMapping
    public ConferirPC EnviarDados(@RequestBody Usuario usuario) {
        var pc = new Produto(peca);
        return pc.conferir(usuario);

    }

}
