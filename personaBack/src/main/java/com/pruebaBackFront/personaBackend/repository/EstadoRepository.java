package com.pruebaBackFront.personaBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebaBackFront.personaBackend.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}