package br.com.luanasantos.ordemservico.departamento.repositories;

import br.com.luanasantos.ordemservico.departamento.domain.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
