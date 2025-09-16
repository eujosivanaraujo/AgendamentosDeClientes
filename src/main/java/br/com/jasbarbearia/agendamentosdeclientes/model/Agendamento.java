package br.com.jasbarbearia.agendamentosdeclientes.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_Agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomeDoCliente;
    private String servico;
    private int valor;
    private LocalDateTime dataHora;

    // Construtor vazio (obrigatório pelo JPA)
    public Agendamento() {}

    // Construtor com campos
    public Agendamento(String nomeDoCliente, String servico, int valor, LocalDateTime dataHora) {
        this.nomeDoCliente = nomeDoCliente;
        this.servico = servico;
        this.valor = valor;
        this.dataHora = dataHora;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeDoCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeDoCliente = nomeCliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}

