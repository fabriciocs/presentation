package br.com.bestsmart.presentation.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bestsmart.presentation.model.entities.Scheduling;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling, Integer> {

}
