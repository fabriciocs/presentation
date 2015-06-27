package br.com.bestsmart.presentation.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bestsmart.presentation.model.entities.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> {

}
