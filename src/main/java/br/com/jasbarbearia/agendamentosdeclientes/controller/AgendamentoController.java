package br.com.jasbarbearia.agendamentosdeclientes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.jasbarbearia.agendamentosdeclientes.model.Agendamento;
import br.com.jasbarbearia.agendamentosdeclientes.repository.AgendamentoRepository;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/agendamento") // É a ROTA
public class AgendamentoController {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @PostMapping // Mandar as informações
    public Agendamento CriarAgendamento(@RequestBody Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @GetMapping // Pegar as informações
    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Agendamento buscarAgendamento(@PathVariable Long id) {
        return agendamentoRepository.findById(id).orElse(null);
    }

    @PutMapping // Alterar as informações
    public Agendamento atualizarAgendamento(@PathVariable Long id,
            @RequestBody Agendamento agendamento) {
        Agendamento existente = agendamentoRepository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNomeCliente(agendamento.getNomeCliente());
            existente.setEmail(agendamento.getEmail());
            return agendamentoRepository.save(existente);
        }
        return null;
    }

    @DeleteMapping("{id}")
    public void deletarAgendamento(@PathVariable Long id) {
        agendamentoRepository.deleteById(id);
    }
}

