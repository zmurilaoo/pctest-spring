package com.teste.study.produtosapi.configuration;

import com.teste.study.produtosapi.produto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class produtoConfiguration {


    @Bean
    public PecaPc pecaPc(PecaPc peca){
        peca.setPlacaMae("B450M");
        peca.setProcessador("RYZER 5 SUPER");
        peca.setFonte("Fonte Corsair RM850x");
        peca.setColler(3);
        peca.setPenteMemoria(2);
        peca.setPlacaVideo("RTX-3060");


        return peca;
    }

}
