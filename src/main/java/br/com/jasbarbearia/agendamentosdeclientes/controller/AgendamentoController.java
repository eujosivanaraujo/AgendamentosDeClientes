package br.com.jasbarbearia.agendamentosdeclientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.jasbarbearia.agendamentosdeclientes.model.Agendamento;
import br.com.jasbarbearia.agendamentosdeclientes.repository.AgendamentoRepository;

@RestController
@RequestMapping("/api/agendamento")
public class AgendamentoController {

    @GetMapping("/agendamentos")
    public String agendamento() {
        return "Testando se a API de agendamento estar funcionando!";
    }
}

