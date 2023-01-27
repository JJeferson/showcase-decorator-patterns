package com.showcasedecorator.recomendacoes.tipos;

import com.showcasedecorator.recomendacoes.RecomendacaoInterface;

public class Poupanca implements RecomendacaoInterface {

    private RecomendacaoInterface decorator;

    public Poupanca (RecomendacaoInterface recomendacaoInterface) {
        this.decorator = recomendacaoInterface;
    }

    @Override
    public String recomendar(Double valor) {
        return "Aqui houve um processamento e foi escolhida melhor poupança para recomendar baseada no valor";
    }
}
