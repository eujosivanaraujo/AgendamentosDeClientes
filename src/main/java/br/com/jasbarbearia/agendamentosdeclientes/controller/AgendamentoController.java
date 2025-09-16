package br.com.jasbarbearia.agendamentosdeclientes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AgendamentoController {

    @GetMapping("/agendamentos")
    public String agendamento() {
        return "Testando se a API de agendamento estar funcionando!";
    }
}

