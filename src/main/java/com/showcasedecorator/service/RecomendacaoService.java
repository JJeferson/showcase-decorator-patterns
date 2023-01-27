package com.showcasedecorator.service;

import com.showcasedecorator.model.Produto;
import com.showcasedecorator.recomendacoes.RecomendacaoInterface;
import com.showcasedecorator.recomendacoes.tipos.FundoImob;
import com.showcasedecorator.recomendacoes.tipos.Poupanca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecomendacaoService {
    RecomendacaoInterface decorator;

    public String recomendar(Produto produto){

        if(produto.getValorCompra()<100){
            RecomendacaoInterface recomendaPoupanca = new Poupanca(decorator);
            return recomendaPoupanca.recomendar(produto.getValorCompra());
        }

        if(produto.getValorCompra()>100){
            RecomendacaoInterface recomendaFundo = new FundoImob(decorator);
            return recomendaFundo.recomendar(produto.getValorCompra());
        }

        return "Não foi possivel recomendar";

    }

}
