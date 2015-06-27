package br.com.bestsmart.presentation.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bestsmart.presentation.model.entities.Credencial;

@Repository
public interface CredencialRepository extends JpaRepository<Credencial, Integer> {

}
