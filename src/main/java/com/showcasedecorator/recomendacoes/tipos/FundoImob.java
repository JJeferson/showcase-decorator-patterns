package com.showcasedecorator.recomendacoes.tipos;

import com.showcasedecorator.recomendacoes.RecomendacaoInterface;

public class FundoImob  implements RecomendacaoInterface {

    private RecomendacaoInterface decorator;

    public FundoImob (RecomendacaoInterface recomendacaoInterface) {
        this.decorator = recomendacaoInterface;
    }

    @Override
    public String recomendar(Double valor) {
        return "Aqui houve um processamento e foi escolhido melhor fundopara recomendar";
    }
}
