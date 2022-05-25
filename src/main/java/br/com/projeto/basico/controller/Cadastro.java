package br.com.projeto.basico.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cadastros")
@RestController
public class Cadastro {

    @GetMapping
    public ResponseEntity<String> listaDeUsuarios(){
        return ResponseEntity.status(200).body("Ainda não temos nenhum registro ativo.");
    }

}
