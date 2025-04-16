package br.com.raphaelabade.todolist.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstRoute")
public class Controller {

    @GetMapping("/firstMethod")
    public String Mensagem(){
        return "Funcionou";
    }
}

