package br.com.jasbarbearia.agendamentosdeclientes.repository;

import br.com.jasbarbearia.agendamentosdeclientes.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados no futuro
}

