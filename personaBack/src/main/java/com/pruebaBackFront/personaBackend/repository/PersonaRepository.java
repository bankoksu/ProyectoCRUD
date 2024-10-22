package com.pruebaBackFront.personaBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebaBackFront.personaBackend.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}

