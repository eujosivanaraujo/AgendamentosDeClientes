package br.com.jasbarbearia.agendamentosdeclientes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name =  "tb_Servicos")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String corte;
    private String barba;
    private String sonbracelha;
    private String quimica;
    private String hidratacao;
    private String combo;
    private String valor;
    private String duracao;

    // Construtor vazio (Obrigatorio pelo JPA)
    public Servico() {}

    // Construtor com campos
    public Servico(Long id, String corte, String barba, String sonbracelha, String quimica,
            String hidratacao, String combo, String valor, String duracao) {
        this.id = id;
        this.corte = corte;
        this.barba = barba;
        this.sonbracelha = sonbracelha;
        this.quimica = quimica;
        this.hidratacao = hidratacao;
        this.combo = combo;
        this.valor = valor;
        this.duracao = duracao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public String getBarba() {
        return barba;
    }

    public void setBarba(String barba) {
        this.barba = barba;
    }

    public String getSonbracelha() {
        return sonbracelha;
    }

    public void setSonbracelha(String sonbracelha) {
        this.sonbracelha = sonbracelha;
    }

    public String getQuimica() {
        return quimica;
    }

    public void setQuimica(String quimica) {
        this.quimica = quimica;
    }

    public String getHidratacao() {
        return hidratacao;
    }

    public void setHidratacao(String hidratacao) {
        this.hidratacao = hidratacao;
    }

    public String getCombo(String combo) {
        return combo;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }





}
