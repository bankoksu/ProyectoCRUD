package com.pruebaBackFront.personaBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "pais")
public class Pais {
	
	 	@Id
	    @GeneratedValue (strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nombre;

	    // Constructor por defecto (requerido por Hibernate)
	    public Pais() {
	    }

	    public Pais(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    public String getNombre() {
	        return nombre;
	    }
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

		public Long getId() {
			// TODO Auto-generated method stub
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}


}
