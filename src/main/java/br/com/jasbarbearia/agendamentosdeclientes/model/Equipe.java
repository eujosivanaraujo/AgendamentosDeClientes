package br.com.jasbarbearia.agendamentosdeclientes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "tb_Equipe")
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String barbeiro;

    // Construtor vazio (Obrigatorio pelo JPA)
    public Equipe() {}

    // Construtor com campos
    public Equipe(String barbeiro) {
        this.barbeiro = barbeiro;
    }

    public String getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(String barbeiro) {
        this.barbeiro = barbeiro;
    }

    


}
