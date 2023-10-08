package unip.alpoo.atividade01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello(@RestParem(name = "nome") String nome){
        return "Olá, Vanessa" + nome;
    }
    
}
