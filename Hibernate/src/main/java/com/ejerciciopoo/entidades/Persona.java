package com.ejerciciopoo.entidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Persona {
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	

	public Persona() {
	}
	
	

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
