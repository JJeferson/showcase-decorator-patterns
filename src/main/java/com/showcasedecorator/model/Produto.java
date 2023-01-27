package com.showcasedecorator.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Produto {
    private int idCompra;
    private String nomeProduto;
    private Double valorCompra;
}
