package br.com.senacrio.feiravirtual.repository;


import br.com.senacrio.feiravirtual.domain.Stand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandRepository extends JpaRepository<Stand, Integer> {

}
