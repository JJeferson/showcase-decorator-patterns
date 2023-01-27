package com.showcasedecorator.controller;

import com.showcasedecorator.model.Produto;
import com.showcasedecorator.service.RecomendacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/recomendar")
public class RecomendacaoController {

    @Autowired
    RecomendacaoService service;

    @PostMapping()
    public String recomendar(@RequestBody Produto produto){
        return service.recomendar(produto);
    }


}
