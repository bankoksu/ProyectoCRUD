package com.pruebaBackFront.personaBackend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "estado")
public class Estado {

	
	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

	@ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;
    private String nombre;
    
    // Constructor por defecto (requerido por Hibernate)
    public Estado() {
    	
    }
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

    
    public Estado(Pais pais, String nombre) {
        this.pais = pais;
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
