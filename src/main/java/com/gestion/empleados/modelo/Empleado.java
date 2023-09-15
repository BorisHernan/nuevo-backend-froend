package com.gestion.empleados.modelo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UnidadOperativa")
@Data
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name",length = 120, nullable = false)
	private String name;

	@Column(name = "director",length = 120, nullable = false)
	private String director;

	@Column(name = "telephone",length = 120, nullable = false)
	private String telephone;


	@Column(name = "address",length = 120, nullable = false)
	private String address;

	@Column(name = "department",length = 120, nullable = false)
	private String department;

	@Column(name = "active",length = 120, nullable = false)
	private String active;

	public Empleado() {
		this.active = "A";
	}

	public Empleado(Long id, String name, String director, String telephone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.director = director;
		this.telephone = telephone;
		this.address = address;
		this.active = "A";
	}

}
