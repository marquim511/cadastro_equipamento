package com.escola.CadastroDeEquipamentos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
    public class cadastroController{

    }
    @GetMapping
    public String imprimir(){
        System.out.println("chegou aqui a requisição");
        return"OKOK";

    }

    @PostMapping(value = "/api/cadastro")
    public void salvarCadastro(CadastroDto professorDto){
        System.out.println("Chegando até aqui...");


    }